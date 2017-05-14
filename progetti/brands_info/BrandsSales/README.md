# BrandsSales (S2)

Informazioni commerciali su Brands di moda

Il servizio **BrandsSales** fornisce due operazioni:

*   /S2/**brand**/**anno**

  che restituisce informazioni commerciali (casuali) riguardo il fatturato del **brand** in quell’ **anno**.

*   /S2/**brand**

  che restituisce informazioni commerciali (casuali) sul fatturato annuale più alto mai registrato da quel **brand**.

## Esempio:

* La richiesta `/S2/Adidas/2015` potrebbe restituire: 

      “17 miliardi”

* La richiesta `/S2/Adidas` potrebbe invece restituire:  

      “20 miliardi”
