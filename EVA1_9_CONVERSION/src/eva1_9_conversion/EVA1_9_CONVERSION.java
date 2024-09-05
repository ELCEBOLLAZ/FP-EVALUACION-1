/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_conversion;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class EVA1_9_CONVERSION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double farh, cent, farhe, kelv;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Ingresa los grados en farenheit");
        farh =captu.nextDouble();
        
        cent = (farh - 32) / 1.8;
        farhe = (cent * 1.8) + 32;
        kelv = cent + 273.15;
        
        System.out.println("Los grados farenheit en centigrados son: " + cent);
        System.out.println("Los grados centigrados en farenheit son: " + farhe);
        System.out.println("Los grados centigrados a kelvin son: " + kelv);
    }
    
}
