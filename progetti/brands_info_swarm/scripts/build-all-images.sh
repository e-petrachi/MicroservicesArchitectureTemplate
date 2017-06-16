#!/bin/bash

docker build --rm -t eureka-9003 ./Eureka
docker build --rm -t brands-famous-9003 ./BrandsFamous
docker build --rm -t brands-sales-9003 ./BrandsSales
docker build --rm -t brands-9003 ./Brands
docker build --rm -t zuul-9003 ./Zuul
