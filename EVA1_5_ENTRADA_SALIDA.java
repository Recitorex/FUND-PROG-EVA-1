/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_5_entrada_salida;

import java.util.Scanner;

/**
 *
 * @author Alberto
 */
public class EVA1_5_ENTRADA_SALIDA {

    public static void main(String[] args) {
        //1. DECLARACION DE VAIABLES
         String nombre;
         String apellidos;
         String carrera;
         int semestre;
         Scanner capturora = new Scanner(System.in);
         
         //; fin de instrucción en Java 
       //2. CAPTURA DE VARIABLES 
       System.out.println("Inroduce tu nombre:");
       nombre = capturora.nextLine();
       System.out.println("Inroduce tus apellido:");
       apellidos = capturora.nextLine();
       System.out.println("Inroduce tu carrera:");
       carrera = capturora.nextLine();
       System.out.println("Inroduce tu semestre:");
       semestre= capturora.nextInt();
     
               //Java es sensible a mayusculas y minusculas
               //es decir: es diferente System que system 
       //3. Mostrar los datos captuardos
        System.out.println(nombre);
        System.out.println(apellidos);
        System.out.println(carrera);
        System.out.println(semestre);
        
    }
}
