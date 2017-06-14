#!/bin/bash

gradle build -b Eureka/build.gradle
gradle build -b BrandsSales/build.gradle
gradle build -b BrandsFamous/build.gradle
gradle build -b Brands/build.gradle
gradle build -b Zuul/build.gradle
