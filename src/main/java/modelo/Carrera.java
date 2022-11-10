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
    private ArrayList <Estudiante> estudianteList;
    

    public Carrera(String nombre, int ciclos) {
        this.nombre = nombre;
        this.ciclos = ciclos;
        this.estudianteList= new ArrayList<Estudiante> ();
      
    }
    
    
    public void nuevoEstudiante (Estudiante e) {
        var estudiante = e;
        this.estudianteList.add(estudiante);
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
        
    
      var retorno = "NombreCarrera=" + nombre + ", NCiclos=" + ciclos + "\n";

        for (int i = 0; i < this.estudianteList.size(); i++) {
            retorno += this.estudianteList.get(i) + "\n";
        }
        return retorno;
    }
    
}
