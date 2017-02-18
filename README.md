# exif-processor

A lightweight wrapper around the exif-processing functionality of 
[metadata-extractor](https://github.com/drewnoakes/metadata-extractor).

## Installation

In your `project.clj` or `build.boot`:

[io.joshmiller/exif-processor "0.2.0"]

## Usage

```clojure
user> (use 'exif-processor.core)
user> (exif-for-url "https://pbs.twimg.com/media/C46dhdwVMAAaYMI.jpg")
{"Compression Type" "Progressive, Huffman", "Component 2" "Cb component: Quantization table 1, Sampling factors 1 horiz/1 vert", "Resolution Units" "none", "Data Precision" "8 bits", "Component 1" "Y component: Quantization table 0, Sampling factors 2 horiz/2 vert", "Image Width" "768 pixels", "Y Resolution" "1 dot", "Component 3" "Cr component: Quantization table 1, Sampling factors 1 horiz/1 vert", "Image Height" "1024 pixels", "X Resolution" "1 dot", "Thumbnail Width Pixels" "0", "Version" "1.1", "Number of Components" "3", "Thumbnail Height Pixels" "0"}
```

## License

Copyright © 2013-2017 Joshua Miller

Distributed under the MIT License
