#!/bin/bash

echo 'Starting brands-info application as a stack'

docker stack deploy --compose-file docker-stack-brands.yml brands_info-9003
