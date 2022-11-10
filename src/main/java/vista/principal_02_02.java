/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Carrera;
import modelo.Estudiante;

/**
 *
 * @author LAB-2
 */
public class principal_02_02 {
    
    public static void main(String[] args) {
    
        var pedro = new Estudiante("0105781587","Pedro ALvarez");
        var karla = new Estudiante("0302721006","Karla Vazquez");
        var andres = new Estudiante("0106043409","Andres Calderon");
        
        var teleco = new Carrera("Telecomunicacion",8);
        teleco.nuevoEstudiante(pedro);
        teleco.nuevoEstudiante(karla);
        
        var arqui = new Carrera("Arquitectura",7);
        arqui.nuevoEstudiante(andres);
        arqui.nuevoEstudiante(karla);
        
        
        System.out.println(teleco);
        System.out.println(arqui);
    
    
    
    
    
    
    
    
    
    }

    
}
