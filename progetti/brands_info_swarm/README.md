Applicazione multi-servizi e multi-contenitore rilasciata sullo swarm docker swarm.inf.uniroma3.it.

Questa applicazione è accessibile al link http://swarm.inf.uniroma3.it:9003/

# Esecuzione sul nodo **docker** #

1. Avviare la macchina virtuale **docker**
2. Collegarsi via ssh alla macchina virtuale appena creata
3. Da dentro la macchina spostarsi nella directory **brands_info_swarm**

4. Avviare i passi sotto col lo script `$ sh avvio-su-docker.sh`
>4. Eseguire il BUILD di tutti i progetti con lo script **build-all-project.sh**
>5. Eseguire il BUILD di tutte le immagini con lo script **build-all-images.sh**
>6. Avviare i CONTAINER con lo script **z-run-all-containers.sh** o con **z-run-multiple-containers.sh**

7. Attendere qualche minuto e collegarsi via browser all'indirizzo `http://localhost:9003`
99. Stoppare l'esecuzione dei container con, rispettivamente, lo script **z-stop-all-container.sh** oppure **z-stop-multiple-containers.sh**

# Esecuzione sui nodi **docker-swarm** #

1. Avviare la macchina virtuale **docker-swarm** che creerà a sua volta **swarm-1** **swarm-2** **swarm-3**
2. Effettuare il RELOAD delle macchine con il comando ’$ vagrant reload’
3. Collegarsi via ssh alla macchina virtuale **swarm-1** appena creata
4. N.B. Si presuppone che le BUILD di tutti i progetti siano già state fatte, in quanto all'interno di queste macchine non è installato **Gradle**, se così non fosse compilarle esternamente da terminale
5. N.B. I passi 6 e 7 vanno eseguiti solo la prima volta che si creano i nodi del **dosker-swarm**
6. Rendere la macchina **swarm-1** il manager con il comando `$ docker swarm init --advertise-addr 10.11.1.71`
7. Verrà dato in output una serie di comandi il primo del quale dovra essere eseguito sulla stessa macchina e cioè del tipo `$ docker swarm join-token worker` mentre gli altri dovranno essere eseguiti sulle altre macchine **swarm-2** e **swarm-3** collegandosi ad esse via ssh e, nello specifico, sarà del tipo `$ docker swarm join \
    --token SWMTKN-1-2naklwnaijed1ytyybs5mpsnxpnzrdo8vgk6th4fmtf5gzivy4-24pfqjyz6o8qjy1xi7cew1ei3 \
    10.11.1.71:2377`
8. Ritornare alla macchina **swarm-1** e spostarsi nella directory **brands_info_swarm**

9. Avviare i passi sotto col lo script `$ sh avvio-su-docker-swarm.sh`
>9. Eseguire il BUILD di tutte le immagini con lo script **build-all-images-swarm.sh**
>10. Avviare il REGISTRY con lo script **start-docker-registry.sh**
>11. Spingere le immagini al registry con lo script **push-all-images-swarm.sh**
>12. Avviare lo STACK con lo script **start-brands-stack.sh**

13. Attendere un paio di minuti e collegarsi via browser all'indirizzo `http://localhost:8081`
99. Stoppare l'esecuzione dello STACK con lo script **stop-brands-stack.sh**
