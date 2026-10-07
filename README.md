# Kotlin Beginner Workshop

**Estudiante:** Javier Stiven Alzate Muñoz
**Universidad:** Universidad Tecnológica de Pereira — Ingeniería Electrónica

## Descripción

Taller práctico de introducción a Kotlin basado en la sección *Beginner* del
[Kotlin Tour](https://kotlinlang.org/docs/kotlin-tour-hello-world.html).
Contiene ocho ejercicios independientes que cubren: estructura básica, variables y tipos,
colecciones, condicionales, ciclos, funciones, clases y null safety.

## Ejercicios

| Carpeta | Ejercicio | Conceptos principales |
|---|---|---|
| `exercise-01` | Calculadora básica | `when`, control de división entre cero |
| `exercise-02` | Clasificación de estudiantes | `if/else`, promedio |
| `exercise-03` | Tabla de multiplicar | `for`, rangos, acumuladores |
| `exercise-04` | Análisis de una lista | `listOf`, suma, promedio, mayor/menor, pares/impares |
| `exercise-05` | Funciones matemáticas | funciones, `isPrime`, `factorial`, `isEven` |
| `exercise-06` | Gestión de productos | clases, propiedades, métodos |
| `exercise-07` | Agenda de contactos | `mutableListOf`, agregar/listar/buscar/eliminar |
| `exercise-08` | Manejo de valores nulos | `String?`, `?.`, `?:`, sin `!!` |

## Cómo ejecutar

### Opción 1: Kotlin Playground
Copiar el contenido de cualquier `Main.kt` en <https://play.kotlinlang.org/> y presionar *Run*.

### Opción 2: Línea de comandos (kotlinc)
```bash
cd exercise-01
kotlinc Main.kt -include-runtime -d main.jar
java -jar main.jar
```
Repetir en cada carpeta `exercise-0X`.

### Opción 3: IntelliJ IDEA
Abrir la carpeta del ejercicio, abrir `Main.kt` y presionar el botón verde junto a `fun main()`.
