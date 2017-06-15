# Progetti

Questa sezione contiene il codice delle *applicazioni software distribuite*.
Le diverse applicazioni distribuite sono organizzate in progetti.

## Contenuto dei progetti

Ciascun **progetto** contiene (come sotto-cartelle) una o più **applicazioni distribuite**.
Ogni applicazione distribuita è composta da uno o più **moduli**,
che danno luogo a uno o più **componenti eseguibili** dell'applicazione.

## Build  

La costruzione (build, ovvero compilazione e assemblaggio) delle applicazioni
viene fatta in automatico alla creazione del nodo relativo utilizzando **Gradle**.

## Progetti

* [brands_info](brands_info/): una semplice applicazione distribuita con l'uso di [Spring Boot](https://projects.spring.io/spring-boot/) composta da alcuni servizi stateless, che comunicano tra loro tramite invocazioni remote con REST. Ciascuno dei servizi è realizzato come una applicazione Spring Boot separata.

* [brands_info_swarm](brands_info_swarm/): una semplice applicazione distribuita con l'uso di [Spring Boot](https://projects.spring.io/spring-boot/) e [Spring Cloud Netflix](https://cloud.spring.io/spring-cloud-netflix/) composta da alcuni servizi stateless basati sul progetto [brands_info](brands_info/), che comunicano tra loro tramite invocazioni remote REST, tramite un discovery server [Eureka](https://github.com/Netflix/eureka) utilizzando [Zuul](https://github.com/Netflix/zuul) invece come API gateway, e quindi [Feign](https://github.com/OpenFeign/feign), [Ribbon](https://github.com/Netflix/ribbon) e [Hystrix](https://github.com/Netflix/Hystrix). Ogni applicazione può essere eseguita su Cloud e su nodi virtuali diversi anche replicati. Ciascuno dei servizi è realizzato come una applicazione Spring Cloud separata.
