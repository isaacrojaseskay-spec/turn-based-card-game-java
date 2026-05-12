/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juego_de_cartas_por_turnos;

/**
 *
 * @author isaac
 */
public class Lista_Simple {
    private Nodo_Lista_Simple inicio;
    private int cantidad;

    public Lista_Simple() {
        inicio = null;
        cantidad = 0;
    }

    public boolean vacia() {
        return inicio == null;
    }

    public void agregarFinal(int dato) {
        if (vacia()) {
            inicio = new Nodo_Lista_Simple(dato);
        } else {
            Nodo_Lista_Simple aux = inicio;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(new Nodo_Lista_Simple(dato));
        }
        cantidad++;
    }

    public int eliminarPorPosicion(int pos) {
        Nodo_Lista_Simple aux = inicio;
        int eliminado;

        if (pos == 1) {
            eliminado = inicio.getDato();
            inicio = inicio.getSiguiente();
        } else {
            for (int i = 1; i < pos - 1; i++) {
                aux = aux.getSiguiente();
            }
            eliminado = aux.getSiguiente().getDato();
            aux.setSiguiente(aux.getSiguiente().getSiguiente());
        }
        cantidad--;
        return eliminado;
    }

    public String mostrarLista() {
        String salida = "";
        Nodo_Lista_Simple aux = inicio;

        int i = 1;
        while (aux != null) {
            salida += i + ". " + aux.getDato() + "\n";
            aux = aux.getSiguiente();
            i++;
        }
        return salida;
    }
}
