
package nodos;

import java.util.Scanner;

/**
 *
 * @author Uziel
 */   

public class NODO {
    public static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) { 
        Lista OBJ= new Lista();
    
        
        int OPC;
        String X;
        
        do
        {
            System.out.print("\t\t\n---MENU---\n\n");
        System.out.print("1-AGREGAR\n"
                       + "2-MOSTRAR\n"
                       + "3-ELEIEMINAR PRIMERO\n"
                       + "4-ELEIMINAR ULTIMO\n"
                       + "5-SALIR\n\n");
        System.out.print("ELIGE UNA OPCION:  ");
        OPC=leer.nextInt();
        
        switch(OPC)
                {
            case 1:
                System.out.print("INGRESA EL DATO:  ");
                X=leer.next();
               OBJ.Agregar(X);
                break;
                
            case 2:
              
                OBJ.Mostrar();
                     break;
                
        case 3:
                OBJ.EliminarPrimero();
                    break;
           
        case 4:
            OBJ.EliminarUltimo();
        }
        }
        while(OPC!=5);
    

    
        }
        }


    



   
