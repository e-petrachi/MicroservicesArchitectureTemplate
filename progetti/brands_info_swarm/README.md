Applicazione multi-servizi e multi-contenitore rilasciata sullo swarm docker swarm.inf.uniroma3.it.

Questa applicazione è accessibile al link http://swarm.inf.uniroma3.it:9003/

* Esecuzione sul nodo **docker**

1. Avviare la macchina virtuale **docker**
2. Collegarsi via ssh alla macchina virtuale appena creata
3. Da dentro la macchina spostarsi nella directory **brands_info_swarm**
4. Eseguire il BUILD di tutti i progetti con lo script **build-all-project.sh**
5. Eseguire il BUILD di tutte le immagini con lo script **build-all-images.sh**
6. Avviare i CONTAINER con lo script **z-run-all-containers.sh** o con **z-run-multiple-containers.sh**
7. Attendere qualche minuto e collegarsi via browser all'indirizzo http://localhost:9003
99. Stoppare l'esecuzione dei container con, rispettivamente, lo script **z-stop-all-container.sh** oppure **z-stop-multiple-containers.sh**
