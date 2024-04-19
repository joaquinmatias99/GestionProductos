# Gestión de productos

## Descripcion
Este proyecto es una API de gestión de productos construida con Spring Framework y Java. Utiliza una base de datos en memoria para permitir operaciones CRUD sobre productos. Está diseñada para ser usada con Postman o cualquier cliente de API para probar las funcionalidades. En este caso, al inicializar el proyecto se hacen los correspondientes inserts para asi poder trabajar con datos limpios cada vez que se ejecute el mismo. 

## Funcionalidades
Crear producto.

Actualizar producto existente.

Consultar un producto por id o nombre.

Eliminar un producto existente a partir de una id.

Obtener lista de productos según orden de precio ( menor a mayor ó mayor a menor )

## Tecnologias y herramientas utilizadas
Java.

Spring Boot.

JPA + Hibernate

Maven.

Base de datos en memoria (H2).

Postman.

Swagger.

## Como probar la API
Dentro del directorio del proyecto se encuentra el archivo llamado "Productos.postman_collection.json" el cual contiene los curl necesarios para para poder ser probar el proyecto mediantes los metodos correspondientes directamente desde Postman. 

También se puede acceder a los métodos mediante Swagger: http://localhost:8080/swagger-ui/index.html#/
