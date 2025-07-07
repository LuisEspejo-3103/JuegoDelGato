/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.juegodelgato;

import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;

/**
 *
 * @author Luis Manuel Espejo Vázquez
 */
public class JuegoDelGato extends JFrame implements ActionListener{
    /*Indicar con comentarios cual es el proposito de cada variable  objeto de la clase*/
    private JButton bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, aceptar,volJu;
    private boolean turno = true, ca1 = true, ca2 = true, ca3 = true, ca4 = true, ca5 = true, ca6 = true, ca7 = true, ca8 = true, ca9 = true;
    private TextField P1, P2;
    private JLabel Ju1, Ju2, win, em;
    private String c1 = "a", c2 = "b", c3 = "c", c4 = "d", c5 = "e", c6 = "f", c7 = "g", c8 = "h", c9 = "i", play1, play2;
    private int con = 0;
    /**
     * @param args the command line arguments
     */
    
    public JuegoDelGato(){
        setLayout(null);
        bt1= new JButton();
        bt2= new JButton();
        bt3= new JButton();
        bt4= new JButton();
        bt5= new JButton();
        bt6= new JButton();
        bt7= new JButton();
        bt8= new JButton();
        bt9= new JButton();
        aceptar = new JButton("Aceptar");
        volJu = new JButton("Volver a jugar");
        P1 = new TextField();
        P2 = new TextField();
        Ju1 = new JLabel("Jugador X ");
        Ju2 = new JLabel("Jugador O ");
        win = new JLabel("El ganador es: ");
        em = new JLabel("Hay un empate");
        Ju1.setBounds(10,10,130,20);
        Ju2.setBounds(150,10,130,20);
        volJu.setBounds(150,70,130,20);
        win.setBounds(10,50,200,20);
        P1.setBounds(10,30,60,20);
        P2.setBounds(150,30,60,20);
        aceptar.setBounds(150,70,130,20);
        add(aceptar);
        aceptar.addActionListener(this);
        win.setVisible(false);
        volJu.setVisible(false);
        em.setBounds(10, 50, 130, 20);
        em.setVisible(false);
        
        add(Ju1);
        add(Ju2);
        add(P1);
        add(P2);
        add(win);
        add(volJu);
        add(em);
        
        volJu.addActionListener(this);
        bt1.setBounds(0,100,100,100);
        bt1.setFont(new Font("arial",Font.BOLD,30));
        bt2.setBounds(100,100,100,100);
        bt2.setFont(new Font("arial",Font.BOLD,30));
        bt3.setBounds(200,100,100,100);
        bt3.setFont(new Font("arial",Font.BOLD,30));
        bt4.setBounds(0,200,100,100);
        bt4.setFont(new Font("arial",Font.BOLD,30));
        bt5.setBounds(100,200,100,100);
        bt5.setFont(new Font("arial",Font.BOLD,30));
        bt6.setBounds(200,200,100,100);
        bt6.setFont(new Font("arial",Font.BOLD,30));
        bt7.setBounds(0,300,100,100);
        bt7.setFont(new Font("arial",Font.BOLD,30));
        bt8.setBounds(100,300,100,100);
        bt8.setFont(new Font("arial",Font.BOLD,30));
        bt9.setBounds(200,300,100,100);
        bt9.setFont(new Font("arial",Font.BOLD,30));
        
        add(bt1);
        bt1.addActionListener(this);
        add(bt2);
        bt2.addActionListener(this);
        add(bt3);
        bt3.addActionListener(this);
        add(bt4);
        bt4.addActionListener(this);
        add(bt5);
        bt5.addActionListener(this);
        add(bt6);
        bt6.addActionListener(this);
        add(bt7);
        bt7.addActionListener(this);
        add(bt8);
        bt8.addActionListener(this);
        add(bt9);
        bt9.addActionListener(this);
    }
    public static void main(String[] args) {
        JuegoDelGato ventana = new JuegoDelGato();
        ventana.setBounds(0,0,300,135);
        ventana.setVisible(true);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // TODO code application logic here
    }
    public String evalua(String c1, String c2,String c3,String c4,String c5, String c6, String c7, String c8, String c9, String playe1, String playe2){
        String ganador = "El ganador es: ";
        if(c1 == c2 && c1 == c3){
            if(c1 == "X"){
                ganador += playe1;con = 0;
            }else{
                ganador += playe2;con = 0;
            }
        }else if(c4 == c5 && c4 == c6){
            if(c4 == "X"){
                ganador += playe1;con = 0;
            }else{
                ganador += playe2;con = 0;
            }
        }else if(c7 == c8 && c7 == c9){
            if(c7 == "X"){
                ganador += playe1;con = 0;
            }else{
                ganador += playe2;con = 0;
            }
        }else if(c1 == c4 && c1 == c7){
            if(c1 == "X"){
                ganador += playe1;con = 0;
            }else{
                ganador += playe2;con = 0;
            }
        }else if(c2 == c5 && c2 == c8){
            if(c2 == "X"){
                ganador += playe1;con = 0;
            }else{
                ganador += playe2;con = 0;
            }
        }else if(c3 == c6 && c3 == c9){
            if(c3 == "X"){
                ganador += playe1;con = 0;
            }else{
                ganador += playe2;con = 0;
            }
        }else if(c1 == c5 && c1 == c9){
            if(c1 == "X"){
                ganador += playe1;con = 0;
            }else{
                ganador += playe2;con = 0;
            }
        }else if(c3 == c5 && c3 == c7){
            if(c3 == "X"){
                ganador += playe1;con = 0;
            }else{
                ganador += playe2;con = 0;
            }
        }
        return ganador;
    }
    public boolean fin(){
        boolean f = false;
        if(win.getText().length() > 15 ){
            ca1 = false; ca2 = false; ca3 = false; ca4 = false; ca5 = false; ca6 = false; ca7 = false; ca8 = false; ca9 = false;
            f = true;
            win.setVisible(true);
            volJu.setVisible(true);
        }
        return f;
    }
    public boolean empate(){
        boolean emp = false;
        if (con == 9){
            em.setVisible(true);
            emp = true;
            con = 0;
            volJu.setVisible(true);
        }
        return emp;
    }
    public void reset(){
        c1 = "a"; bt1.setText("");turno = true; ca1 = true; ca2 = true; ca3 = true; ca4 = true; ca5 = true; ca6 = true; ca7 = true; ca8 = true; ca9 = true;
        c2 = "b"; bt2.setText("");
        c3 = "c"; bt3.setText("");
        c4 = "d"; bt4.setText("");
        c5 = "e"; bt5.setText("");
        c6 = "f"; bt6.setText("");
        c7 = "g"; bt7.setText("");
        c8 = "h"; bt8.setText("");
        c9 = "i"; bt9.setText(""); con = 0;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == volJu){
            setBounds(0,0,300,135);
            setLocationRelativeTo(null);
            P1.setVisible(true);
            P2.setVisible(true);
            aceptar.setVisible(true);
            volJu.setVisible(false);
            win.setText("El ganador es: ");
            win.setVisible(false);
            Ju1.setText("Jugador X ");
            Ju2.setText("Jugador O ");
            P1.setText("");
            P2.setText("");
            reset();
            }
        if(e.getSource() == aceptar){
            if(P1.getText().length() > 0 && P2.getText().length() > 0){
            String player1 = P1.getText();
            Ju1.setText("Jugador X: "+player1);
            String player2 = P2.getText();
            Ju2.setText("Jugador O: "+player2);
            setBounds(0,0,315,500);
            setLocationRelativeTo(null);
            P1.setVisible(false);
            P2.setVisible(false);
            
            aceptar.setVisible(false);
            play1 = player1;
            play2 = player2;
            }else if(P1.getText().length() == 0 || P2.getText().length() == 0){
                Error er = new Error();
                er.setBounds(0,0,300,150);
                er.setVisible(true);
                er.setResizable(false);
                er.setLocationRelativeTo(null);
            }
        }
        if(e.getSource() == bt1){
            if(ca1 == true){
            if(turno == true){
                bt1.setText("X");
                turno = false;
                ca1 = false;
                c1 = "X";
                con++;
                win.setText(evalua(c1, c2, c3, c4, c5, c6, c7, c8, c9, play1, play2));
                if(fin() == true){
                    setLocationRelativeTo(null);
                }
                if(empate()== true){
                    setLocationRelativeTo(null);
                }
                
            }else{
                bt1.setText("O");
                turno = true;
                ca1 = false;
                c1 = "O";
                con++;
                win.setText(evalua(c1, c2, c3, c4, c5, c6, c7, c8, c9, play1, play2));
                if(fin() == true){
                    setLocationRelativeTo(null);
                }
                if(empate()== true){
                    setLocationRelativeTo(null);
                }
            }
            }else{
                
            }
        }
        if(e.getSource() == bt2){
            if(ca2 == true){
            if(turno == true){
                bt2.setText("X");
                turno = false;
                ca2 = false;
                c2 = "X";
                con++;
                win.setText(evalua(c1, c2, c3, c4, c5, c6, c7, c8, c9, play1, play2));
                if(fin() == true){
                    setLocationRelativeTo(null);
                }
                if(empate()== true){
                    setLocationRelativeTo(null);
                }
            }else{
                bt2.setText("O");
                turno = true;
                ca2 = false;
                c2 = "O";
                con++;
                win.setText(evalua(c1, c2, c3, c4, c5, c6, c7, c8, c9, play1, play2));
                if(fin() == true){
                    setLocationRelativeTo(null);
                }
                if(empate()== true){
                    setLocationRelativeTo(null);
                }
            }
            }else{
                
            }
        }
        if(e.getSource() == bt3){
            if(ca3 == true){
            if(turno == true){
                bt3.setText("X");
                turno = false;
                ca3 = false;
                c3 = "X";
                con++;
                win.setText(evalua(c1, c2, c3, c4, c5, c6, c7, c8, c9, play1, play2));
                if(fin() == true){
                    setLocationRelativeTo(null);
                }
                if(empate()== true){
                    setLocationRelativeTo(null);
                }
            }else{
                bt3.setText("O");
                turno = true;
                ca3 = false;
                c3 = "O";
                con++;
                win.setText(evalua(c1, c2, c3, c4, c5, c6, c7, c8, c9, play1, play2));
                if(fin() == true){
                    setLocationRelativeTo(null);
                }
                if(empate()== true){
                    setLocationRelativeTo(null);
                }
            }
            }else{
                
            }
        }
        if(e.getSource() == bt4){
            if(ca4 == true){
            if(turno == true){
                bt4.setText("X");
                turno = false;
                ca4 = false;
                c4 = "X";
                con++;
                win.setText(evalua(c1, c2, c3, c4, c5, c6, c7, c8, c9, play1, play2));
                if(fin() == true){
                    setLocationRelativeTo(null);
                }
                if(empate()== true){
                    setLocationRelativeTo(null);
                }
            }else{
                bt4.setText("O");
                turno = true;
                ca4 = false;
                c4 = "O";
                con++;
                win.setText(evalua(c1, c2, c3, c4, c5, c6, c7, c8, c9, play1, play2));
                if(fin() == true){
                    setLocationRelativeTo(null);
                }
                if(empate()== true){
                    setLocationRelativeTo(null);
                }
            }
            }else{
                
            }
        }
        if(e.getSource() == bt5){
            if(ca5 == true){
            if(turno == true){
                bt5.setText("X");
                turno = false;
                ca5 = false;
                c5 = "X";
                con++;
                win.setText(evalua(c1, c2, c3, c4, c5, c6, c7, c8, c9, play1, play2));
                if(fin() == true){
                    setLocationRelativeTo(null);
                }
                if(empate()== true){
                    setLocationRelativeTo(null);
                }
            }else{
                bt5.setText("O");
                turno = true;
                ca5 = false;
                c5 = "O";
                con++;
                win.setText(evalua(c1, c2, c3, c4, c5, c6, c7, c8, c9, play1, play2));
                if(fin() == true){
                    setLocationRelativeTo(null);
                }
                if(empate()== true){
                    setLocationRelativeTo(null);
                }
            }
            }else{
                
            }
        }
        if(e.getSource() == bt6){
            if(ca6 == true){
            if(turno == true){
                bt6.setText("X");
                turno = false;
                ca6 = false;
                c6 = "X";
                con++;
                win.setText(evalua(c1, c2, c3, c4, c5, c6, c7, c8, c9, play1, play2));
                if(fin() == true){
                    setLocationRelativeTo(null);
                }
                if(empate()== true){
                    setLocationRelativeTo(null);
                }
            }else{
                bt6.setText("O");
                turno = true;
                ca6 = false;
                c6 = "O";
                con++;
                win.setText(evalua(c1, c2, c3, c4, c5, c6, c7, c8, c9, play1, play2));
                if(fin() == true){
                    setLocationRelativeTo(null);
                }
                if(empate()== true){
                    setLocationRelativeTo(null);
                }
            }
            }else{
                
            }
        }
        if(e.getSource() == bt7){
            if(ca7 == true){
            if(turno == true){
                bt7.setText("X");
                turno = false;
                ca7 = false;
                c7 = "X";
                con++;
                win.setText(evalua(c1, c2, c3, c4, c5, c6, c7, c8, c9, play1, play2));
                if(fin() == true){
                    setLocationRelativeTo(null);
                }
                if(empate()== true){
                    setLocationRelativeTo(null);
                }
            }else{
                bt7.setText("O");
                turno = true;
                ca7 = false;
                c7 = "O";
                con++;
                win.setText(evalua(c1, c2, c3, c4, c5, c6, c7, c8, c9, play1, play2));
                if(fin() == true){
                    setLocationRelativeTo(null);
                }
                if(empate()== true){
                    setLocationRelativeTo(null);
                }
            }
            }else{
                
            }
        }
        if(e.getSource() == bt8){
            if(ca8 == true){
            if(turno == true){
                bt8.setText("X");
                turno = false;
                ca8 = false;
                c8 = "X";
                con++;
                win.setText(evalua(c1, c2, c3, c4, c5, c6, c7, c8, c9, play1, play2));
                if(fin() == true){
                    setLocationRelativeTo(null);
                }
                if(empate()== true){
                    setLocationRelativeTo(null);
                }
            }else{
                bt8.setText("O");
                turno = true;
                ca8 = false;
                c8 = "O";
                con++;
                win.setText(evalua(c1, c2, c3, c4, c5, c6, c7, c8, c9, play1, play2));
                if(fin() == true){
                    setLocationRelativeTo(null);
                }
                if(empate()== true){
                    setLocationRelativeTo(null);
                }
            }
            }else{
                
            }
        }
        if(e.getSource() == bt9){
            if(ca9 == true){
            if(turno == true){
                bt9.setText("X");
                turno = false;
                ca9 = false;
                c9 = "X";
                con++;
                win.setText(evalua(c1, c2, c3, c4, c5, c6, c7, c8, c9, play1, play2));
                if(fin() == true){
                    setLocationRelativeTo(null);
                }
                if(empate()== true){
                    setLocationRelativeTo(null);
                }
            }else{
                bt9.setText("O");
                turno = true;
                ca9 = false;
                c9 = "O";
                con++;
                win.setText(evalua(c1, c2, c3, c4, c5, c6, c7, c8, c9, play1, play2));
                if(fin() == true){
                    setLocationRelativeTo(null);
                }
                if(empate()== true){
                    setLocationRelativeTo(null);
                }
            }
            }else{
                
            }
        }
    }
}