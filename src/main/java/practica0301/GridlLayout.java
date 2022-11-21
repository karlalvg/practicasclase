/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica0301;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author LAB-2
 */
public class GridlLayout extends JFrame {

    private List<JPanel> jPanelList;
    private List<JLabel> jLabelList;

    public GridlLayout() throws HeadlessException {
        this.setTitle("GridLayout");
        this.setSize(800, 600);
        this.setLocation(200, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarPaneles();
        this.iniciarLabels();
        this.jPanelList.get(0).setLayout(new GridLayout(3, 2));
        this.setVisible(true);
        
        this.setContentPane(this.jPanelList.get(0));

    }

    private void iniciarPaneles() {

        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());

        this.jPanelList.get(0).setBackground(Color.white);
        this.jPanelList.get(1).setBackground(Color.black);
        this.jPanelList.get(2).setBackground(Color.red);
        this.jPanelList.get(3).setBackground(Color.blue);
        this.jPanelList.get(4).setBackground(Color.pink);
        this.jPanelList.get(5).setBackground(Color.yellow);

        
        this.jPanelList.get(0).add(this.jPanelList.get(1));
        this.jPanelList.get(0).add(this.jPanelList.get(2));
        this.jPanelList.get(0).add(this.jPanelList.get(3));
        this.jPanelList.get(0).add(this.jPanelList.get(4));
        this.jPanelList.get(0).add(this.jPanelList.get(5));
    }
    
    
    public void iniciarLabels(){
        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel("Button 1"));
        this.jLabelList.add(new JLabel("Button 3"));
        this.jLabelList.add(new JLabel("2"));
        this.jLabelList.add(new JLabel("Button 5"));
        this.jLabelList.add(new JLabel("Long-Named Button4"));
        
        
        this.jPanelList.get(1).add(this.jLabelList.get(0));
        this.jPanelList.get(2).add(this.jLabelList.get(1));
        this.jPanelList.get(3).add(this.jLabelList.get(2));
        this.jPanelList.get(4).add(this.jLabelList.get(3));
        this.jPanelList.get(5).add(this.jLabelList.get(4));
        
        
    }

    
}
