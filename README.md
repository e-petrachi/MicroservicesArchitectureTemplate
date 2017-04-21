# Progetto per il corso di Architettura dei Sistemi Software della Laurea Magistrale in Ingegneria Informatica presso l'università Roma Tre (2017)

Benvenuti al repository del  progetto per il corso
di [Architettura dei Sistemi Software](http://cabibbo.dia.uniroma3.it/asw/)
a Roma Tre,
edizione 2017 (A.A. 2016-2017),
tenuto dal prof. [Luca Cabibbo](http://cabibbo.dia.uniroma3.it/).

Questo repository contiene il codice del *progetto*
del corso di [Architettura dei Sistemi Software](http://cabibbo.dia.uniroma3.it/asw/),
relativo a delle semplici *applicazioni software distribuite*
(basate sull'uso di *middleware*),
che vanno eseguite in degli opportuni *ambienti distribuiti*:
* il software è normalmente scritto in [Java](http://www.oracle.com/technetwork/java/index.html),
  e costruito con [Gradle](http://gradle.org/);
* ciascun ambiente di esecuzione distribuito è composto
  da una o più macchine virtuali create con
  [VirtualBox](https://www.virtualbox.org/)
  e [Vagrant](https://www.vagrantup.com/),
  e accedute tramite [Git](https://git-scm.com/);
* inoltre, alcuni ambienti di esecuzione  
  sono basati su contenitori
  [Docker](https://www.docker.com/).

## Software da installare sul proprio PC

### Per lo sviluppo del software

* [Java SDK](http://www.oracle.com/technetwork/java/javase/)
* [Gradle](http://gradle.org/)
* [Git](https://git-scm.com/)

### Per la gestione degli ambienti di esecuzione  

* [VirtualBox](https://www.virtualbox.org/)
* [Vagrant](https://www.vagrantup.com/)
* [Git](https://git-scm.com/)

[Docker](https://www.docker.com/) non è invece necessario,
poichè può essere eseguito nelle macchine virtuali.

## Organizzazione del repository

Questo repository è organizzato in diverse sezioni (cartelle):
* [progetti](progetti/) contiene il codice delle *applicazioni distribuite*,
  con una sottosezione (sottocartella) per ciascuno degli argomenti del corso;
* [ambienti](ambienti/) contiene il codice per la gestione degli *ambienti distribuiti*,
  con una sottosezione (sottocartella) per ciascuno degli ambienti distribuiti
  su cui poter eseguire le applicazioni distribuite sviluppate.

## Accesso al repository

Per effettuare il download del repository, usare il seguente comando Git
dalla cartella locale in cui si vuole scaricare il repository:

    git clone https://github.com/?

Per aggiornare il contenuto della propria copia locale del repository,
usare il seguente comando Git dalla cartella locale in cui è stato scaricato il repository:

    git pull
