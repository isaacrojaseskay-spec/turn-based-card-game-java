/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juego_de_cartas_por_turnos;

/**
 *
 * @author isaac
 */
public class Nodo_Pila {
    private int dato;
    private Nodo_Pila siguiente;

    public Nodo_Pila(int dato, Nodo_Pila siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public int getDato() {
        return dato;
    }

    public Nodo_Pila getSiguiente() {
        return siguiente;
    }
}
