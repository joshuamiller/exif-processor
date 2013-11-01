(defproject io.joshuamiller/exif-processor "0.1.1"
  :description "A lightweight Clojure wrapper around the exif processing facility in Drew Oakes' metadata-extractor"
  :url "http://github.com/joshuamiller/exif-processor"
  :min-lein-version "0.2.0"
  :license {:name "The MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [com.drewnoakes/metadata-extractor "2.7.0-SNAPSHOT"]
                 [clj-http "0.7.2"]])
