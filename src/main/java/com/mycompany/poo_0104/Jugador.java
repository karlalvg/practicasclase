/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_0104;

/**
 *
 * @author LAB-2
 */
public class Jugador extends Persona{
    
  
    
    private String posicion;
    private Seleccion equipo;
 
    public String mostrarInfoJugador(){
        return this.mostrarInfo()+" juega en la posición de: "+this.posicion
                +" pertenece al esquipo de: "+this.equipo.getNombre();
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Seleccion getEquipo() {
        return equipo;
    }

    public void setEquipo(Seleccion equipo) {
        this.equipo = equipo;
    }
    }
    
   

