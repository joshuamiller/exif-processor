(ns exif-processor.core-test
  (:require [exif-processor.core :refer :all]
            [clojure.test :refer :all]
            [clojure.java.io :as io]))

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
    (let [result (exif-for-url "https://pbs.twimg.com/media/C46dhdwVMAAaYMI.jpg")]
      (is (= "Progressive, Huffman" (get result "Compression Type"))))))
