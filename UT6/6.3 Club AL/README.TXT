BlueJ proyecto. Club

Capítulo 4.

Propósito del proyecto
=======================
Extender la comprensión de las colecciones

El ejercicio
============

Un miembro de un club se representa por una instancia de la clase Miembro.
Cada objeto Miembro contiene detalles  de la persona: nombre, mes y año 
en que se unió al club. El resto de detalles de un miembro del club se asignan
cuando se crea el objeto.

El ejercicio consiste en completar la clase Club.

La clase Club almacenará los objetos Miembro en una collección flexible.

Un nuevo objeto Miembro se añade a la colleción va través del método aniadir 
que tiene la siguiente signatura:
    
     /**
     * Añadir un nuevo miembro a la collección de miembros
     * @param miembro  El objeto a ser añadido
     */
    public void aniadir(Miembro miembro)
  
Se puede asumir que el objeto Miembro pasado como argumento ya 
ha sido creado y está correctamente inicializado.

La clase Club define un método numeroMiembros que devuelve cuántos
miembros tiene el club:

    /**
     * @return Nº de miembros del club
     */
    public int numeromiembros()

El nº de miembros del club corresponde al nº actual de objetos Miembro
almacenados en la colección.

Completa la definición de la clase Club. Debe incluir:

    + Un atributo para referenciar la colección

    + Un constructor sin argumentos que inicializa apropiadamente la colección 
   
    +Definición detallada del método aniadir

    +Definición completa del método numeroMiembros

    
Ejercicios avanzados para trabajar sobre las colecciones
========================================================

Posible implementación avanzada
==============================

Esta tarea ha sido separada en dos parte para ayudarte a crear
la versión definitiva en pasos pequeños. Se recomienda compilar
y ejecutar el programa después de cada etapa para verificar que 
los cambios se han hecho de forma correcta.

1. Define un campo que se usará para referenciar al obejto collección. 
Usa una sentencia import adecuada para esta colección. En el constructor
crea la colección y aígnala al campo.

2. Completa el método numeroMiembros para que devuelva el tamaño actual 
de la colección. Claro está que hasta que no se haga el método aniadir 
el nº de miembros será siempre 0.

3. Completa el método aniadir.
   Cuando se quiere añadir un nuevo objeto Miembro al club hay dos modos de hacerlo:
   
   - o crear un objeto MIembro en el ObjectBench, llamar al método aniadir sobre
   el obejto Club proporcionandolo como parámetro
   - o o llamar al método aniadirr y escribir:
          new Miembro("nombre del miembro" , numeroMes,nuemroAnio,...)
     en el cuadro de diálogo del parámetro del constructor

     Cuando se ha añadido un nuevo miembro utiliza numeroMiembros método) para verificar:
        - que se ha añadido a la colección
        - que el nº de meimbros se ha incrementado


Ejercicios avanzados
===================

+ Define un método en la clase Club con la siguiente signatura y descripción:

    /** 
     * Return cuántos miembros se han añadido en un mes dado
     * @param mes El mes en cuestión
     * @return Cuántos miembros se han añadido en ese mes
     */
    public int aniadirEnMes(int mes) 

Si el parámetro mes está fuera del rango 1-12 emitir un mensaje de error 
y devolver 0

+ Define un método en la clase Club con la siguiente signatura y descripción:

    /**
     * Borra de la colección los miembros que se han añadido
     * en el mes dado, y los devuelve almacenados en una colección separada
     * @param mes El mes en cuestión
     * @param anio El año en cuestión
     */
    public ArrayList borrar(int mes, int anio)

Si el parámetro mes está fuera del rango 1-12 emitir un mensaje de error 
y devolver una colleción sin objetos almacenados en ella

Nota: el método borrar es el más complicado de escribir que cualquiera de los otros
