/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.time.LocalDate;
import modelo.Personaje;
import servicio.PersonajeServicioImpl;

/**
 *
 * @author kevinandres
 */
public class PersonajeControlador {

    private PersonajeServicioImpl personajeServicioImpl;

    public PersonajeControlador() {
        this.personajeServicioImpl = new PersonajeServicioImpl();

    }

    public String crear(String[] data) {
        var retorno = "No se pudo crear el Personaje";

        var nombrePersonaje = data[0];
        var nombreActor = data[1];
        var codigo = Integer.valueOf(data[2]).intValue();
        var papel = data[3];
        var anio = Integer.valueOf(data[4]).intValue();
        var mes = Integer.valueOf(data[5]).intValue();
        var dia = Integer.valueOf(data[6]).intValue();

        if (anio < 1980 && mes > 12 && dia > 31) {
            retorno += " La fecha de nacimiento es incorrecta";
        } else {
            var personaje = new Personaje(nombrePersonaje, nombreActor, codigo, papel, LocalDate.of(anio, mes, dia));
            this.personajeServicioImpl.crear(personaje);
            retorno = "Personaje " + personaje.getNombrePersonaje() + " creado correctamente";
        }
        return retorno;
    }

    public void setPersonajeServicioImpl(PersonajeServicioImpl personajeServicioImpl) {
        this.personajeServicioImpl = personajeServicioImpl;
    }

    public PersonajeServicioImpl getPersonajeServicioImpl() {
        return personajeServicioImpl;
    }

}
