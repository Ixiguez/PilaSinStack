/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilasinstack;
import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class PilaSinStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Bienvenido a la Pila");
        System.out.println("Digite el tamaño de la pila: ");
        
        int tamaño = leer.nextInt();
        int dato = 0, opc =0;
        
        FILO a = new FILO(tamaño);
        
        do {
            System.out.println("Que deseas hacer?");
            System.out.println("1. Ingresa Dato --- 2.Eliminar Dato --- 3.Saber si esta vacia--");
            System.out.println("4. Tamaño de la Pila-- 5. Salir");
            opc = leer.nextInt();
            
         switch (opc){
            case 1:
                System.out.println("Inserte un dato");
                a.Insertar(dato = leer.nextInt());
                System.out.println("Dato Insertado");
                System.out.println("");
                break;
            case 2:
                a.Eliminar();
                break;
            case 3:
                System.out.println(a.vacio());
                System.out.println("");
                break;
            case 4:
                System.out.println(a.Tamaño());
                break;        
        }
    }while (opc != 5);
    
}

}