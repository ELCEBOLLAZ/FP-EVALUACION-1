/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_operaciones;

/**
 *
 * @author samue
 */
public class EVA1_7_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //OPERACIONES ARIMETICAS
        int x = 10; //Declaracion y asignacion
        int y = 5;
        //declaracion de multiples variables 
        //del mismo tipo
        int suma, resta, division, multiplicacion, pt, raiz;
        //SUMA Y RESTA
        suma = x + y; //operador de suma +
        System.out.println("Suma de x + y");
        System.out.println(suma);
        
        resta = x - y; //operador de diferencia
        System.out.println("Resta de x - y");
        System.out.println(resta);
        
        multiplicacion = x * y; //operador de multiplicacion
        System.out.println("Multiplicacion de x * y");
        System.out.println(multiplicacion);
        
        //DIVISION --> EL MANEJO DE TIPOS DE DATOS
        //Si dividimos enteros java nos da como resultado un entero
        division = x / y; //operador de division
        System.out.println("Division de x / y");
        System.out.println(division);
        //cambiamos los valores de x y y
        
        x = 5;
        y = 2;
        division = x / y;
        System.out.println("Division entre x(5) / y(3)");
        System.out.println(division);
        
        double val1 = 11;
        double val2 = 3;
        double diviD;
        diviD = val1 / val2;
        System.out.println("Division entre # decimales");
        System.out.println(diviD);
        
    }
    
}
