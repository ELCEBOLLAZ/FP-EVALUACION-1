/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_formulas;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class EVA1_10_FORMULAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double dist, vel1, temp, acel;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Ingresa la velocidad en kilometros por hora: ");
        vel1 = captu.nextDouble();
        
        System.out.println("Ingresa la aceleracion en kilometros por hora: ");
        acel = captu.nextDouble();
        
        System.out.println("Ingresa el tiempo en horas: ");
        temp = captu.nextDouble();
        
        dist = (vel1 * temp) + (((acel * temp) * (acel * temp)) / 2);
        
        System.out.println("La distancia recorrida es: " + dist);
    }
    
}
