/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juegodelgato;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Wicho
 */
public class Error extends JFrame{
    private JLabel menError;
    public Error(){
        setLayout(null);
        menError = new JLabel("Ambos jugadores deben tener nombre");
        menError.setBounds(10, 10, 300, 20);
        add(menError);
    }
    
}
