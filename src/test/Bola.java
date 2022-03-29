/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author ASUS A455L
 */
public class Bola {
    double jarijari ;
    
    public void setjarijari(double jarijari){
    this.jarijari=jarijari;
    }
    public void ShowDiameter(){
    double d;
    d=2*jarijari;
        System.out.println("Diameter : "+d);
    
    }
    public void showLuasPermukaan(){
    double l;
    l=4*Math.PI*jarijari/Math.PI*jarijari;
        System.out.println("luas permukaan : "+l);
    
    }
    
    public void showVolume(){
        double v;
        v=4/3*Math.PI*jarijari*jarijari*jarijari;
        System.out.println("volume : "+v);
    }
    
}
