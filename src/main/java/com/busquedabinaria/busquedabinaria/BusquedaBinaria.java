
package com.busquedabinaria.busquedabinaria;


public class BusquedaBinaria {

    public static void main(String[] args) {
        int A[]= {2,4,6,8,10,12,14,16,18,20,22,24};
        int posicion= BusquedaBinaria(A, 16);
        if(posicion== -1){
            System.out.println("EL dato no se encuentra ");
            
            
        }else{
            System.out.println("EL dato se encuentra en la posicion "+posicion );
             
        }
        
        
    
    }
    
    public static int BusquedaBinaria(int [] A, int dato){ // resivimos parametros 
        int inicio, fin, mitad;
        inicio= 0;
        fin= A.length -1;
        
        
        while(inicio <= fin  ){// realizamos operacion de busqueda con while 
            mitad= (inicio + fin )/2;
            if(A[mitad]==dato){
                return mitad;
            }else if (A[mitad] < dato) {
                inicio= mitad+1;
                
            }else {
                fin = mitad -1;
            }
            
        }
        return -1; // por ssi no se encontro el dato en el arreglo 
        
    }
            
}
