# test-conversor-temperaturas
🌡️ Proyecto: Mi Primer Conversor de Temperaturas (con Testing!)
¡Hola! Soy Juan y este es uno de mis primeros proyectos integrales en Java. El objetivo era arreglar un sistema de conversión de temperaturas que tenía algunos fallos de precisión y asegurarme de que no se volviera a romper usando pruebas unitarias con JUnit.

🚀 ¿De qué trata esto?
La idea era simple pero con truco: convertir grados Celsius a Fahrenheit y Kelvin. Al principio, el código redondeaba los decimales de forma un poco "bruta" y no usaba las constantes científicas exactas, así que me puse manos a la obra para corregirlo.

🛠️ Lo que hice (Paso a paso)
Para que este proyecto funcionara como debe, seguí este proceso:


Análisis del código: Revisé la clase ConversorTemperatura.java y encontré que perdíamos precisión al redondear resultados y al no usar el valor .15 en la escala Kelvin.

La corrección: Limpié las fórmulas. Ahora el código maneja decimales correctamente usando 5.0 en la división y la constante 273.15.


Unit Testing (Mi parte favorita): Implementé una clase de prueba llamada ConversorTemperaturaTest.java.

Probé los casos que me pidió la empresa (2, 3 y 4 grados Celsius).

Aprendí a usar assertEquals con un DELTA (margen de error) porque, ya sabes, ¡los decimales en programación son todo un mundo!.

Metí casos límite como temperaturas negativas y el cero absoluto.


Versionado con Git: Me peleé un poco con los comandos (pull, merge, force push), pero al final logré subirlo todo a este repositorio para que se vea el progreso.

🧪 Cómo probarlo
Si quieres ver si funciona:

Clona el repo.

Abre el proyecto en IntelliJ IDEA (yo usé la versión de Java 21).

Busca la carpeta temperaturas dentro de src.

Haz clic derecho en ConversorTemperaturaTest.java y dale a Run. ¡Deberías ver la barra verde! ✅

📚 Lo que aprendí
Que un pequeño .15 puede hacer que un test falle.

La importancia de no redondear datos antes de tiempo!!

A no tenerle miedo a la terminal de Git (aunque a veces asuste  y pueda dar fallos).

📝 Notas del autor
Todavía estoy aprendiendo, así que si ves algo que se pueda mejorar en mi lógica o en cómo organicé las carpetas, ¡soy todo oídos! ¡Gracias por pasarte por mi repo! ✌️
