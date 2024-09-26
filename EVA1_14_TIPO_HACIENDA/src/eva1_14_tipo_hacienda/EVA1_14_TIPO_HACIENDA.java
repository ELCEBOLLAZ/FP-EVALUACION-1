/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_tipo_hacienda;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class EVA1_14_TIPO_HACIENDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char tipo;
        Scanner captu = new Scanner(System.in);
        System.out.println("Captura el tipo de persona F(fisica) M(moral): ");
        tipo = captu.nextLine().charAt(0);
        System.out.println("El caractr es " + tipo);
        if(tipo == 'F'){
            System.out.println("Persona fisica");
        }else{
            System.out.println("Persona moral");
        }
    }
    
}
