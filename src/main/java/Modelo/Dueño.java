/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author LAB-2
 */
public class Dueño {
     
    private String cedula;
    private String nombre;
    private int cantidadTelefonos;
    private Telefono[] telefonoList;

    public Dueño(String cedula, String nombre, int cantidadTelefonos) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.cantidadTelefonos = cantidadTelefonos;
        this.telefonoList = new Telefono[this.cantidadTelefonos];
    }

    public void nuevoTelefono(String numero, int extension, String tipoTelefono, String operadora, int posicion) {
        var telefono = new Telefono(numero, extension, tipoTelefono, operadora);
        this.telefonoList[posicion] = telefono;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadTelefonos() {
        return cantidadTelefonos;
    }

    public void setCantidadTelefonos(int cantidadTelefonos) {
        this.cantidadTelefonos = cantidadTelefonos;
    }

    public Telefono[] getTelefonoList() {
        return telefonoList;
    }

    public void setTelefonoList(Telefono[] telefonoList) {
        this.telefonoList = telefonoList;
    }

    @Override
    public String toString() {

        System.out.println("El cliente es: " + nombre + ", su numero de cedula es: " + cedula
                + "\n La cantidad de telefonos es:  " + cantidadTelefonos);
        for (int i = 0; i < this.cantidadTelefonos; i++) {
            System.out.println(this.telefonoList[i]);
        }
        return "";

    }
    
}
