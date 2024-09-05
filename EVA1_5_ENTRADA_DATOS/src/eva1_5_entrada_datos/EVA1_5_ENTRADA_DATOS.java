/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_entrada_datos;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class EVA1_5_ENTRADA_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //DECLARAR VARIABLES
        String marca;
        String modelo;
        int year;
        double precio;
        //Como se captura? 
        //SCANNER
        //Herramienta --> Clase: nos proporciona muchas herramientas
        Scanner captu;  //Declaramos la herramienta, previamente
                        //Hay que importarlo hacer un import
        captu = new Scanner(System.in); //creamos la herramienta
        
        //HAY QUE INDICARLE AL USUSARIO QUE CAPTURAR
        System.out.println("Introduce la marca del vehiculo");
        //capturamos --> una asignacion
        marca = captu.nextLine(); //
                                  //se presiona la tecla enter
        System.out.println("Introduce el modelo del vehiculo");
        modelo = captu.nextLine();
        
        System.out.println("Introduce el año del vehiculo");
        year = captu.nextInt();
        
        System.out.println("Introduce el precio del vehiculo");
        precio = captu.nextDouble();
        
        System.out.println("DATOS CAPTURADOS------------------------------");  
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(year);
        System.out.println(precio);
    }
    
}
