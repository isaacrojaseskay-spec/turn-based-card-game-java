/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.juego_de_cartas_por_turnos;
import java.util.Scanner;
/**
 *
 * @author isaac
 */
public class Juego_de_Cartas_por_Turnos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Lista_Circular jugadores = new Lista_Circular();
        Pila mazo = new Pila();

        
        for (int i = 0; i < 40; i++) {           // se llena el mazo
            mazo.apilar((int) (Math.random() * 15) + 1);
        }

        
        int cantidad = 0;              // validar jugadores
        boolean valido = false;

        while (!valido) {
            try {
                System.out.println("Cantidad de jugadores (2-5):");
                cantidad = Integer.parseInt(sc.nextLine());

                if (cantidad >= 2 && cantidad <= 5) {
                    valido = true;
                }else{
                    System.out.println("Solo entre 2 y 5.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ingrese solo numeros.");
            }
        }

        
        for (int i = 0; i < cantidad; i++) { // nombres

            String nombre = "";
            boolean nombreValido = false;

            while (!nombreValido) {
                System.out.println("Nombre jugador " + (i + 1) + ":");
                nombre = sc.nextLine();

                if (nombre.matches("[a-zA-Z ]+")) {
                    nombreValido = true;
                }else{
                    System.out.println("Solo letras.");
                }
            }
            
            jugadores.agregarFinal(new Jugador(nombre));// se crea un jugador y se inserta en la lista circular
        }

       
        Nodo_Lista_Circular aux = jugadores.getInicio(); // se reparten las cartas

        do {
            for (int i = 0; i < 3; i++) {
                aux.getDato().getMano().agregarFinal(mazo.desapilar());
            }
            aux = aux.getSiguiente();
        } while (aux != jugadores.getInicio());

        
        while (!mazo.vacia()) {     // juego

            int referencia = mazo.desapilar();
            System.out.println("Carta referencia: " + referencia);

            aux = jugadores.getInicio();

            do {
                Jugador j = aux.getDato();

                System.out.println("Turno de: " + j.getNombre());
                System.out.println(j.getMano().mostrarLista());

                int opcion = 0;
                boolean ok = false;

                while (!ok) {
                    try{
                        System.out.println("Elija carta (1-3):");
                        opcion = Integer.parseInt(sc.nextLine());

                        if (opcion >= 1 && opcion <= 3) {
                            ok = true;
                        }else{
                            System.out.println("Solo 1,2 o 3.");
                        }
                    }catch (NumberFormatException e) {
                        System.out.println("Numero invalido.");
                    }
                }

                int carta = j.getMano().eliminarPorPosicion(opcion);// Puntos. se elimina la carta seleccionada y se
                                                                    //compara con la de referencia

                System.out.println("Carta jugada: " + carta);

                if (carta > referencia) {
                    System.out.println("+2 puntos");
                    j.setPuntos(j.getPuntos() + 2);
                } else if (carta == referencia) {
                    System.out.println("+1 punto");
                    j.setPuntos(j.getPuntos() + 1);
                } else {
                    System.out.println("+0 puntos");
                }

                if (!mazo.vacia()) {
                    j.getMano().agregarFinal(mazo.desapilar());
                }

                aux = aux.getSiguiente();

            } while (aux != jugadores.getInicio());

            
            System.out.println("PUNTAJES:");// puntajes parciales
            aux = jugadores.getInicio();

            do {
                System.out.println(aux.getDato().getNombre() + ": " + aux.getDato().getPuntos());
                aux = aux.getSiguiente();
            } while (aux != jugadores.getInicio());
        }

        
        System.out.println("FIN DEL JUEGO");// finales

        Nodo_Lista_Circular auxx = jugadores.getInicio();
        int mayor = auxx.getDato().getPuntos();

        do {
            if (auxx.getDato().getPuntos() > mayor) {
                mayor = auxx.getDato().getPuntos();
            }
            auxx = auxx.getSiguiente();
        } while (auxx != jugadores.getInicio());

        int contador = 0;
        auxx = jugadores.getInicio();

        do {
            if (auxx.getDato().getPuntos() == mayor) {
                contador++;
            }
            auxx = auxx.getSiguiente();
        } while (auxx != jugadores.getInicio());

        auxx = jugadores.getInicio();

        if (contador > 1) {
            System.out.println("Empate entre:");
            do{
                if (auxx.getDato().getPuntos() == mayor) {
                    System.out.println(auxx.getDato().getNombre());
                }
                auxx = auxx.getSiguiente();
            } while (auxx != jugadores.getInicio());
        }else{
            do{
                if (auxx.getDato().getPuntos() == mayor) {
                    System.out.println("Ganador: " + auxx.getDato().getNombre());
                }
                auxx = auxx.getSiguiente();
            } while (auxx != jugadores.getInicio());
        }
    }
}
