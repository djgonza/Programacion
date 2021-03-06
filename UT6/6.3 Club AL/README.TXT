BlueJ proyecto. Club

Cap�tulo 4.

Prop�sito del proyecto
=======================
Extender la comprensi�n de las colecciones

El ejercicio
============

Un miembro de un club se representa por una instancia de la clase Miembro.
Cada objeto Miembro contiene detalles  de la persona: nombre, mes y a�o 
en que se uni� al club. El resto de detalles de un miembro del club se asignan
cuando se crea el objeto.

El ejercicio consiste en completar la clase Club.

La clase Club almacenar� los objetos Miembro en una collecci�n flexible.

Un nuevo objeto Miembro se a�ade a la colleci�n va trav�s del m�todo aniadir 
que tiene la siguiente signatura:
    
     /**
     * A�adir un nuevo miembro a la collecci�n de miembros
     * @param miembro  El objeto a ser a�adido
     */
    public void aniadir(Miembro miembro)
  
Se puede asumir que el objeto Miembro pasado como argumento ya 
ha sido creado y est� correctamente inicializado.

La clase Club define un m�todo numeroMiembros que devuelve cu�ntos
miembros tiene el club:

    /**
     * @return N� de miembros del club
     */
    public int numeromiembros()

El n� de miembros del club corresponde al n� actual de objetos Miembro
almacenados en la colecci�n.

Completa la definici�n de la clase Club. Debe incluir:

    + Un atributo para referenciar la colecci�n

    + Un constructor sin argumentos que inicializa apropiadamente la colecci�n 
   
    +Definici�n detallada del m�todo aniadir

    +Definici�n completa del m�todo numeroMiembros

    
Ejercicios avanzados para trabajar sobre las colecciones
========================================================

Posible implementaci�n avanzada
==============================

Esta tarea ha sido separada en dos parte para ayudarte a crear
la versi�n definitiva en pasos peque�os. Se recomienda compilar
y ejecutar el programa despu�s de cada etapa para verificar que 
los cambios se han hecho de forma correcta.

1. Define un campo que se usar� para referenciar al obejto collecci�n. 
Usa una sentencia import adecuada para esta colecci�n. En el constructor
crea la colecci�n y a�gnala al campo.

2. Completa el m�todo numeroMiembros para que devuelva el tama�o actual 
de la colecci�n. Claro est� que hasta que no se haga el m�todo aniadir 
el n� de miembros ser� siempre 0.

3. Completa el m�todo aniadir.
   Cuando se quiere a�adir un nuevo objeto Miembro al club hay dos modos de hacerlo:
   
   - o crear un objeto MIembro en el ObjectBench, llamar al m�todo aniadir sobre
   el obejto Club proporcionandolo como par�metro
   - o o llamar al m�todo aniadirr y escribir:
          new Miembro("nombre del miembro" , numeroMes,nuemroAnio,...)
     en el cuadro de di�logo del par�metro del constructor

     Cuando se ha a�adido un nuevo miembro utiliza numeroMiembros m�todo) para verificar:
        - que se ha a�adido a la colecci�n
        - que el n� de meimbros se ha incrementado


Ejercicios avanzados
===================

+ Define un m�todo en la clase Club con la siguiente signatura y descripci�n:

    /** 
     * Return cu�ntos miembros se han a�adido en un mes dado
     * @param mes El mes en cuesti�n
     * @return Cu�ntos miembros se han a�adido en ese mes
     */
    public int aniadirEnMes(int mes) 

Si el par�metro mes est� fuera del rango 1-12 emitir un mensaje de error 
y devolver 0

+ Define un m�todo en la clase Club con la siguiente signatura y descripci�n:

    /**
     * Borra de la colecci�n los miembros que se han a�adido
     * en el mes dado, y los devuelve almacenados en una colecci�n separada
     * @param mes El mes en cuesti�n
     * @param anio El a�o en cuesti�n
     */
    public ArrayList borrar(int mes, int anio)

Si el par�metro mes est� fuera del rango 1-12 emitir un mensaje de error 
y devolver una colleci�n sin objetos almacenados en ella

Nota: el m�todo borrar es el m�s complicado de escribir que cualquiera de los otros
