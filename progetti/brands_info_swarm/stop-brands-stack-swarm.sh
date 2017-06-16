#!/bin/bash

echo 'Removing brands-info application as a stack'

source "docker.env"

docker stack rm brands_info-9003
