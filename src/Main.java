/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author aleja
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Calculadora C1 = new Calculadora("Casio", "Dpcs1", "SN56654");
        Calculadora C2 = new Calculadora();
        
        C1.suma(3, 6);
        C1.suma(3.0, 6.0);
        
        C2.resta(800, 600);                
    }   
}
