/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Mascota;
import modelo.Atencion;
import modelo.Dueño;
import java.time.LocalDate;

/**
 *
 * @author LAB-2
 */
public class principal_07_11 {

    public static void main(String[] args) {

        var andres = new Dueño("0106043409", "AndresC");
        andres.nuevoTelefono("0980095891", 45, "Móvil", "Movistar");
        andres.nuevoTelefono("074078385", 2, "Casa", "Etapa");
        andres.nuevoTelefono("074135250", 1287, "Fijo IP", "Etapa");
        var mascota1 = new Mascota("Lucas", "Perro", "schnauzer", 5, andres);

        var atencion = new Atencion(LocalDate.now(), "Emily Calderon", 20, andres, mascota1);
        atencion.nuevaReceta("Floxamox", 12, "cada 12 horas ");
        atencion.nuevaReceta("Enroflox", 5, "cada 8 horas ");
        atencion.nuevaReceta("Coliflox", 12, "cada 24 horas ");
        atencion.nuevaReceta("Diflovet", 12, "cada 72  horas ");

        System.out.println(andres);
        System.out.println(mascota1);
        System.out.println(atencion);

    }
    /*
        var andres = new Dueño("0106043409", "Andres Calderon", 3);
        andres.nuevoTelefono("0984357604", 0, "Móvil", "tuenti", 0);
        andres.nuevoTelefono("074078385", 2, "Casa", "Etapa", 1);
        andres.nuevoTelefono("074135250", 1287, "Fijo IP", "Etapa", 2);

        var mascota1 = new Mascota("Lucas", "Perro", "schnauzer", 5, andres);

        var atencion = new Atencion(LocalDate.now(), "Emily Calderon", 20, 4, andres, mascota1);
        atencion.nuevaReceta("Floxamox", 12, "cada 12 horas ", 0);
        atencion.nuevaReceta("Enroflox", 5, "cada 8 horas ", 1);
        atencion.nuevaReceta("Coliflox", 12, "cada 24 horas ", 2);
        atencion.nuevaReceta("Diflovet", 12, "cada 72  horas ", 3);

        System.out.println(mascota1);
        System.out.println(mascota1.getOwner().toString());
        System.out.println(atencion.toString());

    }
     */
}
