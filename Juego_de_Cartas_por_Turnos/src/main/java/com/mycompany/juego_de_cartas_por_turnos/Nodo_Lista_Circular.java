/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juego_de_cartas_por_turnos;

/**
 *
 * @author isaac
 */
public class Nodo_Lista_Circular {
    private Jugador dato;
    private Nodo_Lista_Circular siguiente;

    public Nodo_Lista_Circular(Jugador dato, Nodo_Lista_Circular siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public Jugador getDato() {
        return dato;
    }

    public Nodo_Lista_Circular getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo_Lista_Circular siguiente) {
        this.siguiente = siguiente;
    }
}
