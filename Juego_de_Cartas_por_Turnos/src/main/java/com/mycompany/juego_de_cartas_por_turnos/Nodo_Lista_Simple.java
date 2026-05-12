/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juego_de_cartas_por_turnos;

/**
 *
 * @author isaac
 */
public class Nodo_Lista_Simple {
    private int dato;
    private Nodo_Lista_Simple siguiente;

    public Nodo_Lista_Simple(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public Nodo_Lista_Simple(int dato, Nodo_Lista_Simple siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public int getDato() {
        return dato;
    }

    public Nodo_Lista_Simple getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo_Lista_Simple siguiente) {
        this.siguiente = siguiente;
    }
}
