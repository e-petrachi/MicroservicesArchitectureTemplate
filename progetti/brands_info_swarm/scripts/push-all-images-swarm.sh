#!/bin/bash


export DOCKER_HOST=tcp://swarm.inf.uniroma3.it:2376
export DOCKER_CERT_PATH=../swarm.inf.uniroma3.it/resources/certs
export DOCKER_TLS_VERIFY=1

DOCKER_REGISTRY=swarm.inf.uniroma3.it:5000

docker push ${DOCKER_REGISTRY}/eureka-9003
docker push ${DOCKER_REGISTRY}/brands-sales-9003
docker push ${DOCKER_REGISTRY}/brands-famous-9003
docker push ${DOCKER_REGISTRY}/brands-9003
docker push ${DOCKER_REGISTRY}/zuul-9003
