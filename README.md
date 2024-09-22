# Snake Game en Java

## Descripción del juego

Este es un clásico **Snake Game** desarrollado en Java utilizando la biblioteca **Swing** para la interfaz gráfica de usuario (GUI). En este juego, el jugador controla una serpiente que se mueve por la pantalla comiendo comida para crecer. El objetivo es crecer lo más posible sin chocar contra las paredes o contra la propia serpiente.

## Descarga e instalación

1. Descarga todo el proyecto en formato `.rar` desde el repositorio.
2. Extrae el contenido del archivo `.rar` en tu máquina local utilizando cualquier herramienta de descompresión como **WinRAR** o **7-Zip**.
3. Abre la carpeta extraída en tu IDE favorito, como **NetBeans** o **Eclipse**.

### Requisitos

- **Java JDK 8** o superior.
- **Apache NetBeans** (opcional, pero recomendado para desarrollo y compilación).

## Cómo jugar

1. Inicia el juego ejecutando el archivo `Main.java` desde el IDE.
2. Introduce tu nombre al inicio del juego.
3. Usa las teclas de flechas para mover la serpiente:
   - **Arriba**: Flecha hacia arriba
   - **Abajo**: Flecha hacia abajo
   - **Izquierda**: Flecha hacia la izquierda
   - **Derecha**: Flecha hacia la derecha
4. El objetivo es comer la comida que aparece en la pantalla para que la serpiente crezca.
5. Evita chocar contra las paredes o tu propio cuerpo. Si lo haces, el juego terminará.
6. Después de perder, podrás reiniciar el juego o continuar con el mismo nombre.

## Estructura del código

- **Main.java**: Archivo principal que inicia el juego.
- **GamePanel.java**: Contiene la lógica del juego, como el movimiento de la serpiente, la generación de la comida y la detección de colisiones.
- **Snake.java**: Clase que representa la serpiente.
- **Food.java**: Clase que representa la comida.

## Mejoras futuras

- Agregar diferentes niveles de dificultad.
- Implementar un sistema de puntajes más altos.
- Modos de juego adicionales.

## Créditos

Desarrollado por **Nilver T.I.**
