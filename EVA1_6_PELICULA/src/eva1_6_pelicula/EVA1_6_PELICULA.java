/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_pelicula;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class EVA1_6_PELICULA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Nombre;
        String Genero;
        String Reparto;
        String Clasificacion;
        int Duracion;
        //Declaracion de variables
        Scanner captu;
        
        captu = new Scanner(System.in);
        
        //INDICA AL USUARIO QUE HAY QUE CAPTURAR
        System.out.println("Dime el nombre de la pelicula");
        Nombre = captu.nextLine();
        
        System.out.println("Introduce el genero de la pelicula");
        Genero = captu.nextLine();
        
        System.out.println("Introduce el reparto de la pelicula");
        Reparto = captu.nextLine();
        
        System.out.println("Introduce la clasificacion de la pelicula");
        Clasificacion = captu.nextLine();
        
        System.out.println("Introduce la duracion de la pelicula en segundos");
        Duracion = captu.nextInt();
        
        System.out.println("DATOS DE LA PELICULA-----------------------");
        System.out.println(Nombre);
        System.out.println(Genero);
        System.out.println(Reparto);
        System.out.println(Clasificacion);
        System.out.println(Duracion);
    }
    
}
