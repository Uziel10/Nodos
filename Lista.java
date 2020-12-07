
package nodos;

/**
 *
 * @author Uziel
 */
public class Lista 
    
    {
       NodoU inicio,fin;
        public Lista()
        {
            inicio=null;
            fin=null;
        }
        
        public void Agregar(String Dato)
        {
            inicio= new NodoU(Dato, inicio);
            if(fin==null)
            {
                fin=inicio;
            }
    
}

    public void Mostrar()
            {
                NodoU TEMP=inicio;
                System.out.print("\n\nMOSTRANDO PILA_NODO: ");
                while(TEMP!=null)
                {
                    System.out.print(TEMP.D+"  ");
                    TEMP=TEMP.sig;         
                }
                System.out.print("\n\n");
                
            }
    
    public void EliminarPrimero()
    {
        if(inicio==fin)
        {
            inicio=null;
            fin=null;
        }
            else
            {
                System.out.print("\n\nEL PRIMER NODO SE ELIMINO CORRECTAMENTE...\n");
             inicio=inicio.sig;
            }
        
    }
    
    public String EliminarUltimo()
    {
        String DATO=fin.D;
        
        if(inicio==fin)
        {
            inicio=null;
            fin=null;
        }
        
        else
        {
             System.out.print("\n\nEL ULTIMO NODO SE ELIMINO CORRECTAMENTE...\n");
            NodoU temporal=inicio;
            while(temporal.sig!=fin)
            {
                temporal=temporal.sig;
            }
            fin=temporal;
            fin.sig=null;
        }
            return DATO;
    }
     
    
        
    
    

    }

