/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import modelo.Telefono;

/**
 *
 * @author LAB-2
 */
public class Carrera {
    private String nombre;
    private int ciclos;
    
    

    public Carrera(String nombre, int ciclos) {
        this.nombre = nombre;
        this.ciclos = ciclos;
       
    }
    
   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCiclos() {
        return ciclos;
    }

    public void setCiclos(int ciclos) {
        this.ciclos = ciclos;
    }

    @Override
    public String toString() {
        
    
     
        return "";
    }
    
}
