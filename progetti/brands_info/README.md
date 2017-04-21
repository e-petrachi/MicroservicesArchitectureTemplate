# brands_info

Questo progetto contiene alcune applicazioni
che esemplificano l'uso di [Spring Boot](https://projects.spring.io/spring-boot/):  

* **BrandsFamous** � un servizio che fornisce informazioni generiche (casuali) riferite ad un brand d'abbigliamento, utilizzato dal servizio **Brands**

* **BrandsSales** � un servizio che fornisce informazioni (casuali) su fatturato riferite ad un brand d'abbigliamento sia in riferimento ad un anno solare specifico che in alternativa al fatturato più alto, utilizzato dal servizio **Brands**

* **Brands** � un servizio per l'interrogazione su dati commerciali di brand d'abbigliamento, che accede i servizi **BrandsFamous** e **BrandsSales**

Le diverse applicazioni hanno una struttura simile,
e la loro costruzione ed esecuzione � descritta qui di seguito.

### Build  

Per la costruzione di ciascuna applicazione, vedere le istruzioni
descritte nella sezione [progetti/](../).

In pratica, per compilare e assemblare ciascuna applicazione, bisogna

1. posizionarsi nella cartella principale dell'applicazione di interesse - ad esempio `~/progetti/brands_info/Brands`

2. per compilare e assemblare l'applicazione, usare il comando `gradle build`

### Ambiente di esecuzione

Ciascuna di queste applicazioni pu� essere eseguita direttamente nell'ambiente
[developer](../../ambienti/developer/), sul nodo **dev**.
In questo modo, le applicazioni web che espongono servizi alla porta **8080** del nodo **dev**
vengono anche pubblicate sulla porta **8088** dell'host.

#### Esecuzione dell'applicazione

In terminali diversi, fare quanto segue:

* nella cartella principale del servizio **BrandsFamous** eseguire lo script `../run-brands-famous.sh`

* nella cartella principale del servizio **BrandsSales** eseguire lo script `../run-brands-sales.sh`

* nella cartella principale del servizio **Brands** eseguire lo script `../run-brands.sh`
