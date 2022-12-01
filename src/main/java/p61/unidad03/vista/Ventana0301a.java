/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad03.vista;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author LAB-2
 */
public class Ventana0301a extends JFrame {

    private List<JPanel> jPanelList;

    public Ventana0301a(String title) throws HeadlessException {
        super(title);
        this.setSize(800, 600);
        this.setLocation(200, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.jPanelList = new ArrayList<>();
        this.setLayout(new FlowLayout());
    }

        public void iniciarComponentes() {
        var jPanelRojo = new JPanel();
        var jPanelAzul = new JPanel();
        var jPanelVerde = new JPanel();
        var jPanelAmarillo = new JPanel();
        var jPanelRosado = new JPanel();
        
        jPanelRojo.setBackground(Color.red);
        jPanelAzul.setBackground(Color.blue);
        jPanelVerde.setBackground(Color.green);
        jPanelAmarillo.setBackground(Color.yellow);
        jPanelRosado.setBackground(Color.pink);
        
        
        this.jPanelList.add(jPanelRojo);
        this.jPanelList.add(jPanelAzul);
        this.jPanelList.add(jPanelVerde);
        this.jPanelList.add(jPanelAmarillo);
        this.jPanelList.add(jPanelRosado);
        
        
        for (var jPanel : this.jPanelList) {
            this.getContentPane().add(jPanel);
        }
    }
}