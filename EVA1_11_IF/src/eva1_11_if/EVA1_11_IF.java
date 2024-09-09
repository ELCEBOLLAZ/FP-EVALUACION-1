/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_if;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class EVA1_11_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CONDICIONAL
        //LOGICA BOOLEANA --> OPERACIONES DE VERDADERO FALSO
        //SOLICITAR LA EDAD EN AÑOS
        int edad;
        Scanner captu = new Scanner(System.in);
        System.out.println("Captura la edad: ");
        edad = captu.nextInt();
        //DERERNUBAE SI ES ES ADULTO O NO
        //LAS OPERACIONES LOGCAS SOLO GENRAN COMO
        //RESULTADO UN VERDADERI O UN FALSO
        //si son varias instrucciones, hay que
        //afruparlas con llaves {}
        if(edad>=18) {//BLOQUE PARA EL VERDADERO
            System.out.println("ES UN ADULTO");
        }else{//BLOQUE PARA EL FALSO
            System.out.println("MENOR DE EDAD");
        }
    }
    
}
