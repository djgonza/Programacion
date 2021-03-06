BlueJ proyecto productos
Authors:  David J. Barnes and Michael Kolling

Cap�tulo 4.

Prop�sito del proyecto
=======================

Manejo de colecciones, uso de bucles, iteradores y casting.


Ej ejercicio
=============
 Una compa��a registra los niveles de stock de los productos 
 que vende. Un objeto GestorStock mantiene una lista con un n�
 arbitrario de objetos Producto. 
 Se trata de completar la implementaci�n de la clase GestosStock.

La clase GestorStock se proporciona para ayudar a demostrar de qu�
formas objetos GestorStock y Producto pueden usarse. Se puede crear
 un objeto GestorStock en el object bench y llamar a sus m�todos.
 A medida que se desarrolle la clase GestorStock aumentar� su funcionalidad.

La clase GestorStck
======================

Esta clase utiliza un objeto ArrayList para almacenar 0 o m�s productos.
Su m�todo aniadirProducto a�ade un nuevo producto a la colecci�n. 
Los siguientes m�todos necesitan ser completados: recibir, encontrarProducto,
escribirDetallesProducto,nuemroEnStock. 

+ El m�todo recibir localiza un producto con un ID dado en la lista de
productos y llama al m�todo incrementarCantidad 

+ El m�todo encontrarProdcuto busca en la colecci�n un producto cuyo ID 
coincida con el del argumento del m�todo. Si se encuentra el producto, este
producto se devuelve como valor de retorno del m�todo. Si no se encuentra 
se devuelve null.

+ escribirDetallesProducto itera sobre la lista de productos y escribe
 el resultado de llamar al m�todo toStrinf de cada producto.
 
+  M�todo numeroEnStock - localiza un producto en la colecci�n con un ID dado y 
devuelve la cantidad actual  de ese producto en stock. Si no se encuentra
el producto se devuelve 0.

La clase Producto
=================

No hay que hacer modificaciones en esta clase

Cada producto vendido por la compa�ia se representa por una instancia de
la clase Producto, que registra el ID del producto, nombre y cuanto de ese
producto hay en stock. La clase define el m�todo incrementarCantidad  para
registrar incrementos en el nivel de stock del producto. El m�todo venderUno 
indica que un art�culo de  ese producto se ha vendido reduciendo la cantidad en uno.


Implementaci�n por etapas
==========================

1. Implementar el m�todo escribirDetallesProducto para asegurarnos que se puede iterar
sobre la colleci�n de productos. Escribe cada producto utilizando System.out. Utilizar
un Iterator es la soluci�n m�s adecuada pero usa un �ndice integer si te resulta m�s
f�cil de entender.
 
2. Implementa el m�todo encontrarProducto. Aqu� no es necesario examinar cada producto de la 
colecci�n. Si el producto se encuentra en primer lugar la iteraci�n debe terminar y devolver
el producto. Si no se encuentra la colecci�n se habr� recorrido entera sin encontrar el
producto, en este caso se devolver� null.

Cuando se busca unproducto por su ID habr� que llamar al m�todo getID de un producto.
Esto quiere decir que hay que realizar un cast cuando se obtiene un producto de la lista.  

3. Implementa el m�todo numeroEnStock. Es relativamente f�cil cuando se ha implementado el m�todo
encontrarProducto. numeroEnStock puede llamar al m�todo encontrarProducto para que haga la b�squeda
y entonces llamar a getCantidad para saber el resultado.

4. Implementa el m�todo repartir utilizando una estrategia similar a la usada en numeroEnStock.

Ejercicios avanzados
============================

+ Implementa un m�todo en GestorStock para escribir los detalles de todos los productos con niveles 
de stock por debajo de un valor dado (pasado como par�metro al m�todo).

+  Modifica el m�todo aniadirProducto para que un nuevo producto no pueda ser a�adido si ya 
est� en la lista un producto con ese ID.

+ A�ade un m�todo a GestorStock que localice un producto a partir de su nombre en vez de su ID:

    public Producto encontrarProducto(String nombre)

Para hacer esto necesitas saber que dos objetos STring s1 y s2 pueden ser testeados para ver si son
iguales con la expresi�n booleana:   s1.equals(s2)


