Desafío Alura Latam: Conversor de Monedas

¡Hola! Este es mi primer programa de mayor envergadura, desarrollado como parte del desafío de Alura Latam. Es un conversor de monedas simple que te permite consultar tasas de cambio y realizar conversiones entre diferentes divisas.

## Características

* **Conversión de Monedas:** Permite convertir una cantidad de dinero de una moneda a otra.
* **Monedas Soportadas:**
    * Peso Argentino (ARS)
    * Peso Chileno (CLP)
    * Peso Mexicano (MXN)
    * Real Brasileño (BRL)
    * Dólar Americano (USD)
    * Dólar Canadiense (CAD)
    * Euro (EUR)
* **Interacción por Consola:** La aplicación se ejecuta en la consola, solicitando al usuario la información necesaria.
* **Uso de API Externa:** Obtiene las tasas de cambio en tiempo real utilizando la API [ExchangeRate-API](https://www.exchangerate-api.com/).

## Cómo funciona

El programa te guiará a través de los siguientes pasos:

1.  **Selección de Moneda de Origen:** Deberás elegir la moneda de la que deseas convertir.
2.  **Ingreso de Cantidad:** Luego, ingresarás la cantidad de dinero que quieres convertir.
3.  **Selección de Moneda de Destino:** Finalmente, seleccionarás la moneda a la que deseas convertir.
4.  **Resultado:** El programa mostrará el monto convertido, incluyendo la tasa de cambio utilizada.

## Estructura del Proyecto

* `Moneda.java`: Define la estructura de una moneda, incluyendo su nombre, código, país, monto inicial y la tasa de conversión. Utiliza `@SerializedName` de Gson para mapear nombres JSON a los campos de la clase.
* `InterfasGrafica.java`: Contiene la lógica principal de la interacción con el usuario. Maneja la visualización de menús, la entrada de datos, la creación de objetos `Moneda` y la gestión de la lista de monedas para la conversión. También orquesta la llamada a la API y la muestra de resultados.
* `Busqueda.java`: Se encarga de realizar la solicitud HTTP a la API de ExchangeRate-API, parsear la respuesta JSON usando la librería Gson y extraer la tasa de conversión.

## Requisitos

Para compilar y ejecutar este programa, necesitarás:

* Java Development Kit (JDK) 11 o superior.
* La librería Gson de Google. Puedes añadirla a tu proyecto a través de Maven o Gradle, o descargarla y añadirla manualmente.

    Si usas Maven, añade lo siguiente a tu `pom.xml`:
    ```xml
    <dependency>
        <groupId>com.google.code.gson</groupId>
        <artifactId>gson</artifactId>
        <version>2.10.1</version>
    </dependency>
    ```

## Cómo Ejecutar

1.  **Clonar el Repositorio:** (Si el código está en un repositorio)
    ```bash
    git clone [URL_DE_TU_REPOSITORIO]
    cd [nombre_del_directorio]
    ```
2.  **Compilar:** Asegúrate de tener la librería Gson configurada en tu classpath.
    ```bash
    javac -cp "ruta/a/gson-2.10.1.jar:." *.java
    ```
    (Reemplaza `"ruta/a/gson-2.10.1.jar"` con la ruta real a tu archivo JAR de Gson).

3.  **Ejecutar:**
    ```bash
    java -cp "ruta/a/gson-2.10.1.jar:." InterfasGrafica
    ```

## ¡Mi Primer Programa!

Estoy muy emocionado de compartir este proyecto. Fue un gran aprendizaje trabajar con la estructura de clases, la interacción con APIs externas y el manejo de datos en Java. Cualquier sugerencia o feedback es bienvenido. ¡Gracias por revisar mi trabajo!

---
*Este programa fue desarrollado como parte del programa One Oracle Next Education (ONE) en colaboración con Alura Latam.*
