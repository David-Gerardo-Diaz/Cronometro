/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_cronometro;

///import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

/**
 *
 * @author gdmse
 */
public class Horario extends Minutero{
    
 private Minutero min;
  private int hor;
  public Horario(){
    min=new Minutero();
    hor=00;
  }
  public int getHor(){
    return hor;
  }
  public void setHor(int hor){
    this.hor= hor;
  }}
