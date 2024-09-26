/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_17_rango;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class EVA1_17_RANGO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double califa;
        Scanner captu = new Scanner(System.in);
        System.out.println("Ingresa la calificacion entre 0 y 10");
        califa = captu.nextDouble();
        captu.nextLine();
        
        if(califa>=7 && califa<=10){
            System.out.println("Aprobado");
        }else if(califa<=6.9 && califa>=0){
            System.out.println("Reprobado");
        }else{
            System.out.println("Calificacion no valida");
        }
    }
    
}
