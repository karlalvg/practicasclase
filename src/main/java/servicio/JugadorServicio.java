/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;


import java.util.ArrayList;
import java.util.List;
import modelo.Estudiante;
import modelo.Jugador;
import modelo.Telefono;

/**
 *
 * @author LAB-2
 */
public class JugadorServicio {

    private List<Jugador> jugadorList;

    public JugadorServicio() {
        this.jugadorList = new ArrayList<Jugador>();
    }

    public void crear(Jugador jugador) {
        this.jugadorList.add(jugador);

    }

    public List<Jugador> listar() {
        return this.jugadorList;
    }

    public void eliminarPorPosicion(int posicion) {
        this.jugadorList.remove(posicion);

    }

    
}
