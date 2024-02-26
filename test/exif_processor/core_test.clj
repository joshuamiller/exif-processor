(ns exif-processor.core-test
  (:require [exif-processor.core :refer :all]
            [clojure.test :refer :all]
            [clojure.java.io :as io]
            [clojure.string :as string]))

(deftest exif-for-file-test
  (testing "returns exif info for file"
    (let [result (exif-for-file (io/file (io/resource "test-image.jpg")))]
      (is (= "Progressive, Huffman" (get result "Compression Type"))))))

(deftest exif-for-filename-test
  (testing "returns exif info from a filename"
    (let [result (exif-for-filename "test-resources/test-image.jpg")]
      (is (= "Progressive, Huffman" (get result "Compression Type"))))))

(deftest exif-for-url-test
  (testing "returns exif info from a URL"
    (let [result (exif-for-url "https://upload.wikimedia.org/wikipedia/commons/3/3d/Solmeta_Geotagger_N2_Kompass_GPS_on_Nikon_D300.jpg")]
      (is (= "Progressive, Huffman" (get result "Compression Type"))))))

(deftest exif-for-url-mov
  (testing "returns exif info from a QuickTime URL"
    (let [result (exif-for-url "https://filesamples.com/samples/video/mov/sample_640x360.mov")]
      (is (= "Fri Jan 01 01:00:00 +01:00 1904" (get result "Creation Time"))))))

(deftest exif-gps
  (testing "returns GPS exif info for file"
    (let [result (exif-for-file (io/file (io/resource "test-image-gps.jpg")))]
      (is (some? (get result "GPS Latitude")))
      (is (string/starts-with? (get result "GPS Latitude") "50")))))
