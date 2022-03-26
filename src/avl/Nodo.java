/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avl;

/**
 *
 * @author alumno
 */
public class Nodo {
      int Valor;
    
    Nodo der;
    Nodo iz;
    
    int altura,balanceo;
    
    Nodo(int x){
    this.Valor=x;
    
    altura=0; balanceo=0;
    
    }
}
