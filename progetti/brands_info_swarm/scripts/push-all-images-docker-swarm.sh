#!/bin/bash

DOCKER_REGISTRY=localhost:5000

docker push ${DOCKER_REGISTRY}/eureka-9003
docker push ${DOCKER_REGISTRY}/brands-sales-9003
docker push ${DOCKER_REGISTRY}/brands-famous-9003
docker push ${DOCKER_REGISTRY}/brands-9003
docker push ${DOCKER_REGISTRY}/zuul-9003
