# Ambienti di esecuzione del corso di Architettura dei Sistemi Software 

Questa sezione del repository contiene il codice (*infrastructure-as-code*) 
di alcuni *ambienti di esecuzione* distribuiti virtuali. 
Ogni sottosezione (sottocartella) è relativa a un diverso ambiente di esecuzione. 

Questi ambienti di esecuzione possono essere utilizzati per 
eseguire i progetti delle applicazioni distribuite 
definiti nella cartella [progetti/](../progetti/) del repository. 

Gli ambienti vengono creati con **Vagrant**, 
e possono essere tutti gestiti allo stesso modo. 

Per gestire un ambiente bisogna: 

1. usare una shell del terminale

2. posizionarsi nella cartella dell'ambiente di interesse 

3. per avviare o creare l'ambiente di esecuzione, usare il comando `vagrant up` 

4. per collegarsi con SSH a una macchina virtuale *VM* dell'ambiente, usare il comando `vagrant ssh VM`
    
E' anche possibile: 

* arrestare l'ambiente di esecuzione, con il comando `vagrant halt`

* distruggere l'ambiente di esecuzione, con il comando `vagrant destroy -f`  

## Ambienti 

* [developer](developer/)
  per la compilazione e l'assemblaggio (build) dei progetti definiti nella cartella [progetti/](../progetti/) del repository 

