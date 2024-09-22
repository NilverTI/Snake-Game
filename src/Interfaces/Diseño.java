package Interfaces;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class Diseño extends JPanel implements ActionListener, KeyListener {

    private String nombreJugador;

    private int tamañoCelda;
    private int velocidad;

    private int numCeldasX;
    private int numCeldasY;

    private Celda cabezaSerpiente;
    private ArrayList<Celda> cuerpoSerpiente;

    private ArrayList<Roca> rocas;
    private Random aleatorio;

    private Celda comida;
    private Random aleatorioComida;

    private int velocidadX;
    private int velocidadY;

    private Timer bucleJuego;

    private boolean juegoTerminado = false;
    private int puntaje = 0;

    private JFrame menuPrincipal;

    public Diseño(int anchoTablero, int altoTablero, int nivelDificultad, JFrame menuPrincipal) {
        this.menuPrincipal = menuPrincipal;

        // Pedir al usuario que ingrese su nombre
        this.nombreJugador = JOptionPane.showInputDialog(this, "Ingrese su nombre:");

        // Inicializa las variables
        rocas = new ArrayList<>();
        aleatorio = new Random();
        aleatorioComida = new Random();

        // Determina el tamaño de la celda y el número de celdas según el nivel de dificultad
        switch (nivelDificultad) {
            case 1: // Fácil
                tamañoCelda = anchoTablero / 20; // Tamaño de celda según ancho del tablero
                numCeldasX = 20;
                numCeldasY = 15;
                velocidad = 200;
                generarRocas(10); // Generar 10 rocas para nivel fácil
                break;
            case 2: // Medio
                tamañoCelda = anchoTablero / 25;
                numCeldasX = 25;
                numCeldasY = (int) Math.round(numCeldasX * ((double) altoTablero / anchoTablero));
                velocidad = 85;
                generarRocas(15); // Generar 15 rocas para nivel medio
                break;
            case 3: // Difícil
                tamañoCelda = anchoTablero / 30;
                numCeldasX = 31;
                numCeldasY = (int) Math.round(numCeldasX * ((double) altoTablero / anchoTablero));
                velocidad = 60;
                generarRocas(20); // Generar 20 rocas para nivel difícil
                break;
            default: // Por defecto, nivel fácil
                tamañoCelda = anchoTablero / 20;
                numCeldasX = 20;
                numCeldasY = 15;
                velocidad = 200;
                generarRocas(10); // Generar 10 rocas para nivel fácil
                break;
        }

        setPreferredSize(new Dimension(anchoTablero, altoTablero));

        cabezaSerpiente = new Celda(5, 5);
        cuerpoSerpiente = new ArrayList<>();

        comida = new Celda(10, 10);
        colocarComida();

        velocidadX = 1;
        velocidadY = 0;

        bucleJuego = new Timer(velocidad, this);
        bucleJuego.start();

        addKeyListener(this);
        setFocusable(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Dibuja el fondo del tablero
        for (int i = 0; i < numCeldasX; i++) {
            for (int j = 0; j < numCeldasY; j++) {
                if ((i + j) % 2 == 0) {
                    g.setColor(new Color(163, 208, 83));
                } else {
                    g.setColor(new Color(169, 216, 89));
                }
                g.fillRect(i * tamañoCelda, j * tamañoCelda, tamañoCelda, tamañoCelda);
            }
        }

        // Dibuja las rocas
        g.setColor(Color.GRAY);
        for (Roca roca : rocas) {
            g.fillRect(roca.x * tamañoCelda, roca.y * tamañoCelda, tamañoCelda, tamañoCelda);
        }

        // Dibuja la comida
        g.setColor(Color.RED);
        g.fillRect(comida.x * tamañoCelda, comida.y * tamañoCelda, tamañoCelda, tamañoCelda);

        // Dibuja la cabeza de la serpiente
        g.setColor(Color.BLACK);
        g.fillRect(cabezaSerpiente.x * tamañoCelda, cabezaSerpiente.y * tamañoCelda, tamañoCelda, tamañoCelda);

        // Dibuja el cuerpo de la serpiente
        g.setColor(Color.BLUE);
        for (Celda c : cuerpoSerpiente) {
            g.fillRect(c.x * tamañoCelda, c.y * tamañoCelda, tamañoCelda, tamañoCelda);
        }

        // Dibuja el puntaje
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString(nombreJugador + " - Puntaje: " + puntaje, 10, 30);
    }

    public void mover() {
        Celda nuevaCabeza = new Celda(cabezaSerpiente.x + velocidadX, cabezaSerpiente.y + velocidadY);

        if (nuevaCabeza.x < 0 || nuevaCabeza.x >= numCeldasX || nuevaCabeza.y < 0 || nuevaCabeza.y >= numCeldasY) {
            juegoTerminado = true;
            return;
        }

        for (Celda c : cuerpoSerpiente) {
            if (c.x == nuevaCabeza.x && c.y == nuevaCabeza.y) {
                juegoTerminado = true;
                return;
            }
        }

        for (Roca roca : rocas) {
            if (roca.x == nuevaCabeza.x && roca.y == nuevaCabeza.y) {
                juegoTerminado = true;
                return;
            }
        }

        cuerpoSerpiente.add(0, new Celda(cabezaSerpiente.x, cabezaSerpiente.y));
        cabezaSerpiente = nuevaCabeza;

        if (cabezaSerpiente.x == comida.x && cabezaSerpiente.y == comida.y) {
            colocarComida();
            puntaje++;
        } else {
            cuerpoSerpiente.remove(cuerpoSerpiente.size() - 1);
        }
    }

    public void generarRocas(int cantidadRocas) {
        // Genera rocas de forma aleatoria en el tablero
        for (int i = 0; i < cantidadRocas; i++) {
            int x = aleatorio.nextInt(numCeldasX);
            int y = aleatorio.nextInt(numCeldasY);
            rocas.add(new Roca(x, y));
        }
    }

    public void colocarComida() {
        int x = aleatorioComida.nextInt(numCeldasX);
        int y = aleatorioComida.nextInt(numCeldasY);
        comida = new Celda(x, y);
    }

    public void actionPerformed(ActionEvent e) {
        if (!juegoTerminado) {
            mover();
            repaint();
        } else {
            bucleJuego.stop();
            String[] opciones = {"Sí", "No", "Regresar al Menú"};
            int opcion = JOptionPane.showOptionDialog(this, "¿Deseas reiniciar el juego?", "Game Over", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
            
            switch (opcion) {
                case JOptionPane.YES_OPTION:
                    cambiarNombreJugador();
                    reiniciarJuego();
                    break;
                case JOptionPane.NO_OPTION:
                    System.exit(0); // Opción para salir del juego
                    break;
                case JOptionPane.CANCEL_OPTION: // Regresar al menú principal
                    menuPrincipal.setVisible(true);
                    JFrame juegoFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
                    juegoFrame.setVisible(false);
                    break;
                default:
                    break;
            }
        }
    }

    private void reiniciarJuego() {
        cuerpoSerpiente.clear();
        rocas.clear();
        // Generar rocas según el nivel de dificultad
        switch (velocidad) {
            case 200:
                generarRocas(10);
                break;
            case 85:
                generarRocas(15);
                break;
            case 60:
                generarRocas(20);
                break;
            default:
                generarRocas(10);
                break;
        }
        cabezaSerpiente = new Celda(5, 5);
        colocarComida();
        velocidadX = 1;
        velocidadY = 0;
        juegoTerminado = false;
        puntaje = 0;
        bucleJuego.start();
        repaint();
    }

    private void cambiarNombreJugador() {
        String nuevoNombre = JOptionPane.showInputDialog(this, "Ingrese su nuevo nombre:", nombreJugador);
        if (nuevoNombre != null && !nuevoNombre.isEmpty()) {
            nombreJugador = nuevoNombre;
        }
    }

    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                if (velocidadY == 0) {
                    velocidadX = 0;
                    velocidadY = -1;
                }
                break;
            case KeyEvent.VK_DOWN:
                if (velocidadY == 0) {
                    velocidadX = 0;
                    velocidadY = 1;
                }
                break;
            case KeyEvent.VK_LEFT:
                if (velocidadX == 0) {
                    velocidadX = -1;
                    velocidadY = 0;
                }
                break;
            case KeyEvent.VK_RIGHT:
                if (velocidadX == 0) {
                    velocidadX = 1;
                    velocidadY = 0;
                }
                break;
        }
    }

    public void keyReleased(KeyEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Snake Game");
        int anchoTablero = 800;
        int altoTablero = 600;
        int nivelDificultad = 1; // Cambiar el nivel de dificultad aquí si se desea

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        Diseño diseño = new Diseño(anchoTablero, altoTablero, nivelDificultad, frame);

        frame.add(diseño);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private class Celda {
        int x;
        int y;

        Celda(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private class Roca {
        int x;
        int y;

        Roca(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
