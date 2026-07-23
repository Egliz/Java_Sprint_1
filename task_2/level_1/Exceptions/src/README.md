# Exceptions
  
En este ejercicio tenemos que comprobar el estado de una lista; si esta lista no tiene productos, lanzamos una excepción personalizada.  

## ✨ Funcionalidades:
El programa puede crear productos.
Añadir productos a una lista.
Puede calcular el total de todos los productos que hay en la lista.
Puede lanzar excepciones.
Puede capturar una excepción.

## 🛠 Tecnologías: 
- Java 21  

## 🚀 Instalación y Ejecución:
1. Clonar el repositorio.
2. Abrir en IntelliJ o Eclipse. 
3. Ejecutar Main.java.
	En el momento que se ejecuta el 'Main.java', no vemos la excepción personalizada 'EmptySaleException'; para verla, se deben comentar las líneas 9 (sale1.addProduct(product1);) y 10 (sale1.addProduct(product2);).


## Investigación:
Las excepciones las vemos cuando se interrumpe la compilación o ejecución de nuestro programa, debido a un error.

Java ya tiene excepciones, pero también hay excepciones personalizadas, que son las que creamos para un caso en concreto; como en nuestro ejercicio, en el método calculateTotal() (en Sale), lanzamos una excepción en el caso de que en la lista no haya productos. Java no tiene una excepción para este caso en concreto.
Las excepciones personalizadas heredan de 'Exception' o de 'RuntimeException'.

Cuando hacemos un método que puede lanzar una excepción personalizada, tenemos que avisar poniendo 'throws' en la firma.
Dentro del código, se invoca la excepción con 'throw new'.

¿Qué hace try-catch?
En el bloque de 'try' definimos qué queremos que ocurra; si ocurre un error, se captura ejecutando el bloque catch.


Las 'Checked Exceptions' son errores que el compilador obliga a manejar de manera obligatoria; es como si el compilador dijera necesito saber qué pasará con esto si ocurre un error, entonces es cuando se usa 'try-catch'.


Las 'Unchecked Exceptions' son errores que ocurren en la ejecución del programa. Forman parte de la clase 'RuntimeException'.


