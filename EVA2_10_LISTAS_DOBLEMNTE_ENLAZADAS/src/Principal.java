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
        ListaDE  ldeMiLista = new ListaDE();
        ldeMiLista.imprimirElementos();
        ldeMiLista.imprimirElementosInv();
        for (int i = 0; i < 10; i++) {
            ldeMiLista.agregarNodo(new Nodo((int) (Math.random() * 100) + 1));
        }
        
        System.out.println("");
        ldeMiLista.imprimirElementos();
        System.out.println("");
        ldeMiLista.imprimirElementosInv();
        
        System.out.println("");
        ldeMiLista.insertarEn(0, new Nodo(8));
        ldeMiLista.imprimirElementos();
    }
    
}

class Nodo{
    private int iVal;
    private Nodo nPrev;
    private Nodo nSig;
    
    public Nodo(){
        iVal = 0;
        nPrev = null;
        nSig = null;
    }
    
    public Nodo(int iNum){
        iVal = iNum;
        nPrev = null;
        nSig = null;
    }

    public int getiVal() {
        return iVal;
    }

    public void setiVal(int iVal) {
        this.iVal = iVal;
    }

    public Nodo getnPrev() {
        return nPrev;
    }

    public void setnPrev(Nodo nPrev) {
        this.nPrev = nPrev;
    }

    public Nodo getnSig() {
        return nSig;
    }

    public void setnSig(Nodo nSig) {
        this.nSig = nSig;
    }
    
    
}

class ListaDE{
    Nodo nIni;
    Nodo nFin;
    public ListaDE(){
        nIni = null;
        nFin = null;
    }
    
    public ListaDE(Nodo nNodo){
        nIni = nNodo;
        nFin = nNodo;
    }
    
    public void agregarNodo(Nodo nNodo){//AGREGAR UN NODO AL FINAL DE LA LISTA
        if(nIni == null){
            nIni = nNodo;
            nFin = nNodo;
        }else{
            nFin.setnSig(nNodo);
            nNodo.setnPrev(nFin);
            nFin = nNodo;
        }
    }
    
    public void imprimirElementos(){
        
        if(nIni == null){
            System.out.println("La lista esta vacia");
        }else{
            Nodo nTemp = nIni;
            while(nTemp != null ){
                System.out.print(nTemp.getiVal() + " - ");
                nTemp = nTemp.getnSig();
            }
        }
        
        
        
    } 
    
    public void imprimirElementosInv(){
        
        if(nIni == null){
            System.out.println("La lista esta vacia");
        }else{
            Nodo nTemp = nFin;
            while(nTemp != null ){
            System.out.print(nTemp.getiVal() + " - ");
            nTemp = nTemp.getnPrev();
            }
        }
        
    }
    
    public void insertarEn(int iPos, Nodo nNodo){
        
        if(iPos == 0){//INSERTAR AL INICIO DE LA LISTA:
            nNodo.setnSig(nIni);
            nIni.setnPrev(nNodo);
            nIni = nNodo;
            
        }else{//INSERTAR EN CUALQUIER POSICION DE LA LISTA (EXCEPTO AL FINAL)
            Nodo nTemp = nIni;
            for (int i = 0; i < (iPos - 1); i++) {
                nTemp = nTemp.getnSig();
            }
            nNodo.setnSig(nTemp.getnSig());
            nTemp.setnSig(nNodo);
        }
    }
}
