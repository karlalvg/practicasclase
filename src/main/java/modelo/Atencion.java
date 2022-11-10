/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author LAB-2
 */
public class Atencion {

    private LocalDate fecha;
    private String veterinario;
    private double costo;
    private Dueño owner;
    private Mascota mascota;
    private ArrayList<Receta> recetaList;

    public Atencion(LocalDate fecha, String veterinario, double costo, Dueño owner, Mascota mascota) {
        this.fecha = fecha;
        this.veterinario = veterinario;
        this.costo = costo;
        this.owner = owner;
        this.mascota = mascota;
        this.recetaList = new ArrayList<Receta>();
    }

    public void nuevaReceta(String medicamento, int cantidad, String indicacion) {
        var receta = new Receta(medicamento, cantidad, indicacion);
        this.recetaList.add(receta);
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(String veterinario) {
        this.veterinario = veterinario;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Dueño getOwner() {
        return owner;
    }

    public void setOwner(Dueño owner) {
        this.owner = owner;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public ArrayList<Receta> getRecetaList() {
        return recetaList;
    }

    public void setRecetaList(ArrayList<Receta> recetaList) {
        this.recetaList = recetaList;
    }

    @Override
    public String toString() {
        var retorno = "fecha=" + fecha + ", veterinario=" + veterinario + ", costo=" + costo + "\n";
        for (int i = 0; i < this.recetaList.size(); i++) {
            retorno += this.recetaList.get(i) + "\n";
        }
        return retorno;
    }

    /*
    private int cantidadRecetas;
    private Receta[] recetaList;
    
    public Atencion(LocalDate fecha, String veterinario,double costo,  int cantidadRecetas, Dueño owner, Mascota mascota) {
        this.fecha = fecha;
        this.veterinario = veterinario;
        this.costo = costo;
        this.owner = owner;
        this.mascota = mascota;
        this.cantidadRecetas = cantidadRecetas;
        this.recetaList = new Receta[this.cantidadRecetas];
    }

    public void nuevaReceta(String medicamento, int cantidad, String indicacion, int posicion) {
        var receta = new Receta(medicamento, cantidad, indicacion);
        this.recetaList[posicion] = receta;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(String veterinario) {
        this.veterinario = veterinario;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Dueño getOwner() {
        return owner;
    }

    public void setOwner(Dueño owner) {
        this.owner = owner;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public int getCantidadRecetas() {
        return cantidadRecetas;
    }

    public void setCantidadRecetas(int cantidadRecetas) {
        this.cantidadRecetas = cantidadRecetas;
    }

    public Receta[] getRecetaList() {
        return recetaList;
    }

    public void setRecetaList(Receta[] recetaList) {
        this.recetaList = recetaList;
    }

    @Override
    public String toString() {
      
        System.out.println("El costo de la antencion es: "+costo+"$ la fecha es: "+ fecha +" la cantidad de recetas es: "+ cantidadRecetas);        
        for (int i = 0; i < this.cantidadRecetas; i++) {
            System.out.println(this.recetaList[i]);
        }
        return "";
    }
    
     */
}
