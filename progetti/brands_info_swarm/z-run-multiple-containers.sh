#!/bin/bash

docker network create eureka-net

# esegue piu' container di ogni tipo (tranne eureka e zuul)

# docker run -d --network=eureka-net -p 8761:8761 --name=eureka eureka-server-img
docker run -d --network=eureka-net --name=eureka eureka-9003

docker run -d --network=eureka-net --name=brands-famous-1 brands-famous-9003
docker run -d --network=eureka-net --name=brands-sales-1 brands-sales-9003

docker run -d --network=eureka-net --name=brands-1 brands-9003
docker run -d --network=eureka-net --name=brands-2 brands-9003

docker run -d --network=eureka-net -p 9003:8080 --name=zuul zuul-9003 
