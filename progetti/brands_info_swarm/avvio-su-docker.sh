#!/bin/bash

echo ''
echo 'Build dei progetti con Gradle'
echo ''
sh build-all-project.sh
echo ''
echo 'Build delle immagini con Docker'
echo ''
sh build-all-images.sh
echo ''
echo 'Avvio dei container senza copie'
echo ''
sh run-all-containers.sh
