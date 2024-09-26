/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_16_operador_or;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class EVA1_16_OPERADOR_OR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int km, mes;
         Scanner captu = new Scanner(System.in);
         System.out.println("Cuanto kilometraje tiene el vehiculo?");
         km = captu.nextInt();
         captu.nextLine();
         System.out.println("Cuantos meses tiene el vehiculo?");
         mes = captu.nextInt();
         captu.nextLine();
         
         //Con el or(||) con que una de las condiciones sea verdad nos va a imprimir lo deseado
         if(km >= 5000 || mes>=6){
             System.out.println("Cambio de aceite");
         }else{
             System.out.println("Vehiculo en buenas condiciones");
         }
    }
    
}
