/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_8_area_triangulo;

import java.util.Scanner;

/**
 *
 * @author Alberto
 */
public class EVA1_8_AREA_TRIANGULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double base;
        double altura;
        double area;
        Scanner captura = new Scanner(System.in);
        System.out.println("introduce la base del triangulo:");
       base = captura.nextDouble();
        System.out.println("introduce la altura del triangulo");
        altura = captura.nextDouble();
        area = (base * altura)/2;
        System.out.println("su area es:");
        System.out.println(area);
        
    
        
    }
    
}
