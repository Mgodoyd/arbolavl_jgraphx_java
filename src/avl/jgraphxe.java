/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avl;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author alumno
 */
public class jgraphxe extends JFrame {
    public jgraphxe()
	{
              
		super("Hello, World!");
                
                 abolavl arbol= new abolavl();
                 //arbol.orden(arbol.raiz);
                 
		mxGraph graph = new mxGraph();
		Object parent = graph.getDefaultParent();

		graph.getModel().beginUpdate();
		try
		{      
                    Object padre = graph.insertVertex(parent,null,1,200,0,80,30);
                    Object v[]= new Object[4];
                     int nodo []={4,10,15,11};
                  //String arb[]={"10","15","11","5"};
                 
     
                    for(int i=0; i<4; i++){
                        v[i]=new Object();
                        v[i]=graph.insertVertex(parent,null,nodo [i],100,70*i,80,30);
                        v[i]=graph.insertVertex(parent,null,nodo [i],100,70*i,80,30);
                        v[i]=graph.insertVertex(parent,null,nodo [i],100,70*i,80,30);
                        v[i]=graph.insertVertex(parent,null,nodo [i],100,70*i,80,30);
                            
                    }
                    /*
			Object v1 = graph.insertVertex(parent, null, 20, 380, 250, 80,30);
			Object v2 = graph.insertVertex(parent, null, 5, 100, 200,60, 30);
                        Object v3 = graph.insertVertex(parent, null, 10, 200, 150,60, 30);
                        Object v4 = graph.insertVertex(parent, null, 15, 300, 200,60, 30);
                        Object v5 = graph.insertVertex(parent, null, 11, 250, 250,60, 30);
                        Object v6 = graph.insertVertex(parent, null, 1, 10, 250,60, 30);
                        Object v7 = graph.insertVertex(parent, null, 3, 150, 250,60, 30);
			graph.insertEdge(parent, null, "", v3, v2);
                        graph.insertEdge(parent, null, "", v3, v4);
                        graph.insertEdge(parent, null, "", v4, v5); 
                        graph.insertEdge(parent, null, "", v4, v1);
                        graph.insertEdge(parent, null, "", v2, v6);
                        graph.insertEdge(parent, null, "", v2, v7);
      */
                         for(int i=0; i<4; i++)
                             graph.insertEdge(parent, null, "", padre, v[i]);
   
                              //  arbol.orden(arbol.raiz);
       
                           
                           
 /*  abolavl arbol= new abolavl();
   arbol.raiz= arbol.insert(arbol.raiz, 20);///no estoy mandado por referencia
   arbol.raiz= arbol.insert(arbol.raiz, 15);
   arbol.raiz= arbol.insert(arbol.raiz, 25);
   arbol.raiz= arbol.insert(arbol.raiz, 5);  
    arbol.raiz= arbol.insert(arbol.raiz, 4); */
    
    
		}
		finally
		{
			graph.getModel().endUpdate();
		}

		mxGraphComponent graphComponent = new mxGraphComponent(graph);
		getContentPane().add(graphComponent);
	}
    
   /*   public String inOrden() {
        ArrayList it = this.miArbol.inOrden();
        return (recorrido(it, "Recorrido InOrden"));
    }*/

}
