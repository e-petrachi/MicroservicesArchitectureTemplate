#!/bin/bash

echo 'Starting brands-info application as a stack'

#source "docker.env"

docker stack deploy --compose-file docker-stack-brands.yml brands_info-9003
