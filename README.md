Plants vs Zombies - Java Edition
Este proyecto es una implementación orientada a objetos del clásico juego Plants vs Zombies, desarrollada en Java. La estructura del código divide claramente las responsabilidades entre ataques, entidades (plantas y zombis) y lógica del juego, lo que permite una simulación modular, extensible y fácilmente testeable.

Contenido del Proyecto
PlantsVsZombies.java: Clase principal del juego, coordina la ejecución del programa y el flujo general.

GameModes.java: Define los distintos modos de juego posibles.

GameMoves.java: Administra los movimientos válidos durante la partida.

Attack.java: Clase base abstracta para definir acciones ofensivas.

AttackPlant.java: Representa los ataques realizados por las plantas.

AttackZombie.java: Representa los ataques realizados por los zombis.

BrainsteinZombie.java: Subclase de zombi especial con habilidades avanzadas.

Características principales
Diseño orientado a objetos: Uso de herencia y polimorfismo para modelar los ataques y comportamientos de los personajes.

Modularidad: Separación clara entre la lógica de ataque, movimientos y modos de juego.

Extendibilidad: Fácil de ampliar con nuevos tipos de plantas, zombis o reglas de juego.

Modo consola: Pensado para ser ejecutado desde terminal, permitiendo un enfoque en la lógica de juego.

Cómo ejecutar
Asegúrate de tener Java instalado (versión 11 o superior).

Compila los archivos:

javac *.java

Ejecuta el juego:

java PlantsVsZombies

Ejemplo de estructura de clases
PlantsVsZombies.java

GameModes.java

GameMoves.java

Attack.java

AttackPlant.java

AttackZombie.java

Zombies

BrainsteinZombie.java

Posibles mejoras futuras
Interfaz gráfica usando JavaFX o Swing

Sistema de niveles y puntuación

Soporte para partidas guardadas

IA básica para los zombis

Autor
David Alfonso Barbosa Gómez
davidbarbosagomez@hotmail.com
GitHub
LinkedIn

Este proyecto fue realizado como parte de una práctica académica en la Escuela Colombiana de Ingeniería Julio Garavito.
