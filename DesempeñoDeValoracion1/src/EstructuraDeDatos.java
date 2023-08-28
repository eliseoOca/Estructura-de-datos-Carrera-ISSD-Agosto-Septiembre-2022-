
public class EstructuraDeDatos {
	public class Nodo {
        int info;
        Nodo ant,sig;
        }
private Nodo raiz,fondo;

    
    public EstructuraDeDatos  () {
    	
        raiz=null;
        fondo=null;
       
       
        
    }
    boolean vacia (){
        if (raiz == null)
            return true;
        else
            return false;
    }
    public int cantidad ()
    {
        int cant = 0;
        Nodo reco = raiz;
        while (reco != null) {
            reco = reco.sig;
            cant++;
        }
        return cant;
    }
    
    //Confeccionar un método que reciba dos enteros.
   public void insertar (int x1,int x2)
    {
        Nodo nuevo;
        nuevo = new Nodo ();
        nuevo.info = x1;
        nuevo.sig = null;
        if (vacia ()) {
            raiz = nuevo;
            fondo = nuevo;
        } else {
            fondo.sig = nuevo;
            fondo = nuevo;
        }
       Nodo otro;
       otro = new Nodo();
       otro.info = x2;
       otro.sig = null;
       if (vacia ()) {
           raiz = otro;
           fondo = otro;
       } else {
           fondo.sig = otro;
           fondo = otro;
       }
    }
    
    //suma los nodos en la posiciones impares
   public void sumaImpares() {
		
		int num = 1;
		int total = 0;
		
		Nodo reco = raiz;
		
		while (reco != null) {
			if(num%2 != 0) {
				total += reco.info;
			}
			num ++;
			reco = reco.sig;
		}
		
		System.out.println(total);
		
	}
   
   //borrar primer nodo
   public void borrarPrimerNodo() 
   {
	   if(raiz!=null) {
		   raiz=raiz.sig;
		   if(raiz!=null) {
			   raiz.ant=null;
			 
		   } 
	
	   }
	   
	   
   }
   
   //borrar ultimo nodo
   public void borrarUltimoNodo() {
	   if(raiz!=null) {
			  if(raiz.sig==null) {
				  raiz=null;
			  }else {
				  Nodo reco=raiz.sig;
				  Nodo atras=reco;
				  while(reco.sig!=null) {
					  atras=reco;
					  reco=reco.sig;
				  }
				 atras.sig=null;
			  }
		  } 
	   
   }
   
   public int cantidadNodo ()
   {
       int cant = 0;
       Nodo reco = raiz;
       while (reco != null) {
           reco = reco.sig;
           cant++;
       }
       return cant;
   }
   //intercambiar primer nodo con ultimo nodo
   public void intercambiarNodo (int pos1, int pos2) {
       if (pos1 <= cantidadNodo () && pos2 <= cantidadNodo ())    {
           Nodo reco1 = raiz;
           for (int f = 1 ; f < pos1 ; f++)
               reco1 = reco1.sig;
           Nodo reco2 = raiz;
           for (int f = 1 ; f < pos2 ; f++)
               reco2 = reco2.sig;
           int aux = reco1.info;
           reco1.info = reco2.info;
           reco2.info = aux;
       }
   }
   
    
    public void imprimir ()
    {
        Nodo reco = raiz;
        while (reco != null) {
            System.out.print (reco.info + "-");
            reco = reco.sig;
        }
        System.out.println();
    }
   
    //borrar nodos iguales al primero
    public void borrarIgualesPrimero() {
    	Nodo pri=raiz;
    	Nodo ulti=raiz;
    	Nodo p1=raiz;
    	Nodo prox=pri.sig;
    	
    	while(pri.sig != null) {
    		if (pri.info == p1.info) {
    			ulti.sig = prox;
    			pri = pri.sig;
    			prox=pri.sig;
    		}else {
    			ulti=pri;
    			pri=pri.sig;
    			prox=pri.sig;
    		}
    	}
    }

	public static void main(String[] ar) {
		EstructuraDeDatos lg=new EstructuraDeDatos();
        lg.insertar (1, 2);
        lg.insertar (5, 8);
        lg.insertar (10, 20);
        lg.insertar (200, 4);
        lg.insertar(200,200);
        System.out.println("Consigna 1 (lg.imprimir(); //   1-2-5-8-10-20-200-4:)");
        lg.imprimir ();
        System.out.println("Consigna 2 (Sumar todos los nodos de las posiciones impares (primero de la lista, tercero, etc.) Mostrar dicha suma)");
        lg.sumaImpares();
        System.out.println("Consigna 3.a (Borramos el primero Nodo de la lista:) ");
        lg.borrarPrimerNodo();
        lg.imprimir();
        System.out.println("Consigna 3.b (Borramos el Ultimo Nodo de la lista:) ");
        lg.borrarUltimoNodo();
        lg.imprimir();
        System.out.println("Consigna 4 (Intercambiar el primer nodo con el ultimo:)");
        lg.intercambiarNodo(1, 8);
        lg.imprimir();
        System.out.println("Consigna 5: Borrar todos los nodos que coinciden con la información del primero de la lista (no borrar el primero de la lista) ");
        lg.borrarIgualesPrimero();
        lg.imprimir();
       
        
       
        
       
        
		
	}

}
