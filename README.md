# exif-processor

A lightweight wrapper around the exif-processing functionality of 
[metadata-extractor](https://github.com/drewnoakes/metadata-extractor).

## Installation

The 2.7.0 branch of metadata-extractor is required, as it fixes a bug
in processing streams. To install it:

```bash
$ git clone https://github.com/drewnoakes/metadata-extractor.git
$ cd metadata-extractor
$ mvn install
```

If you find that the build process from `mvn install` is failing because some of the tests are not passing, try this instead:

```bash
$ mvn -Dmaven.test.skip=true install
```

## Usage

```clojure
user> (use 'exif-processor.core)
user> (exif-for-url "http://farm8.staticflickr.com/7320/8747460606_96250e211e_b.jpg")
{"Image Width" "800 pixels", "Number of Components" "3", "Data
Precision" "8 bits", "Image Height" "1000 pixels", "Component 1" "Y
component: Quantization table 0, Sampling factors 1 horiz/1 vert",
"Component 2" "Cb component: Quantization table 1, Sampling factors 1
horiz/1 vert", "Component 3" "Cr component: Quantization table 1,
Sampling factors 1 horiz/1 vert", "Y Resolution" "72 dots", "X
Resolution" "72 dots", "Compression Type" "Baseline", "Version" "1.1",
"Resolution Units" "inch"}
```

## License

Copyright © 2013 Joshua Miller

Distributed under the MIT License
