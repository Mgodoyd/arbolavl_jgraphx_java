/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avl;

import javax.swing.JFrame;

/**
 *
 * @author alumno
 */
public class Avl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        abolavl arbol= new abolavl();
        //arbol.insert(arbol.raiz, 20);  //mi raiz no tomaba el nuevo valor
   arbol.raiz= arbol.insert(arbol.raiz, 20);///no estoy mandado por referencia
   arbol.raiz= arbol.insert(arbol.raiz, 15);
   arbol.raiz= arbol.insert(arbol.raiz, 25);
   arbol.raiz= arbol.insert(arbol.raiz, 5);  
    arbol.raiz= arbol.insert(arbol.raiz, 4); 
    
    System.out.println("INORDEN");
    arbol.orden(arbol.raiz);
    jgraphxe frame = new jgraphxe();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 520);
		frame.setVisible(true);
    
    }
    
}
