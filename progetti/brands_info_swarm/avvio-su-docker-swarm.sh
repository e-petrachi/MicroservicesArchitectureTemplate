#!/bin/bash

sh build-all-images-swarm.sh
sh start-docker-registry.sh
sh push-all-images-swarm.sh
sh start-brands-stack.sh
