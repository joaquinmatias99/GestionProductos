# Gestión de productos

## Descripcion
Este proyecto es una API de gestión de productos construida con Spring Framework y Java. Utiliza una base de datos en memoria para permitir operaciones CRUD sobre productos. Está diseñada para ser usada con Postman o cualquier cliente de API para probar las funcionalidades. En este caso este proyecto viene con una base de datos ya cargada para poder ser probada directamente sin necesidad de hacer varios inserts.

## Funcionalidades
Crear producto.
Actualizar producto existente.
Consultar un producto por id o nombre.
Eliminar un producto existente.
Consultas los productos según el precio ( de mayor a menor o al reves).

## Tecnologias y herramientas utilizadas
Java.

Spring Boot.

Maven.

Base de datos en memoria (H2).

Postman.

Swagger.

## Como probar la API
Dentro del directorio del proyecto se encuentra el archivo llamado "Productos.postman_collection.json" el cual contiene los curl del proyecto para poder ser probados directamente desde Postman. 
Se da a correr al proyecto y está listo para probar cada metodo.
También se puede acceder a la funcionalidad mediante Swagger: http://localhost:8080/swagger-ui/index.html#/
