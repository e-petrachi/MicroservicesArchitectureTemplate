#!/bin/bash

docker stop eureka
docker stop brands-famous
docker stop brands-sales
docker stop brands
docker stop zuul

docker rm eureka
docker rm brands-famous
docker rm brands-sales
docker rm brands
docker rm zuul

docker network rm eureka-net
