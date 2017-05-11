# Progetti

Questa sezione del repository contiene il codice (codice sorgente)
di alcune semplici *applicazioni software distribuite* e basate su *middleware*.
Le diverse applicazioni distribuite sono organizzate in progetti.

L'esecuzione delle applicazioni distribuite deve essere effettuata
in un opportuno *ambiente di esecuzione*,
definito nella cartella [ambienti/](../ambienti/) del repository.

## Contenuto dei progetti

Ciascun **progetto** contiene (come sotto-cartelle) una o più **applicazioni distribuite**.
Ogni applicazione distribuita è composta da uno o più **moduli**,
che danno luogo a uno o più **componenti eseguibili** dell'applicazione.
In generale, ogni applicazione va eseguita in un **ambiente di esecuzione** opportuno,
e in particolare ogni componente eseguibile dell'applicazione
va eseguito in una macchina virtuale opportuna dell'ambiente.

Queste informazioni sono descritte nell'ambito di ciascun progetto.

## Build  

La costruzione (build, ovvero compilazione e assemblaggio) delle applicazioni
viene fatta in automatico alla creazione del nodo relativo utilizzando **Gradle**.

## Progetti

* [brands_info](brands_info/): un semplice progetto con l'uso di [Spring Boot](https://projects.spring.io/spring-boot/)
