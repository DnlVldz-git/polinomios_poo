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
public class Monomio {
    
    private int coeficiente;
    private int exponente;
    private Monomio siguiente;
    

    public Monomio(int c, int e){
        this.coeficiente = c;
        this.exponente = e;
        this.siguiente = null;
        
    }
    
    public Monomio(){
        this.coeficiente = 0;        
        this.exponente = 0;
        this.siguiente = null;
    }
    
    public String toString(){
        return String.format("%dx^%d", this.coeficiente, this.exponente);
    }
    
    public int getCoeficiente() {
        return coeficiente;
    }
    
    public void setCoeficiente(int coeficiente) {
        this.coeficiente = coeficiente;
    }

    public int getExponente() {
        return exponente;
    }

    public void setExponente(int exponente) {
        this.exponente = exponente;
    }
    
    public Monomio getSiguiente(){
        return this.siguiente;
    }
    
    public void setSiguiente(Monomio siguiente){
        this.siguiente = siguiente;
    }
    
    
}
