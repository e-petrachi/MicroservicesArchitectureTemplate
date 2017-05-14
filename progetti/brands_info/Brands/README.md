# Brands

Informazioni commerciali su Brands di moda

Il servizio principale **Brands** fornisce informazioni commerciali (casuali) ai suoi client riguardo marche di abbigliamento famose. 

In particolare il servizio **Brands** fornisce due operazioni:
    
*   /S/**brand**/**anno** 
    
    che restituisce informazioni (casuali) sul prodotto di abbigliamento maggiormente venduto dal **brand** e informazioni commerciali (sempre casuali) sullo stesso **brand** in quell’ **anno**.

*   /S/**brand** 
    
    che restituisce informazioni (casuali) sul prodotto di abbigliamento maggiormente venduto dal **brand** e informazioni sul fatturato annuale più alto mai registrato da quello stesso **brand**.

## Esempio:

* La richiesta `/S/Adidas/2015` potrebbe restituire: 

    “Adidas è famosa per le scarpe e nell’anno 2015 ha fatturato 17 miliardi di euro.”

* La richiesta `/S/Adidas` invece potrebbe restituire: 

    “Adidas è famosa per le scarpe e il record del fatturato annuo è di 20 miliardi di euro.”
