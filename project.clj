(defproject io.joshmiller/exif-processor "0.2.0"
  :description "A lightweight Clojure wrapper around the exif processing facility in Drew Noakes' metadata-extractor"
  :url "http://github.com/joshuamiller/exif-processor"
  :min-lein-version "2.1.0"
  :license {:name "The MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.drewnoakes/metadata-extractor "2.17.0"]
                 [clj-http "3.4.1"]]
  :profiles {:test {:resource-paths ["test-resources"]}})
