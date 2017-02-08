/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dido;

/**
 *
 * @author Estudiante
 */
public class Dido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner lec = new java.util.Scanner(System.in);
        
        System.out.println("ingresa el alto y el ancho");
        double a = lec.nextFloat();
        double h = lec.nextFloat();
        
        int resultado = princesita(a,h);
        
        System.out.println(resultado);
    }
    
    static int princesita(double l, double j){
        double r;
        double pi = 3.1416;
        l = l *1000;
        r = l *j;
        
        r = r/pi;
        
        r =pi*((r*r)/4);
        r = r/1000000;
        
        int t = (int)r;
        return t;
        
        
        
    }
    
}
