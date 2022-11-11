/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Estudiante;
import modelo.Jugador;

/**
 *
 * @author LAB-2
 */
public class EstudianteServicio {
    private ArrayList <Estudiante> estudianteList;

    public EstudianteServicio() {
         this.estudianteList= new ArrayList<Estudiante> ();
      
    }
    
    public void crear(Estudiante estudiante) {
        this.estudianteList.add(estudiante);

    }

    public ArrayList<Estudiante> listar() {
        return this.estudianteList;
    }

    public void eliminarPorPosicion(int posicion) {
        this.estudianteList.remove(posicion);

    }
    
    
}
