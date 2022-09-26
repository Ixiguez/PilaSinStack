/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilasinstack;

/**
 *
 * @author Sergio
 */
public class FILO {
    int vectorPila[];
    int cima;
    
    public FILO(int tamaño){
        vectorPila = new int[tamaño];
        cima=0;
    }
    
    //Metodo Insertar
    public void Insertar(int dato){
        vectorPila[cima]= dato;
        cima++;
    }
    
    //Metodo Eliminar 
    public int Eliminar(){
        int eliminar =0;
        if (cima == 0) {
            System.out.println("La pila esta Vacia");
            
        } else {
            eliminar = vectorPila[cima];
            cima--;
        }
        return eliminar;
    }
    
    
    public boolean vacio(){
        if(cima ==0){
            return true;
        }else{
            return false;
        }
    }
    
    
    public int Tamaño(){
        return vectorPila.length - 1;
    }
    
    
    
}
