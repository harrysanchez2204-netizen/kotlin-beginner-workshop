# Kotlin Beginner Workshop

**Estudiante:** Harrison Quitumbo Sanchez
**Universidad:** Universidad Tecnológica de Pereira — Ingeniería Electrónica

## Descripción

Taller práctico de introducción a Kotlin basado en la sección *Beginner* del
[Kotlin Tour](https://kotlinlang.org/docs/kotlin-tour-hello-world.html).
Contiene ocho ejercicios independientes, cada uno en su propia carpeta con un archivo `Main.kt`,
que cubren: estructura básica, variables y tipos de datos, colecciones, condicionales, ciclos,
funciones, clases y manejo seguro de valores nulos (null safety).

## Estructura del repositorio

```
kotlin-beginner-workshop/
├── README.md
├── exercise-01/Main.kt
├── exercise-02/Main.kt
├── exercise-03/Main.kt
├── exercise-04/Main.kt
├── exercise-05/Main.kt
├── exercise-06/Main.kt
├── exercise-07/Main.kt
└── exercise-08/Main.kt
```

## Cómo se resuelve cada ejercicio

### Ejercicio 1. Calculadora básica
**Conceptos:** variables `val`, tipos `Double` y `Char`, estructura `when`, funciones.

1. Se declaran dos números (`Double`) y un carácter que representa la operación (`+`, `-`, `*`, `/`).
2. Una función `calculate` recibe los tres valores y usa `when` para elegir qué operación realizar según el carácter.
3. En el caso de la división, un `if` revisa primero si el divisor es `0.0`; si lo es, devuelve un mensaje de error en lugar de dividir.
4. Cualquier otro carácter cae en la rama `else` del `when` y se informa como operación no válida.
5. `main()` llama a la función con distintas operaciones, incluida una división entre cero, para comprobar todos los casos.

### Ejercicio 2. Clasificación de estudiantes
**Conceptos:** variables, operaciones aritméticas, condicionales `if/else`, plantillas de texto.

1. Se declaran el nombre del estudiante y tres calificaciones entre 0.0 y 5.0.
2. El promedio se calcula sumando las tres notas y dividiendo entre 3.
3. Un primer `if/else` compara el promedio con 3.0: si es mayor o igual, el estudiante está aprobado; si no, reprobado.
4. Un segundo `if` independiente revisa si el promedio es mayor o igual a 4.5 para indicar que es excelente.
5. El resultado se muestra con plantillas de texto (`$nombre`, `${expresión}`) y el promedio se formatea con dos decimales.

### Ejercicio 3. Tabla de multiplicar
**Conceptos:** ciclo `for`, rangos (`1..10`), variable acumuladora.

1. Se declara un número entero.
2. Un ciclo `for (i in 1..10)` recorre los valores del 1 al 10 (ambos incluidos).
3. En cada vuelta se calcula `numero * i` y se imprime la línea de la tabla.
4. Para la segunda parte del ejercicio se crea una variable `total` en 0 antes del ciclo, y en cada vuelta se le suma el resultado.
5. Al terminar el ciclo se imprime la suma de todos los resultados.

### Ejercicio 4. Análisis de una lista
**Conceptos:** colecciones (`listOf`), ciclos, contadores y comparaciones.

1. Se crea una lista inmutable con once números enteros.
2. Un primer ciclo recorre la lista para mostrar sus elementos.
3. Un segundo ciclo, con una sola pasada, hace todo el análisis: acumula la suma, compara cada número con el mayor y el menor actuales para actualizarlos, y usa el residuo (`n % 2`) para contar pares e impares.
4. El mayor y el menor parten del primer elemento de la lista, para que la comparación sea válida desde el inicio.
5. El promedio se obtiene dividiendo la suma entre el tamaño de la lista, convirtiendo antes la suma a `Double` para no perder decimales.

### Ejercicio 5. Funciones matemáticas
**Conceptos:** funciones con parámetros y tipo de retorno, ciclos, validación con `require`.

1. `isPrime(number)`: devuelve `false` si el número es menor que 2; si no, prueba dividirlo entre cada entero desde 2 hasta la mitad del número, y si alguna división es exacta, no es primo.
2. `factorial(number)`: primero valida con `require` que el número no sea negativo; luego multiplica en un ciclo desde 2 hasta el número, usando `Long` para soportar resultados grandes.
3. `isEven(number)`: es una función de una sola línea que devuelve si el residuo de dividir entre 2 es 0.
4. `main()` recorre una lista de números de prueba y llama a las tres funciones con cada uno, mostrando los resultados.

### Ejercicio 6. Gestión de productos
**Conceptos:** clases, constructor primario, propiedades, métodos, objetos.

1. La clase `Product` recibe en su constructor primario el nombre, el precio y la cantidad disponible; al usar `val`, Kotlin crea las propiedades automáticamente.
2. El método `totalValue()` devuelve el valor del inventario de ese producto: precio por cantidad.
3. El método `showInfo()` imprime el nombre, el precio, la cantidad y el valor total.
4. En `main()` se crean tres objetos `Product` y se guardan en una lista.
5. Un ciclo recorre la lista, muestra la información de cada producto y acumula el valor total de todo el inventario.

### Ejercicio 7. Agenda de contactos
**Conceptos:** clases, lista mutable, funciones, búsqueda y manejo de nulos.

1. La clase `Contact` guarda nombre, teléfono y correo, y sobrescribe `toString()` para imprimirse en una sola línea.
2. Los contactos viven en una `mutableListOf` inicializada con cinco contactos.
3. `addContact` agrega un contacto a la lista con `add`.
4. `listContacts` recorre la lista numerando los contactos; si está vacía, avisa que la agenda no tiene contactos.
5. `searchContact` usa `firstOrNull` para encontrar el contacto por nombre sin distinguir mayúsculas; devuelve `Contact?`, es decir, `null` si no existe.
6. `removeContact` reutiliza la búsqueda: si el resultado es `null`, informa que el contacto no existe; si no, lo elimina de la lista.
7. `main()` prueba cada función, incluyendo buscar y eliminar contactos que no existen.

### Ejercicio 8. Manejo de valores nulos
**Conceptos:** tipos nullable (`String?`), `isNullOrBlank`, safe call (`?.`), operador elvis (`?:`).

1. La función `greet` recibe un parámetro de tipo `String?`, que puede ser `null`.
2. Con `isNullOrBlank()` se revisa en una sola condición si el valor es nulo, está vacío o solo tiene espacios.
3. En ese caso devuelve un saludo genérico; en caso contrario, un saludo personalizado con el nombre sin espacios sobrantes (`trim()`).
4. En ningún punto se usa `!!`: Kotlin sabe que, tras la validación, el nombre ya no es nulo.
5. `main()` prueba la función con una lista de valores: un nombre normal, `null`, texto vacío, solo espacios y un nombre con espacios alrededor.
6. Al final se muestra un ejemplo de safe call con elvis: `maybeName?.length ?: 0`, que devuelve la longitud o 0 si el valor es nulo.
