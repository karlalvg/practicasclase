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
public class EstudianteServicioImp implements EstudianteServicio{
    private ArrayList <Estudiante> estudianteList;

    public EstudianteServicioImp() {
         this.estudianteList= new ArrayList<Estudiante> ();
      
    }
    
    public void crear(Estudiante estudiante) {
        this.estudianteList.add(estudiante);
        
        
            }

     @Override
    public void modificar(int codigo, Estudiante estudianteModificado) {
        var indice=0;
        
        this.estudianteList.set(indice, estudianteModificado);
    
    }
    
    public ArrayList<Estudiante> listar() {
        return this.estudianteList;
    }

    public void eliminarPorPosicion(int posicion) {
        this.estudianteList.remove(posicion);

    }

    @Override
    public void eliminar(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    
    
    
    
}
