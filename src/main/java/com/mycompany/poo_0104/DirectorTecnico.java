/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_0104;

/**
 *
 * @author LAB-2
 */
public class DirectorTecnico extends Persona{
    
 
    private String nacionalidad;
    private int yearsTrayectoria;
    private Seleccion equipo;
   
    
    public String mostrarInfoDirector(){
        return this.mostrarInfo()+" su nacionalidad es: "+ this.nacionalidad
                +" sus anios de trayectoria son  "+this.yearsTrayectoria+" es director de:  "+this.equipo.getNombre();
    }
   
    public void setNacionalidad(String n){
        this.nacionalidad=n;
    }


    public void setYearsTrayectoria(int yearsTrayectoria) {
        this.yearsTrayectoria = yearsTrayectoria;
    }

    public void setEquipo(Seleccion equipo) {
        this.equipo = equipo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getYearsTrayectoria() {
        return yearsTrayectoria;
    }
   
    
    
}
