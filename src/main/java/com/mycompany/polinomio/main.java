/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.polinomio;

/**
 *
 * @author dani
 */
public class main {
    public static void main(String[] args) {
        Polinomio poli1 = new Polinomio();
        Polinomio poli2 = new Polinomio();
        
        
        
        poli1.agregar(10, 3);
        poli1.agregar(2, 2);
        
        poli2.agregar(3, 2);
        poli2.agregar(3, 3);
        
        
        poli1.sumar(poli2);
        
        //poli1.multiplicar(poli2);
        
        poli1.imprimir();
        
        //poli1.imprimir_2();
        
        
    }
}
