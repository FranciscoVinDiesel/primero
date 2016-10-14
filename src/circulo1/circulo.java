/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circulo1;

/**
 *
 * @author Jahiroj
 */
public class circulo {
   private static final double PI = 3.1416;
    private double radioDiametro;
     
    public double getRadio() {
        return radioDiametro;
    }
    public double Area() {
        return PI * Math.pow(radioDiametro, 2);
    }
    public double longitudCirculo() {
        return radioDiametro * 2 * PI;
    }

    public double longitudDiametro() {
        return radioDiametro * PI;
    }

    
    
}
