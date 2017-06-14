#!/bin/bash

docker stop eureka
docker stop brands-famous-1
docker stop brands-sales-1
docker stop brands-1
docker stop brands-2
docker stop zuul

docker rm eureka
docker rm brands-famous-1
docker rm brands-sales-1
docker rm brands-1
docker rm brands-2 
docker rm zuul

docker network rm eureka-net
