/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Estudiante;
import modelo.Jugador;

/**
 *
 * @author LAB-2
 */
public interface EstudianteServicio {

    public abstract void crear(Estudiante estudiante);

    public abstract void modificar(int codigo, Estudiante estudianteModificado);

    public abstract void eliminar(int codigo);

    public abstract List<Estudiante> listar();

}
