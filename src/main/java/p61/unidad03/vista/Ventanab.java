/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad03.vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author LAB-2
 */
public class Ventanab extends JFrame {
    private List<JPanel> jPanelList;
    private List<JLabel> jLabelList;
    qatar qatar = new qatar();

    public Ventanab() throws HeadlessException {
        this.setTitle("Ventana b");
        this.setSize(800, 600);
        this.setLocation(200, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarPanels();
        this.iniciarLabels();
        this.setContentPane(this.jPanelList.get(0));        
        this.setVisible(true);
        this.setContentPane(qatar);
    }
    
    private void iniciarPanels(){
        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        
        this.jPanelList.get(0).setBackground(Color.white);
        this.jPanelList.get(1).setBackground(Color.red);
        this.jPanelList.get(2).setBackground(Color.yellow);
        this.jPanelList.get(3).setBackground(Color.green);
        this.jPanelList.get(4).setBackground(Color.orange);
        
        this.jPanelList.get(0).add(this.jPanelList.get(1));
        this.jPanelList.get(0).add(this.jPanelList.get(2));
        this.jPanelList.get(0).add(this.jPanelList.get(3));
        this.jPanelList.get(0).add(this.jPanelList.get(4));
    }
    
    public void iniciarLabels(){
        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel("Qatar"));
        this.jLabelList.add(new JLabel("Ecuador"));
        this.jLabelList.add(new JLabel("Senegal"));
        this.jLabelList.add(new JLabel("Holanda"));
        
        this.jPanelList.get(1).add(this.jLabelList.get(0));
        this.jPanelList.get(2).add(this.jLabelList.get(1));
        this.jPanelList.get(3).add(this.jLabelList.get(2));
        this.jPanelList.get(4).add(this.jLabelList.get(3));
    }
    
    class qatar extends JPanel{
    private Image imagen;
    
    @Override
    public void paint(Graphics q){
        imagen = new ImageIcon(getClass().getResource("/imagenes/qatar.png")).getImage();
        q.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(q);
    }
    }
        
        
    }
     
    

