# Docker

Ambiente di esecuzione composto da un cluster (*swarm*) di nodi Docker,
composto da tre macchine virtuali **swarm-1**, **swarm-2** e **swarm-3**.

## Descrizione delle macchine virtuali

Le tre macchine virtuali hanno la stessa struttura:

### swarm-i

La macchina virtuale **swarm-i** (10.11.1.70+i)
ha il seguente software

* Ubuntu Trusty (14.04 LTS) a 64 bit

* Docker

* Docker Compose

Configurazione di rete

* Indirizzo IP: 10.11.1.70+i (per esempio, **swarm-i** ha l'indirizzo 10.11.1.71)

* Porte pubblicate sull'host: 9003 -> 9002+i

>- swarm-1, 10.11.1.71 9003->9003 (manager e worker)
>- swarm-2, 10.11.1.72 9003->9004 (worker)
>- swarm-3, 10.11.1.73 9004->9005 (worker)

>- TCP port 2375 for the remote API
>- TCP port 2377 for cluster management communications
>- TCP and UDP port 7946 for communication among nodes
>- TCP and UDP port 4789 for overlay network traffic

## Configurazione  

Dopo aver creato l'ambiente (`vagrant up`) e dopo averlo riavviato (`vagrant reload`),
è necessario collegarsi al nodo *swarm-1* (`vagrant ssh swarm-1`)
ed eseguire (una volta per tutte) lo script `setup-swarm.sh`.
