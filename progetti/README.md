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

* [brands_info](brands_info/): una semplice applicazione distribuita con l'uso di [Spring Boot](https://projects.spring.io/spring-boot/) composto da alcuni servizi stateless, che comunicano tra loro tramite invocazioni remote con REST. Ciascuno dei servizi è realizzato come una applicazione Spring Boot separata.
