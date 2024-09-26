/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_15_pantalla_inicio;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class EVA1_15_PANTALLA_INICIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CONSTANTES
        final String USUARIO = "Admin";
        final String PASSWORD = "Admin";
        
        String usu, pswd;
        
        Scanner captu;
        captu = new Scanner(System.in);
        
        System.out.println("Introduce tu usuario");
        usu = captu.nextLine();
        
        System.out.println("Introduce tu contraseña");
        pswd = captu.nextLine();
        //COMOM VALIDAMOS EL ACCESO?
        if(usu.equals(USUARIO) && pswd.equals(PASSWORD)){
            //EL EQUALS SE USA SI AL COMPARAR NO FUNCIONA EL &&
            System.out.println("Acceso concedido");
        }else{
            System.out.println("Acceso denegado");
        }
    }
    
}
