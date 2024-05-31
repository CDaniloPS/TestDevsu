# Project Aut_e2e_saucedemo_serenity
> Ejercicio de automatizacion E2E con SerenityBDD y ScreenPlay.

## Table of Contents
* [Technologies Used](#Prerequisitos)
* [Implementation](#Implementacion)
* [Flow](#flujo)
* [Instructions to run the test](#instructions)
* [Project Status](#project-status)

## Technologies Used
	- Maquina local con el sistema operativo Windows 10
	- Intellij IDEA 2023.1.4 (Community Edition)
	- JDK versión 17 (archivo jdk-17_windows-x64_bin)
	- Gradle 7.5.1

## Implementation
    - Descargar e Instalar JDK versión 17
	- Descargar y descomprimir Gradle 7.5.1 y agregar la ruta al bin a variables de entorno.
	- Descargar e instalar de la pagina https://www.jetbrains.com/ la version Intellij IDEA 2023.1.4 (Community Edition)
	- Descargar el zip del proyecto Aut_e2e_saucedemo_serenity del repositorio de git.
	- Descomprimir el proyecto con el nombre Aut_e2e_saucedemo_serenity en el workspace.
	- En Intellij ir a File/open y seleccionar el proyecto Aut_e2e_saucedemo_serenity. 
    - En el proyecto seleccionar el menu Build/Rebuilt_Project para que verifique y descargue las dependencias faltantes.

## Flow
    Prueba funcional de un flujo de compra en la pagina https://www.saucedemo.com/ que incluya:
    - Autenticarse con el usuario: standard_user y password: secret_sauce
    - Agregar dos productos al carrito.
    - Visualizar el carrito.
    - Completar el formulario de compra.
    - Finalizar la compra hasta la confirmación: “THANK YOU FOR YOUR ORDER”.

## Instructions to run the test
    - Op1. Seleccionar el proyecto Aut_e2e_saucedemo_serenity y dar click derecho para seleccionar Open_In/Terminal, 
      en el terminal escribir /gradlew y dar ENTER o ejecutar el archivo gradlew.bat para que genere el diagnostico
      de dependencias y reporte de Serenity junto con la ejecucion del test.
    - Op2. Luego de realizar el paso de opcion Op1 para ejecutar el test nuevamente se puede ir Dentro del proyecto
      C_e2e_saucedemo_serenity ir a src/test/java/com/e2e/runners y seleccione el archivo WebRunnerTest.java,
      dar click derecho para seleccionar Run WebRunnerTest.

## Project Status
Project is:  _complete_
