/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_cronometro;

//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

/**
 *
 * @author gdmse
 */
public class Minutero extends Secundero{
    private Secundero seg;
  private int min=0;

  public Minutero(){
    seg=new Secundero();
    min=00;
  }   
  public int getMin(){
    return min;
  }
  public void setMin(int min){
    this.min = min;
  }
       }
