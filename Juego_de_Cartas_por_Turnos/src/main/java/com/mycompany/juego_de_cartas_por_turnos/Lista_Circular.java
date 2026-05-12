/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juego_de_cartas_por_turnos;

/**
 *
 * @author isaac
 */
public class Lista_Circular {
    private Nodo_Lista_Circular inicio;
    private Nodo_Lista_Circular fin;

    public Lista_Circular() {
        inicio = null;
        fin = null;
    }

    public boolean vacia() {
        return inicio == null;
    }

    public void agregarFinal(Jugador dato) {
        if (vacia()) {
            inicio = fin = new Nodo_Lista_Circular(dato, null);
            inicio.setSiguiente(inicio);
        } else {
            Nodo_Lista_Circular nuevo = new Nodo_Lista_Circular(dato, inicio);
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }

    public Nodo_Lista_Circular getInicio() {
        return inicio;
    }
}
