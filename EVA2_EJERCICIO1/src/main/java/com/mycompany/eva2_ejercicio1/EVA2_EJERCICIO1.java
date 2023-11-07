/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Alberto
 */
public class EVA2_EJERCICIO1 {

    public static void main(String[] args) {
        int nume, nume1;
        Scanner input = new Scanner(System.in);
        System.out.println("Captura el primer numero");
        nume = input.nextInt();
        System.out.println("Captura el segundo numero");
        nume1 = input.nextInt();
        if(nume < nume1){
            for (int i = nume; i <= nume1; i++) {
                System.out.print(i + " - ");
                
            }
        }else 
            for (int i = nume1; i <= nume; i++) {
                System.out.print(i +" - "); 
            }
        
    }
}
