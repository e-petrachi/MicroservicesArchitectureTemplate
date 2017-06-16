#!/bin/bash

DOCKER_REGISTRY=localhost:5000

docker build --rm -t ${DOCKER_REGISTRY}/eureka-9003 ./Eureka
docker build --rm -t ${DOCKER_REGISTRY}/brands-famous-9003 ./BrandsFamous
docker build --rm -t ${DOCKER_REGISTRY}/brands-sales-9003 ./BrandsSales
docker build --rm -t ${DOCKER_REGISTRY}/brands-9003 ./Brands
docker build --rm -t ${DOCKER_REGISTRY}/zuul-9003 ./Zuul
