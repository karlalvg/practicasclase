/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;
import java.time.LocalDate;

/**
 *
 * @author kevinandres
 */
public class Pelicula {

    private String nombre;
    private int anioEstreno;
    private boolean animada;
    private String clasificacion;
    private String nacionalidad;

    public Pelicula(String nombre, int anioEstreno, boolean animada, String clasificacion, String nacionalidad) {
        this.nombre = nombre;
        this.anioEstreno = anioEstreno;
        this.animada = animada;
        this.clasificacion = clasificacion;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioEstreno() {
        return anioEstreno;
    }

    public void setAnioEstreno(int anioEstreno) {
        this.anioEstreno = anioEstreno;
    }

    public boolean isAnimada() {
        return animada;
    }

    public void setAnimada(boolean animada) {
        this.animada = animada;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int yearsCreacionPelicula() {
        var yearActual = LocalDate.now().getYear();
        return yearActual - this.anioEstreno;

    }
    
    public String nominaciones(){
        if(this.animada == true ){
            return "mejor pelicula animada";
    }
    if (this.animada == false && this.nacionalidad != "estadounidense"){
            return " mejor pelicula del año y mejor pelicula extranjera ";
            
    }
    else {
        return " mejor pelicula del año";
    }
    }

    

    @Override
    public String toString() {
        return "Pelicula{" + "nombre=" + nombre + ", anioEstreno=" + anioEstreno + ", animada="
                + animada + ", clasificacion=" + clasificacion + ", nacionalidad=" + nacionalidad + "tiene"
                + this.yearsCreacionPelicula() + "años de creacion}" + " fue nominada a "
                + this.nominaciones();
    }

}
