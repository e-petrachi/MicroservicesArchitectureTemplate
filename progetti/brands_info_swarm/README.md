# brands_info_swarm

Applicazione multi-servizi e multi-contenitore rilasciata sullo swarm docker swarm.inf.uniroma3.it.

Questa applicazione è accessibile al link http://swarm.inf.uniroma3.it:9003/

------------

### Esecuzione sul nodo **docker** ###

1. Avviare la macchina virtuale **docker**

2. Collegarsi via ssh alla macchina virtuale appena creata

3. Da dentro la macchina spostarsi nella directory **brands_info_swarm**

4. Avviare i passi sotto col lo script `$ sh avvio-su-docker.sh` oppure manualmente eseguendo i passi 5, 6 e 7
>>5. Eseguire il BUILD di tutti i progetti con lo script **build-all-project.sh**
>>6. Eseguire il BUILD di tutte le immagini con lo script **build-all-images.sh**
>>7. Avviare i CONTAINER con lo script **run-all-containers.sh** o con **run-multiple-containers.sh**

8. Attendere qualche minuto e collegarsi via browser all'indirizzo [http://localhost:9003](http://localhost:9003/)

99. Stoppare l'esecuzione dei container con, rispettivamente, lo script **stop-all-container.sh** oppure **stop-multiple-containers.sh**

-----------------

### Esecuzione sui nodi **docker-swarm** ###

1. Avviare la macchina virtuale **docker-swarm** che creerà a sua volta **swarm-1** **swarm-2** **swarm-3**

2. Effettuare il reload delle macchine con il comando `$ vagrant reload`

3. Collegarsi via ssh alla macchina virtuale **swarm-1** appena creata

4. N.B. Si presuppone che il build di tutti i progetti sia già stato fatto, in quanto all'interno di queste macchine non è installato **Gradle**, se così non fosse, effettuarlo esternamente da terminale

5. Configuare i nodi di **docker-swarm** con lo script `$ sh shared/scripts/setup-swarm.sh` N.B. Questo va fatto solo la prima volta che si creano i nodi del **docker-swarm**. Se qualcosa andasse storto si possono resettare le impostazioni con lo script `$ sh shared/scripts/remove-swarm.sh` su ogni nodo dello swarm creato.

6. Ritornare alla macchina **swarm-1** e spostarsi nella directory **brands_info_swarm**

7. Avviare REGISTRY e STACK col lo script `$ sh avvio-su-docker-swarm.sh` oppure manualmente eseguendo i passi 8, 9, 10 e 11
>>8. Eseguire il build delle immagini con lo script **build-all-images-swarm.sh**
>>9. Avviare il REGISTRY con lo script **start-docker-registry.sh**
>>10. Spingere le immagini al registry con lo script **push-all-images-swarm.sh**
>>11. Avviare lo STACK con lo script **start-brands-stack.sh**

12. Attendere un paio di minuti e collegarsi via browser all'indirizzo [http://localhost:9003](http://localhost:9003/)

99. Stoppare l'esecuzione dello STACK con lo script **stop-brands-stack.sh**
