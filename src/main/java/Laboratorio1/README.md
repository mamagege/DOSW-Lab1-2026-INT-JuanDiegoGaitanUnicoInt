# 📊 Evidencia de Salida de los Retos (Del 1 al 7)

> En este espacio se encuentran alojadas las capturas de pantalla correspondientes a la ejecución y resultados obtenidos en cada uno de los retos del proyecto.

---

## 🏆 Reto #01
![Salida Reto 1](/Images/Reto1Salida.png)

---

## 🏆 Reto #02
![Salida Reto 2](/Images/Reto2Salida.png)

---

## 🏆 Reto #03
![Salida Reto 3](/Images/Reto3Salida.png)

---

## 🏆 Reto #04
![Salida Reto 4](/Images/Reto4Salida.png)

---

## 🏆 Reto #05
![Salida Reto 5](/Images/Reto5Salida.png)

---

## 🏆 Reto #06
![Salida Reto 6](/Images/Reto6Salida.png)

---

## 🏆 Reto #07
![Salida Reto 7](/Images/Reto7Salida.png)

# 📊 Preguntas Teóricas

01. ¿Cuál es la diferencia entre git merge y git rebase?

Git Merge: Preserva el historial completo de desarrollo creando nuevas confirmaciones que combinan ramas sin alterar las confirmaciones existentes.

Git Rebase: reescribe la historia reproduciendo las confirmaciones de una rama en otra, creando una narrativa lineal, pero cambiando los hash SHA de las confirmaciones. https://www.datacamp.com/es/blog/git-merge-vs-git-rebase

02. Si dos ramas modifican la misma línea de un archivo, ¿Qué sucede al hacer merge?

Si las dos ramas que se tratan de fusionar han cambiado la misma parte del mismo archivo, Git no podrá averiguar qué versión utilizar, si esto pasa, se detiene justo antes de la confirmación de fusión para poder resolver los conflictos manualmente. https://www.atlassian.com/es/git/tutorials/using-branches/git-merge

03. ¿Cómo puedes ver gráficamente el historial de merges y ramas en consola?

El comando “git log” es una herramienta potente para vidualizar el historial de ramas en la terminal.

Vista gráfica básica

git log --oneline --graph --all --decorate

oneline: Muestra cada commit en una sola línea.

Graph: Muestra el hsitorial de confirmaciones como un gráfico.

All: incluye todas las ramas.

Decorate: Agrega nombres de ramas y etiquetas a las entradas de confirmación. https://www.geeksforgeeks.org/git/how-to-visualizing-branch-topology-in-git/




04. Explica la diferencia entre un commit y un push

Commit: se utiliza para guardar los cambios realizados en los archivos.

Push: Tiene la capacidad de actualizarse a través de una rama remota. https://cloudinfrastructureservices.co.uk/git-commit-vs-push-whats-the-difference-tutorial/

05. ¿Para qué sirven git stash y git stash pop?

Git stash: almacena temporalmente (o guarda en un stash) los cambios que haya efectuado en el código en el que está trabajando para que se pueda trabajar en otra cosa, y más tarde, regresar y volver a aplicar los cambios más tarde.

Git stash pop: Si se desea que el stash se elimine automáticamente después de aplicarlo, git stash pop lo hace. https://keepcoding.io/blog/que-es-git-stash-pop-y-su-funcion/

06. ¿Qué diferencia hay entre HashMap y HashTable?

HashMap: No está sincronizado. Esto significa que, si se usa en un entorno multihilo, más de un hilo puede acceder y procesar el HashMap simultáneamente.

HashTable: Esta sincronizada. Esto garantiza que solo un hilo pueda acceder a ella simultáneamente. El hilo que trabaja con la tabla hash adquiere un bloqueo para que los demás hilos esperen hasta que finalice la tarea. https://beginnersbook.com/2014/06/difference-between-hashmap-and-hashtable/

07. ¿Qué ventajas tiene Collectors.toMap() frente a un bucle tradicional para llenar un mapa?

Facilita la programación funcional con la API de Streams en Java y maneja de forma nativa la concurrencia y el procesamiento en paralelo. Además, utiliza menos líneas de código.



08. Si usas List con objetos y aplicas stream().map(), ¿qué tipo de operación estás haciendo?

Transformación, ya que convierte cada elemento de la lista en otro objeto diferente o nuevo valor, devolviendo un nuevo Stream sin modificar la lista original. https://www.ciberaula.com/cursos/java/streams_java.php

09. ¿Qué hace stream().filter() y qué retorna?

Es como un colador que ayuda a seleccionar solo los elementos que cumplen con una condición específica dentro de una colección. Solo los elementos que pasan la condición se mantienen. https://keepcoding.io/blog/que-hace-stream-filter-en-java/