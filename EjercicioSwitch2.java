/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosIfSwitch;

import java.util.Scanner;

/**
 *
 * @author danielwilfredo.amobe
 */
public class EjercicioSwitch2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero: ");
        int a = sc.nextInt();
        
        System.out.println("introduce un numero: ");
        int b = sc.nextInt();
        
        System.out.println("introduce una operacion: ");
        char c = sc.next().charAt(0);
        
        int suma = a + b;
        int resta = a - b;
        int producto = a * b;
        int division = a/b;
        
        if (c == '+'){
            System.out.println("la suma es:" + suma );
           
        }
        else if ( c== '-'){
            System.out.println("la resta es: " + resta);
        }
        
        else if ( c== '*'){
            System.out.println("la resta es: " + producto);
        }
        
        else if ( c== '/'){
            System.out.println("la division es: " + division);
        }
            
        
       
        // TODO code application logic here
    }
    
}
