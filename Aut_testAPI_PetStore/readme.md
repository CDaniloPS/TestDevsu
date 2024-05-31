# Project API PetStore
> Ejercicio de automatizacion de APIS.


## Table of Contents
* [Technologies Used](#Prerequisitos)
* [Implementation](#Implementacion)
* [Flow](#flujo)
* [Instructions to run the test](#Instructions)
* [Project Status](#project-status)

## Technologies Used
	- Maquina local con el sistema operativo Windows 11
	- IDE: IntelliJ IDEA
	- JDK versión 20 o superior


## Implementation
    - Descargar e Instalar JDK versión 20 o superior
	- Descargar e instalar de la pagina https://www.jetbrains.com/ la version Intellij IDEA 2023.1.4 (Community Edition)
	- Descargar el zip del proyecto Aut_testAPI_PetStore del repositorio de git.
	- Descomprimir el proyecto con el nombre Aut_testAPI_PetStore en el workspace.
	- En Intellij ir a File/new/project from existing sources y seleccionar el proyecto Aut_testAPI_PetStore.


## Flow
	La página https://petstore.swagger.io/ proporciona la documentación sobre apis de una “PetStore”.
    Realizar los siguientes casos:
      - Crear un usuario
      - Buscar el usuario creado.
      - Actualizar el nombre y el correo del usuario.
      - Buscar el usuarioactualizado.
      - Eliminar el usuario.


## Instructions to run the test
      - Op1. Seleccionar el proyecto Aut_testAPI_PetStore y dar click en el menu en la opción Run para seleccionar
        Run PetstoreUserRunner Shift+F10.
      - Op2. Dentro del proyecto Aut_testAPI_PetStore ir a src/test/java/usercases y seleccione el archivo 
        PetstoreUserRunner.java, dar click derecho para seleccionar Run PetstoreUserRunner y ejecutar.
	  - A continuación se visualizará la ejecución de los casos generados para los aiguientes Escenarios: 
        1. HappyPath (flujo solicitado).
        2. Negative cases (validación de mensajes de error en el flujo).

## Project Status
Project is:  _complete_
