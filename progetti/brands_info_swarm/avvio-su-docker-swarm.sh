#!/bin/bash

echo ""
echo "-------- Build delle immagini sullo swarm --------"
echo ""
sh scripts/build-all-images-docker-swarm.sh
echo ""
echo "-------- Avvio del registro sullo swarm --------"
echo ""
sh scripts/start-docker-registry.sh
echo ""
echo "-------- Push delle immagini sul registro --------"
echo ""
sh scripts/push-all-images-docker-swarm.sh
echo ""
echo "-------- Start dello stack sullo swarm --------"
echo ""
sh scripts/start-brands-stack.sh
