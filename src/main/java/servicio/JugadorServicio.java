/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Jugador;

/**
 *
 * @author LAB-2
 */

public interface JugadorServicio {

    public abstract void crear(Jugador jugador);

    public abstract void modificar(int codigo, Jugador jugadorModificado);

    public abstract void eliminar(int codigo);

    public abstract List<Jugador> listar();

}