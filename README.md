# IETI-Lab9-JPA-mongodb

## Preguntas
-   How many customers were created in the database?
	Se crearon 5 clientes como se puede ver en la siguiente imagen. 
	![1Customer](https://user-images.githubusercontent.com/44879884/96942539-0d445300-149b-11eb-809f-5a5cf7940e45.PNG)
	
-   Where is the  _findAll_  method implemented?
	El metodo findAll se puede utilizar ya que la interfaz CustomerRepository extiende de MongoRepository que es donde está implementado el findAll.

-   Suppose you have more than 1000 products in your database. How would you implement a method for supporting pagination and return pages of 50 products to your frontend?

-   How many products contain the "plus" word in their description?
	Hay 4 productos que contienen la palabra "plus" en su descripción como lo vemos en la siguiente imagen.
	![4Plus](https://user-images.githubusercontent.com/44879884/96942540-0ddce980-149b-11eb-8cdd-c0a5c5392427.PNG)
	
-   How many products are returned by the  _findByDescriptionContaining_  query? Why?

-   Which are the collection names where the objects are stored? 
	Los dos nombres son customer y product como se ve en la siguiente imagen.
	![6Nombres](https://user-images.githubusercontent.com/44879884/96942542-0e758000-149b-11eb-881a-ed52f14a5a9d.PNG)
	
	Where are those names assigned?
	Son asignados en los respectivos modelos gracias a la notación @Document

## Código de Honor

Debes seguir el Código de honor del ingeniero de sistemas para defender el estándar de integridad académica de la ECI:

- Tus respuestas a tareas, cuestionarios y exámenes deben ser tu propio trabajo (excepto para las tareas que permiten explícitamente la colaboración).

- No puedes compartir tus soluciones de tareas, cuestionarios o exámenes con otra persona a menos que el instructor lo permita explícitamente. Esto incluye cualquier cosa escrita por ti, como también cualquier solución oficial proporcionada por el docente o el monitor del curso.

- No puedes participar en otras actividades que mejorarán de manera deshonesta tus resultados o que mejorarán de manera deshonesta o dañarán los resultados de otras personas.