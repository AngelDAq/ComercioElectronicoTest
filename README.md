Proposito:

El proyecto consiste en desarrollar un sistema de comercio electrónico (E-commerce) utilizando Java y programación orientada a objetos. Su objetivo es facilitar el manejo de los productos físicos y digitales de una tienda virtual, llevar el control de las existencias disponibles, crear pedidos con sus respectivos detalles, aplicar los descuentos correspondientes y verificar que los pagos sean correctos. Además, se realizarán pruebas automatizadas con JUnit 5 para comprobar que el sistema funcione adecuadamente.

Requisitos:

Para que el sistema de comercio electrónico funcione correctamente, es necesario organizar los archivos y configurar el entorno de desarrollo. Esto permite que las clases se reconozcan entre sí, que el proyecto compile sin errores y que las pruebas se puedan ejecutar correctamente.
•	Organización de las carpetas: El proyecto debe tener una estructura ordenada para facilitar la ubicación y lectura de los archivos. Las clases principales se deben guardar en src/main/java y las clases de prueba en src/test/java. Esta organización ayuda a evitar confusiones y facilita el mantenimiento del código.
•	Separación entre código y pruebas: Las clases principales del sistema deben mantenerse separadas de las clases de prueba. De esta manera, se puede comprobar el funcionamiento de cada parte sin mezclar el código de la aplicación con las pruebas automatizadas realizadas con JUnit 5.
•	Configuración del entorno Java: El proyecto debe abrirse correctamente en el entorno de desarrollo y tener configurado el JDK 21 o una versión superior compatible. Esto permite que el programa reconozca las clases, compile el código y ejecute el sistema y sus pruebas sin problemas de configuración.



Estructura:

Siguiendo una estructura modular con el propósito de separar adecuadamente las diferentes responsabilidades del sistema, facilitando su mantenimiento, escalabilidad y comprensión. Esta distribución permite diferenciar claramente la lógica de negocio, la gestión de datos y los mecanismos de validación mediante pruebas unitarias, favoreciendo así el desarrollo de un código más limpio y reutilizable.
Directorio Raíz (/):Actúa como contenedor principal del proyecto. En este nivel se ubican los archivos de configuración general y el documento README.md, el cual sirve como guía técnica del sistema. Dicho documento describe el propósito de la aplicación, los requisitos necesarios para su instalación, la estructura general del proyecto y las instrucciones para compilar, ejecutar y probar el software.
Directorio de Código Fuente (/src):Contiene todas las clases desarrolladas en Java que modelan el dominio del sistema siguiendo los principios de la programación orientada a objetos.
Jerarquía de Productos: Está conformada por la clase abstracta "Producto" y sus especializaciones "ProductoFisico" y "ProductoDigital". Estas clases representan los diferentes tipos de productos gestionados por la aplicación e implementan mecanismos de herencia y polimorfismo para adaptar el comportamiento según el tipo de artículo.
Gestión de Clientes e Inventario:Incluye la clase "Cliente", encargada de representar la información de los compradores, y la clase "Inventario", responsable de administrar la disponibilidad de productos. Esta última incorpora métodos como "agregarProducto()", "buscarProductoPorCodigo()" y "hayStock()", utilizados para registrar productos, realizar búsquedas y verificar existencias en bodega.
Proceso de Pedidos: Agrupa las clases "Pedido" y "DetallePedido", las cuales gestionan el flujo de compra. Estas clases permiten registrar los productos seleccionados, calcular subtotales y aplicar las reglas de negocio relacionadas con descuentos y validaciones comerciales.
Clase Principal: El punto de entrada de la aplicación se encuentra en el archivo "Main.java", donde se ejecuta la lógica principal del programa y se inicia la simulación completa del proceso de compra a través de la consola.
Directorio de Pruebas (/test): Contiene la suite de pruebas unitarias desarrollada con JUnit 5. En esta sección se implementan casos de prueba orientados a verificar el correcto funcionamiento de los componentes del sistema, incluyendo escenarios de éxito, condiciones límite y manejo de excepciones, como la validación de stock insuficiente o errores relacionados con los métodos de pago. Estas pruebas contribuyen a garantizar la calidad, estabilidad y confiabilidad del software antes de su despliegue.



Estructura del repositorio

ProyectoJava/
├── src/
│   ├── main/
│   │   └── java/       # Código del proyecto
│   └── test/
│       └── java/       # Pruebas unitarias
├── README.md           # Documentación
└── pom.xml             # Solo si utilizan Maven



Instrucciones para compilar

Si el proyecto utiliza Maven:

mvn compile

Si utiliza Gradle:

./gradlew build

Si no utiliza ninguna de estas herramientas, indicar cómo compilarlo desde IntelliJ IDEA.

6. Cómo ejecutar las pruebas

Si utiliza Maven:

mvn test

Si utiliza Gradle:

./gradlew test

También es posible ejecutar las pruebas desde IntelliJ IDEA, abriendo las clases de prueba y seleccionando la opción para ejecutarlas.

7. Integrantes

Integrante 1: Angel Daniel Quintero Roa

Integrante 2: Juan David Morales Muñoz

Integrante 3: Angelly Natalia Garavito Mendoza

8. Enlace al documento

   https://docs.google.com/document/d/1uerq0dxBdADHxE5IB75loWn7OjG8ok1y/edit?usp=sharing&ouid=110457268982351531222&rtpof=true&sd=true
