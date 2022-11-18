/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author kevinandres
 */
public class Personaje {

    private String nombrePersonaje;
    private String nombreActor;
    private int codigo;
    private String papel;
    private LocalDate fechaNacimientoA;
    private Pelicula pelicula;

    public Personaje(String nombrePersonaje, String nombreActor, int codigo, String papel, LocalDate fechaNacimientoA) {
        this.nombrePersonaje = nombrePersonaje;
        this.nombreActor = nombreActor;
        this.codigo = codigo;
        this.papel = papel;
        this.fechaNacimientoA = fechaNacimientoA;
        // this.pelicula = pelicula;
    }

    public String getNombrePersonaje() {
        return nombrePersonaje;
    }

    public void setNombrePersonaje(String nombrePersonaje) {
        this.nombrePersonaje = nombrePersonaje;
    }

    public String getNombreActor() {
        return nombreActor;
    }

    public void setNombreActor(String nombreActor) {
        this.nombreActor = nombreActor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getPapel() {
        return papel;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }

    public LocalDate getFechaNacimientoA() {
        return fechaNacimientoA;
    }

    public void setFechaNacimientoA(LocalDate fechaNacimientoA) {
        this.fechaNacimientoA = fechaNacimientoA;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    private int calcularEdad() {
        var yearActual = LocalDate.now().getYear();
        return yearActual - this.fechaNacimientoA.getYear();
    }
    
    public String nominaciones(){
        if(this.papel == "Actor Principal" || this.papel == "Actriz Principal" ){
            return " mejor actor principal";
    }
    else {
        return " mejor actor secundario";
    }
    }
    
   

   
    @Override
    public String toString() {
        return "NombrePersonaje= " + nombrePersonaje + ", nombreActor= "
                + nombreActor + ", codigo=" + codigo + ", papel=" + papel
                + ", fechaNacimientoA=" + fechaNacimientoA + ", pelicula=" + pelicula
                + " tiene: " + this.calcularEdad() + " años" + "\n" + "y la pelicula a sido nominada a"
                +" fue nominada a "+ this.nominaciones();
    }

}
