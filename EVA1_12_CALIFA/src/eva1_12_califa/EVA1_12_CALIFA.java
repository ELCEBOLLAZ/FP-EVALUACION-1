/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_califa;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class EVA1_12_CALIFA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //DECLARAR VARIABLE PARA LA CALIFICAION
        int calif;
        Scanner captu = new Scanner(System.in);
        System.out.println("Ingresa la calificaion (0-100): ");
        calif = captu.nextInt();
        //EVALUAR SI ACREDITAS (MAYOR O IGUAL A 70)
        //O NO ACREDITAS (NA --> MENOR A 70)
        if(calif>=70) {
            System.out.println("ACREDITAS");
        }else{
            System.out.println("NO ACREDITAS (MENSO)");
        }
    }
    
}
