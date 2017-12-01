/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author temporal2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nodo <Double> nMiNodo = new Nodo(100.2); 
        nMiNodo.setValor(50.2);
        System.out.println(nMiNodo.getValor());
    }
    
}

class Nodo <T>{
    private T Valor;
    private Nodo nSig;
    private Nodo nPrev;
    public Nodo(T nuevoValor){
        Valor = nuevoValor;
        nSig = null;
        nPrev = null;
    }

    public T getValor() {
        return Valor;
    }

    public void setValor(T Valor) {
        this.Valor = Valor;
    }

    public Nodo getnSig() {
        return nSig;
    }

    public void setnSig(Nodo nSig) {
        this.nSig = nSig;
    }

    public Nodo getnPrev() {
        return nPrev;
    }

    public void setnPrev(Nodo nPrev) {
        this.nPrev = nPrev;
    }
    
}
