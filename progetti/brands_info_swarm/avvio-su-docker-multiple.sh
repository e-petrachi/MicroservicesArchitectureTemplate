#!/bin/bash

echo ""
echo "------- Build dei progetti con Gradle -------"
echo ""
sh scripts/build-all-projects.sh
echo ""
echo "------- Build delle immagini con Docker -------"
echo ""
sh scripts/build-all-images.sh
echo ""
echo "------- Avvio dei container con copie multiple -------"
echo ""
sh stop-multiple-containers.sh
sh stop-all-containers.sh
sh scripts/run-multiple-containers.sh
