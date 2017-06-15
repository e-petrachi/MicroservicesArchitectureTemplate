#!/bin/bash

docker network create eureka-net

# docker run -d --network=eureka-net -p 8761:8761 --name=eureka eureka-server-img
docker run -d --network=eureka-net --name=eureka eureka-9003

docker run -d --network=eureka-net --name=brands-famous brands-famous-9003
docker run -d --network=eureka-net --name=brands-sales brands-sales-9003

docker run -d --network=eureka-net --name=brands brands-9003

docker run -d --network=eureka-net -p 9003:8080 --name=zuul zuul-9003
