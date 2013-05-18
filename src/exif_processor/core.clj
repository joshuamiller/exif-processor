(ns exif-processor.core
  (:use [clojure.string :only [join]])
  (:require [clj-http.client :as client])
  (:import [java.io BufferedInputStream]
           [com.drew.imaging ImageMetadataReader]))

(def exif-directory-regex
  (re-pattern (str "(?i)(" (join "|"
                                ["Exif" "JPEG" "JFIF"
                                 "Agfa" "Canon" "Casio" "Epson"
                                 "Fujifilm" "Kodak" "Kyocera"
                                 "Leica" "Minolta" "Nikon" "Olympus"
                                 "Panasonic" "Pentax" "Sanyo"
                                 "Sigma/Foveon" "Sony"]) ")")))

(defn- extract-from-tag
  [tag]
  (into {} (map #(hash-map (.getTagName %) (.getDescription %)) tag)))

(defn exif-for-file
  "Takes an image file (as a java.io.InputStream or java.io.File) and extracts exif information into a map"
  [file]
  (let [metadata (ImageMetadataReader/readMetadata file)
        exif-directories (filter #(re-find exif-directory-regex (.getName %)) (.getDirectories metadata))
        tags (map #(.getTags %) exif-directories)]
    (into {} (map extract-from-tag tags))))

(defn exif-for-url
  "Streams a file from a given URL and extracts exif information into a map"
  [url]
  (exif-for-file (BufferedInputStream. (:body (client/get url {:as :stream})))))
