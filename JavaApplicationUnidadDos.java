/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;


public class JavaApplication1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = leer.nextLine();
        
        System.out.println("Ingrese su Apellido: ");
        String apellido = leer.nextLine();
        
        System.out.println("Ingrese su edad: ");
        int edad = leer.nextInt();
        leer.nextLine();
        
        System.out.println("Ingrese su hobbie: ");
        String hobbie = leer.nextLine();
        
        System.out.println("Ingrese su editor de codigo preferido: ");
        String editorDeCodigoPreferido = leer.nextLine();
        
        System.out.println("Sistema Operativo que utiliza: ");
        String sistemaOperativo = leer.nextLine();
        
        System.out.println("Mi nombre es " +nombre + " "+ apellido+", tengo "+ edad+" años, "+ " mi hobbie favorito es "+hobbie+ ", mi editor de codigo preferido es "+ editorDeCodigoPreferido+ " y el sistema operativo que utilizo es "+ sistemaOperativo);
        
    }
    
}
