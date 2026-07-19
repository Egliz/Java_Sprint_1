# Clase Coche

**Descripción**:  
Ejercicio para practicar el uso de los modificadores 'static' y 'final', así como entender cómo afectan a los atributos y métodos de una clase.

## ✨ Funcionalidades

- Crear objetos de la clase 'Car'.
- Inicializar atributos desde el constructor.
- Comprobar el comportamiento de los atributos 'static', 'final' y 'static final'.
- Acceder a métodos y atributos 'static' sin necesidad de crear un objeto.

## 🛠 Tecnologías

- Java

## 🚀 Instalación y Ejecución

Clonar el repositorio.
Abrir en IntelliJ o Eclipse.
Ejecutar Main.java.

## 🧩 Investigación

### ¿Cuál de estos atributos puede inicializarse desde el constructor?

El atributo 'power' ('final'), ya que para cada objeto existe un valor diferente.

### ¿Quién no puede modificarse nunca?

Los atributos 'power' ('final') y 'brand' ('static final'). Una vez se les asigna un valor, ya no se pueden cambiar durante la ejecución.

### ¿Cuál afecta a todas las instancias de la clase?

Los atributos 'brand' ('static final') y 'model' ('static'), ya que todos los objetos creados tienen estos atributos en común.

### ¿Cómo se invoca un método o atributo 'static'?

Para invocar un método o un atributo 'static' no es necesario crear un objeto; se hace directamente desde la clase.

Los atributos 'final' no se pueden cambiar desde el 'main'.
 
