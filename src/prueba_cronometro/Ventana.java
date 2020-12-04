package prueba_cronometro;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ventana extends JFrame {
    JPanel contentpane;
    JLabel Titulo,horario;
    JButton Btn1,Btn2,Btn3;
    
    public Ventana (){
     setBounds(400,250,430,200);
     setVisible(true);
     contentpane = new JPanel();
     contentpane.setBackground(Color.DARK_GRAY);
     setContentPane(contentpane);
     contentpane.setLayout(null);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
     Titulo=new JLabel();
     horario=new JLabel();
     
     Btn1=new JButton();
     Btn2=new JButton();
     Btn3=new JButton();
     
     Titulo.setBounds(115, 10, 200, 25);
     Titulo.setText("CRONOMETRO");
     Titulo.setFont(new Font("Serif",Font.BOLD, 25));
     Titulo.setForeground(Color.WHITE);
     contentpane.add(Titulo);
     
     horario.setBounds(150, 45, 150, 25);
     horario.setText("00:00:00");
     horario.setFont(new Font("Serif",Font.BOLD, 20));
     horario.setForeground(Color.WHITE);
     contentpane.add(horario);
     
    Btn1.setBounds(25, 100, 100, 25);
    Btn1.setText("Iniciar");
    contentpane.add(Btn1);
    
    Btn2.setBounds(155, 100, 100, 25);
    Btn2.setText("Pausar");
    Btn2.setEnabled(false);
    contentpane.add(Btn2);
    
    
    Btn3.setBounds(295, 100, 100, 25);
    Btn3.setText("Detener");
     Btn3.setEnabled(false);
    contentpane.add(Btn3);
    }


}


