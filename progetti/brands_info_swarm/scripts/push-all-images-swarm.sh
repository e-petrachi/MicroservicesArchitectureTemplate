#!/bin/bash

source "docker.env"

DOCKER_REGISTRY=swarm.inf.uniroma3.it:5000

docker push ${DOCKER_REGISTRY}/eureka-9003
docker push ${DOCKER_REGISTRY}/brands-sales-9003
docker push ${DOCKER_REGISTRY}/brands-famous-9003
docker push ${DOCKER_REGISTRY}/brands-9003
docker push ${DOCKER_REGISTRY}/zuul-9003
