#!/bin/bash

# source "docker.env"

#DOCKER_REGISTRY=localhost:5000
# DOCKER_REGISTRY=swarm.inf.uniroma3.it:5000

#docker build --rm -t ${DOCKER_REGISTRY}/eureka-9003 ./Eureka
#docker build --rm -t ${DOCKER_REGISTRY}/brands-famous-9003 ./BrandsFamous
#docker build --rm -t ${DOCKER_REGISTRY}/brands-sales-9003 ./BrandsSales
#docker build --rm -t ${DOCKER_REGISTRY}/brands-9003 ./Brands
#docker build --rm -t ${DOCKER_REGISTRY}/zuul-9003 ./Zuul

docker build --rm -t eureka-9003 ./Eureka
docker build --rm -t brands-famous-9003 ./BrandsFamous
docker build --rm -t brands-sales-9003 ./BrandsSales
docker build --rm -t brands-9003 ./Brands
docker build --rm -t zuul-9003 ./Zuul
