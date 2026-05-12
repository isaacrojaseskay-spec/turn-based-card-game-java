/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juego_de_cartas_por_turnos;

/**
 *
 * @author isaac
 */
public class Jugador {
    private String nombre;
    private Lista_Simple mano;
    private int puntos;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.mano = new Lista_Simple();
        this.puntos = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public Lista_Simple getMano() {
        return mano;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
}
