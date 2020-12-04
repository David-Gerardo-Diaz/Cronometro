
package prueba_cronometro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class UTiempo extends Ventana implements ActionListener {

	public UTiempo() {
		t = new Timer(10, this);
		Btn1.addActionListener(this);
		Btn2.addActionListener(this);
		Btn3.addActionListener(this);
		Btn1.setActionCommand("Start");
		Btn2.setActionCommand("Pause");
		Btn3.setActionCommand("Stop");
             
	}

	public Timer t;
	public int cs=0, s, m, h;
        /*private Secundero seg;
        private Minutero min;
        private Horario hor;*/
        Secundero seg = new Secundero();
        Minutero min = new Minutero();
        Horario hor= new Horario();

	public void actionPerformed(ActionEvent ae) {
            
		if ("Start".equals(ae.getActionCommand())) {
			Btn1AcctionPerformed(ae);
		} else if ("Pause".equals(ae.getActionCommand())) {
			Btn2AcctionPerformed(ae);
		} else if ("Stop".equals(ae.getActionCommand())) {
			Btn3AcctionPerformed(ae);
		}
		/*cs++;
		if (cs == 100) {
			cs = 0;
			s++;
		}
		if (s == 60) {
			s = 0;
			m++;
		}
		if (m == 60) {
			m = 0;
			h++;
		}*/
                
                cs++;
           if(cs==100){
               cs=0;
          s++;
          seg.setSeg(s);
        }
           
        if(seg.getSeg()==60){
          seg.setSeg(00);
          s=00;
          m++;
          min.setMin(m);
        }
        if(min.getMin()==60){
          min.setMin(00);
          m=00;
          h++;
          hor.setHor(h);
        }
		actualizar_label();
	}

	public void actualizar_label() {
		String tiempo = (hor.getHor()<=9? "0" : "") + hor.getHor() + ":" + (min.getMin()<=9? "0" : "") +min.getMin()  + ":" + (seg.getSeg()<=9? "0" : "") + seg.getSeg();
		horario.setText(tiempo);
	}

	public void Btn1AcctionPerformed(java.awt.event.ActionEvent evt) {
		t.start();
		Btn1.setEnabled(false);
		Btn1.setText("Reaundar");
		Btn2.setEnabled(true);
		Btn3.setEnabled(true);
	}

	public void Btn2AcctionPerformed(java.awt.event.ActionEvent evt) {
		t.stop();
		Btn1.setEnabled(true);
		Btn2.setEnabled(false);
	}

	public void Btn3AcctionPerformed(java.awt.event.ActionEvent evt) {
		if (t.isRunning()) {
			t.stop();
			Btn1.setEnabled(true);
		}
		Btn1.setText("Iniciar");
		Btn2.setEnabled(false);
		Btn3.setEnabled(false);
		hor.setHor(0);
		min.setMin(0);
		seg.setSeg(0);
		cs = 0;
                h=0;
                m=0;
                s=0;
		actualizar_label();
	}
}
