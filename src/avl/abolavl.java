/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avl;

/**
 *
 * @author alumno
 */
public class abolavl {
    public Nodo raiz;
    
    int altura(Nodo r)
    {
        if(r==null)
            return 0;
       
        return r.altura;
        
       
    }
    int max(int a, int b)
    { return (a>b)? a:b;}
    
    public Nodo insert(Nodo r, int v)
    {
        if(r== null)
            return new Nodo(v);
       else
            if(r.Valor> v)
            {r.iz=insert(r.iz,v);}
            else
            {r.der=insert(r.der,v);}
                
        r.altura=max(altura(r.iz),altura(r.der))+1;
        
        r.balanceo=balanceo(r);
        
        
        if(r.balanceo>=2)
            System.out.println("desbalanceado\n");
        if(r.balanceo<=-2)
            System.out.println("desbalanceado 2");
       return r; 
    }

    private int balanceo(Nodo r) {
       if(r==null)
           return 0;
       return altura(r.iz)-altura(r.der);
           }
    
    
     void orden(Nodo r)      
      { 
          if(r!=null)
      {
         
          if(r.iz!=null)                    //iz
              orden(r.iz);
          
           System.out.println(" nodo:"+r.Valor);//visitar
          
      if(r.der!=null)                   //dere
            orden(r.der);
      }
 
      }

 
   

   

  

   
}
