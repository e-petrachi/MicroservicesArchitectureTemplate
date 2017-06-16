#!/bin/bash

echo ""
echo "-------- Build delle immagini sullo swarm --------"
echo ""
sh build-all-images-swarm.sh
echo ""
echo "-------- Avvio del registro sullo swarm --------"
echo ""
sh start-docker-registry.sh
echo ""
echo "-------- Push delle immagini sul registro --------"
echo ""
sh push-all-images-swarm.sh
echo ""
echo "-------- Start dello stack sullo swarm --------"
echo ""
sh start-brands-stack.sh
