/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_aguila_sol;

/**
 *
 * @author samue
 */
public class EVA1_13_AGUILA_SOL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ALEATORIO
        //GENERAR NUMEROS ALEATORIOS
        double valor = Math.random();
        //random genera valores >= 0 y < a 1
        //entre 0 y .999999999999
        //0 1 2 3 4 5 6 7 8 9
        if(valor < 0.5){
            System.out.println("AGUILA");
        }else{
            System.out.println("SELLO"); 
        }
    }
    
}
