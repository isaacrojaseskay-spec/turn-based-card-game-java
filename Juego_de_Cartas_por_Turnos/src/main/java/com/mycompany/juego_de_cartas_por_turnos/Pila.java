/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juego_de_cartas_por_turnos;

/**
 *
 * @author isaac
 */
public class Pila {
    private Nodo_Pila cima;

    public Pila() {
        cima = null;
    }

    public boolean vacia() {
        return cima == null;
    }

    public void apilar(int dato) {
        cima = new Nodo_Pila(dato, cima);
    }

    public int desapilar() {
        int dato = cima.getDato();
        cima = cima.getSiguiente();
        return dato;
    }
}
