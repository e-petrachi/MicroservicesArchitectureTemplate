#!/bin/bash

echo ""
echo "-------- Build dei progetti in docker --------"
echo ""
sh scripts/build-all-projects.sh
echo ""
echo "-------- Build delle immagini sullo swarm --------"
echo ""
sh scripts/build-all-images-swarm.sh
echo ""
echo "-------- Push delle immagini sul registro --------"
echo ""
sh scripts/push-all-images-swarm.sh
echo ""
echo "-------- Start dello stack sullo swarm --------"
echo ""
sh scripts/start-brands-stack-swarm.sh
