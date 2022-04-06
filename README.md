# exif-processor

A lightweight wrapper around the exif-processing functionality of 
[metadata-extractor](https://github.com/drewnoakes/metadata-extractor).

## Installation

In your `project.clj` or `build.boot`:

`[io.joshmiller/exif-processor "0.2.0"]`

## Usage

```clojure
user> (use 'exif-processor.core)
user> (exif-for-url "https://upload.wikimedia.org/wikipedia/commons/3/3d/Solmeta_Geotagger_N2_Kompass_GPS_on_Nikon_D300.jpg")
{"Compression Type" "Progressive, Huffman",
 "FlashPix Version" "1.00",
 "Custom Rendered" "Normal process",
 "Component 2"
 "Cb component: Quantization table 1, Sampling factors 1 horiz/1 vert",
 "Software" "Adobe Photoshop CS2 Windows",
 "Resolution Units" "inch",
 "Color Space" "sRGB",
 "Orientation" "Top, left side (Horizontal / normal)",
 "Image Description" "OLYMPUS DIGITAL CAMERA         ",
 "F-Number" "f/8.0",
 "Data Precision" "8 bits",
 "White Balance Mode" "Auto white balance",
 "Date/Time Digitized" "2009:02:18 17:58:26",
 "File Source" "Digital Still Camera (DSC)",
 "Sharpness" "None",
 "Saturation" "None",
 "Make" "OLYMPUS CORPORATION",
 "Component 1"
 "Y component: Quantization table 0, Sampling factors 1 horiz/1 vert",
 "Scene Type" "Directly photographed image",
 "Scene Capture Type" "Standard",
 "ISO Speed Ratings" "80",
 "Contrast" "None",
 "Exif Version" "2.20",
 "Metering Mode" "Multi-segment",
 "Exposure Mode" "Auto exposure",
 "Gain Control" "None",
 "Thumbnail Offset" "1282 bytes",
 "Image Width" "1695 pixels",
 "Compressed Bits Per Pixel" "2 bits/pixel",
 "Y Resolution" "72 dots per inch",
 "Components Configuration" "YCbCr",
 "YCbCr Positioning" "Datum point",
 "Flash" "Flash did not fire, auto",
 "Date/Time" "2013:11:17 11:31:18",
 "Model" "C5060WZ",
 "Component 3"
 "Cr component: Quantization table 1, Sampling factors 1 horiz/1 vert",
 "White Balance" "Unknown",
 "Resolution Unit" "Inch",
 "User Comment" "",
 "Image Height" "1582 pixels",
 "Date/Time Original" "2009:02:18 17:58:26",
 "X Resolution" "72 dots per inch",
 "Focal Length" "5.7 mm",
 "Thumbnail Length" "8456 bytes",
 "Exposure Time" "5/8 sec",
 "Compression" "JPEG (old-style)",
 "Thumbnail Width Pixels" "0",
 "Version" "1.2",
 "Number of Components" "3",
 "Exposure Program" "Aperture priority",
 "Exposure Bias Value" "0 EV",
 "Exif Image Width" "1695 pixels",
 "Thumbnail Height Pixels" "0",
 "Digital Zoom Ratio" "Digital zoom not used",
 "Exif Image Height" "1582 pixels",
 "Max Aperture Value" "f/2.8"}
```

## License

Copyright © 2013-2017 Joshua Miller

Distributed under the MIT License
