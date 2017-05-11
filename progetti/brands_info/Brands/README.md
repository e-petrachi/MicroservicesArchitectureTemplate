# Brands

Informazioni commerciali Brand di moda

Il servizio principale **Brands** fornisce informazioni commerciali (casuali) ai suoi client riguardo dei brand di abbigliamento famosi. 

Il servizio **Brands** fornisce due operazioni:
    
*   /S/**brand**/**anno** 
    
    restituisce informazioni (casuali) sul prodotto di abbigliamento maggiormente venduto dal **brand** informazioni commerciali (sempre casuali) sul **brand** in quell’ **anno**.

*   /S/**brand** 
    
    restituisce informazioni (casuali) sul prodotto di abbigliamento maggiormente venduto dal **brand** e informazioni sul fatturato annuale più alto mai registrato da quel **brand**.

Ad esempio:

* La richiesta /S/Adidas/2015 potrebbe restituire: “Adidas è famosa per le scarpe e nell’anno 2015 ha fatturato 17 miliardi.”

* La richiesta /S/Adidas potrebbe restituire: “Adidas è famosa per le scarpe e il record del fatturato annuo è di 20 miliardi.”
