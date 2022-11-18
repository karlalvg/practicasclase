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
public class JugadorServiciompl implements JugadorServicio {
    
    private List<Jugador> jugadorList;

    public JugadorServiciompl() {
        this.jugadorList= new ArrayList<>();
    }

    @Override
    public void crear(Jugador jugador) {
        this.jugadorList.add(jugador);
    }

    @Override
    public void modificar(int codigo, Jugador jugadorModificado) {
        var indice=0;
        
        this.jugadorList.set(indice, jugadorModificado);
    
    }

    @Override
    public void eliminar(int codigo) {
        var indice=0;
        for(var jugador:this.jugadorList){
            if(jugador.getCodigo()==codigo){
                this.jugadorList.remove(indice);
                break;
            }else{
                indice++;
            }
        }
    }

    @Override
    public List<Jugador> listar() {
        return this.jugadorList;
    }
    
  
    
    
    
    
}
