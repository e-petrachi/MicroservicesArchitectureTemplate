#!/bin/bash

echo 'Starting brands-info application as a stack'

#source "docker.env"

export DOCKER_HOST=tcp://swarm.inf.uniroma3.it:2376
export DOCKER_CERT_PATH=../swarm.inf.uniroma3.it/resources/certs
export DOCKER_TLS_VERIFY=1

docker stack deploy --compose-file docker-stack-brands-swarm.yml brands_info-9003
