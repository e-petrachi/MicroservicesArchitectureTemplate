# brands_info

Questo progetto contiene alcune applicazioni
che esemplificano l'uso di [Spring Boot](https://projects.spring.io/spring-boot/):  

* **BrandsFamous** è un servizio che fornisce informazioni generiche (casuali) riferite ad un brand d'abbigliamento, utilizzato dal servizio **Brands**

* **BrandsSales** è un servizio che fornisce informazioni (casuali) su fatturato riferite ad un brand d'abbigliamento sia in riferimento ad un anno solare specifico che in alternativa al fatturato più alto, utilizzato dal servizio **Brands**

* **Brands** è un servizio per l'interrogazione su dati commerciali di brand d'abbigliamento, che accede i servizi **BrandsFamous** e **BrandsSales**

Le diverse applicazioni hanno una struttura simile,
e la loro costruzione ed esecuzione è descritta qui di seguito.

### Build  

La costruzione delle applicazioni viene fatta automaticamente con la creazione del nodo **dev**.

In particolare aprire una finestra terminale e posizionarsi nella directory **developer** del nodo **dev** ad esempio come:

      cd projects-ASW/ambienti/developer

E dopo eseguire il comando:

      vagrant up

Una volta avviata la macchina virtuale **dev** attendere alcuni minuti l'avvio automatico dei servizi.

Al termine dell'esecuzione eseguire lo stop del nodo **dev** con il comando:

      vagrant halt dev

### Ambiente di esecuzione

Ciascuna di queste applicazioni può essere eseguita direttamente nell'ambiente
[developer](../../ambienti/developer/), sul nodo **dev**.
In questo modo, le applicazioni web che espongono servizi alla porta **8080** del nodo **dev**
vengono anche pubblicate sulla porta **8088** dell'host, quelle che espongono servizi alla porta **8081** del nodo **dev**
vengono anche pubblicate sulla porta **8081** dell'host e quelle che espongono servizi alla porta **8082** del nodo **dev**
vengono anche pubblicate sulla porta **8082** dell'host.

#### Esecuzione dell'applicazione

Le macchine vengono eseguite in coda alla creazione del nodo **dev** e dopo alcuni minuti sono disponibili.
Su qualsiasi browser collegarsi al [URL](http://localhost:8088/) di **localhost** sulla porta **8088**.
