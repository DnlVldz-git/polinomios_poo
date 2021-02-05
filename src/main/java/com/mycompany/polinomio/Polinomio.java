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
public class Polinomio {
    
    Monomio inicio, inicio2;
    
    public Polinomio(){
        this.inicio = null;
        this.inicio2=null;
    }
    
    public void sumar(Polinomio p2){
        agregar(p2);        
    }
    
    public void restar(Polinomio p2){
        Monomio aux = p2.inicio;
        while(aux!=null){
            aux.setCoeficiente(aux.getCoeficiente()*-1);
            aux=aux.getSiguiente();
        }
        agregar(p2);        
    }
    
    public void multiplicar(Polinomio p2){
        Monomio aux2 = p2.inicio;
        Monomio aux = inicio;
                
        while(aux!=null){
            aux2=p2.inicio;
            while(aux2!=null){                
                agregar_2(aux.getCoeficiente()*aux2.getCoeficiente(), aux.getExponente()+aux2.getExponente());
                aux2=aux2.getSiguiente();
            }
            aux = aux.getSiguiente();
        }
        
        
    }
    
    public void agregar(Polinomio p){
        Monomio aux = p.inicio;
        while(aux!=null){
            this.agregar(aux.getCoeficiente(), aux.getExponente());
            aux = aux.getSiguiente();
        }
    }
    
    public void agregar(int c, int e){
        Monomio nuevo = new Monomio(c, e);
        
        if(inicio == null){
            inicio = nuevo;
        }else{            
            Monomio aux = inicio;
            Monomio ant = aux;
            if(aux.getExponente()>=nuevo.getExponente()){           
                inicio = nuevo;
                nuevo.setSiguiente(ant);
            }else{                    
                while((aux!=null)&&(aux.getExponente()<=nuevo.getExponente())){      

                    ant = aux;
                    aux = aux.getSiguiente();
                }
                ant.setSiguiente(nuevo);
                nuevo.setSiguiente(aux); 
            }
        }
        simplificar();
    }
    
    
    public void imprimir(){
        Monomio aux = inicio;
        while(aux!=null){
            if(aux!=inicio){
                System.out.print("+");
            }
            System.out.print(aux);
            aux = aux.getSiguiente();
        }
    }
    
    public void simplificar(){
        Monomio aux = inicio;
        Monomio ant =aux;
        while(aux!=null){
            while((aux.getSiguiente()!=null)&&(aux.getExponente()==aux.getSiguiente().getExponente())){
                aux.setCoeficiente(aux.getCoeficiente()+aux.getSiguiente().getCoeficiente());
                ant = aux;
                aux.setSiguiente(aux.getSiguiente().getSiguiente());                
                aux = ant;
            }
            aux = aux.getSiguiente();
        }
    }
    
    public void simplificar_2(){
        Monomio aux = inicio2;
        Monomio ant =aux;
        while(aux!=null){
            while((aux.getSiguiente()!=null)&&(aux.getExponente()==aux.getSiguiente().getExponente())){
                aux.setCoeficiente(aux.getCoeficiente()+aux.getSiguiente().getCoeficiente());
                ant = aux;
                aux.setSiguiente(aux.getSiguiente().getSiguiente());                
                aux = ant;
            }
            aux = aux.getSiguiente();
        }
    }
    
    public void agregar_2(int c, int e){
        Monomio nuevo = new Monomio(c, e);
        
        if(inicio2 == null){
            inicio2 = nuevo;
        }else{            
            Monomio aux = inicio2;
            Monomio ant = aux;
            if(aux.getExponente()>=nuevo.getExponente()){           
                inicio2 = nuevo;
                nuevo.setSiguiente(ant);
            }else{                    
                while((aux!=null)&&(aux.getExponente()<=nuevo.getExponente())){      

                    ant = aux;
                    aux = aux.getSiguiente();
                }
                ant.setSiguiente(nuevo);
                nuevo.setSiguiente(aux); 
            }
        }
        simplificar_2();
    }
    
    public void imprimir_2(){
        Monomio aux = inicio2;
        while(aux!=null){
            if(aux!=inicio2){
                System.out.print("+");
            }
            System.out.print(aux);
            aux = aux.getSiguiente();
        }
    }
    
    public void agregar_2(Polinomio p){
        Monomio aux = p.inicio2;
        while(aux!=null){
            this.agregar(aux.getCoeficiente(), aux.getExponente());
            aux = aux.getSiguiente();
        }
    }
    
}
