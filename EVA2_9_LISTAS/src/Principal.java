
import java.util.logging.Level;
import java.util.logging.Logger;

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
        Lista miLista = new Lista();
        //miLista.imprimirNodos();
        System.out.println("");
        /*miLista.agregarNodo(new Nodo(15));
        miLista.imprimirNodos();
        System.out.println("");
        miLista.agregarNodo(new Nodo(30));
        miLista.imprimirNodos();
        System.out.println("");
        miLista.agregarNodo(new Nodo(100));
        miLista.imprimirNodos();
        System.out.println("");
        miLista.agregarNodo(new Nodo(150));
        miLista.imprimirNodos();
        System.out.println("");
        miLista.vaciarLista();
        miLista.imprimirNodos();*/
        
        for (int i = 0; i < 6; i++) {
        int iVal = (int)(Math.random() * 10) + 1;
        miLista.agregarNodoMejorado(new Nodo(iVal));
        }
        miLista.imprimirNodos();
        miLista.encontrarPosicion(2);
        
        System.out.println("");
        miLista.borrarNodo(3);
        miLista.imprimirNodos();
        
        /* System.out.println("Cantidad de elementos: " + miLista.contarElementos());
        
        try {
        System.out.println("El elemento en la pisición 5: " + miLista.valorEn(5));
        } catch (Exception ex) {
        Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
        /* System.out.println("");
        miLista.insertarEn(0, new Nodo(99));
        miLista.imprimirNodos();
        
        System.out.println("");
        miLista.insertarEn(5, new Nodo(98));
        miLista.imprimirNodos();
        
        System.out.println("");
        miLista.borrarNodo(4);
        miLista.imprimirNodos();
        
        System.out.println("");
        miLista.listaVacia();*/
        
        
    }
    
}

class Nodo{
    private int iValor;
    private Nodo nSig;
    
    public Nodo(){
        iValor = 0;
        nSig = null;
    }
    
    public Nodo(int iVal){
        iValor = iVal;
        nSig = null;
    }
    
    public Nodo(int iVal, Nodo nNod){
        iValor = iVal;
        nSig = nNod;
    }

    public int getiValor() {
        return iValor;
    }

    public void setiValor(int iValor) {
        this.iValor = iValor;
    }

    public Nodo getnSig() {
        return nSig;
    }

    public void setnSig(Nodo nSig) {
        this.nSig = nSig;
    }
    
}

class Lista{
    private Nodo nIni;
    private Nodo nFin;
    
    public Lista(){
        nIni = null;
        nFin = null;
    }
    public Lista (Nodo nNodo){
        nIni = nNodo;
    }
    
    //AGREGAR NODO LOS COLOCA AL FINAL DE LA LISTA
    public void agregarNodo(Nodo nNodo){//NO VOLVER A USAR JAMAS!!!
        //MOVERNOS AL FINAL DE LA LISTA
        Nodo nTemp = nIni;
        if(nIni == null){
            nIni = nNodo; //CUANDO LA LISTA ESTA VACIA
        }else{
            while(nTemp.getnSig() != null){
                nTemp = nTemp.getnSig();
            }
            nTemp.setnSig(nNodo);
        }
    }
    public void agregarNodoMejorado(Nodo nNodo){
        if(nIni == null){
            nIni = nNodo; //CUANDO LA LISTA ESTA VACIA
            nFin =nNodo;
        }else{
            nFin.setnSig(nNodo);
            nFin = nNodo;
        }
    }
    
    //IMPRIMIR NODOS
    public void imprimirNodos(){
        //MOVERNOS AL FINAL DE LA LISTA
        Nodo nTemp = nIni;
        if(nIni == null){
            System.out.println("LISTA VACIA");//CUANDO LA LISTA ESTA VACIA
        }else{
            while(nTemp!= null){
                System.out.print(nTemp.getiValor() + " - ");
                nTemp = nTemp.getnSig();
            }
        }
    }
   //VACIAR LA LISTA --> AL MENOS PARA JAVA, SIMPLEMENTE nINI
    public void vaciarLista(){
        nIni = null;
        nFin = null;
    }
    
    //CONTAR LOS ELEMNTOS DE LA LISTA:
    public int contarElementos(){
        Nodo nTemp = nIni;
        if(nIni == null){
            return 0;
        }else{
            int iCont = 0;
            while(nTemp!= null){
                iCont ++;
                nTemp =nTemp.getnSig();
            }
            return iCont;
        }
    }
    
    public int valorEn(int iPos) throws Exception{
        //VERIFICAR QUE LA POSICION SEA MENOR AL TAMAÑO DEL ARREGLO
        int iVal = 0;
        if((iPos < contarElementos()) && (iPos >= 0) ){
            Nodo nTemp = nIni;
            int iCont = 0;
            for (int i = 0; i <= iPos; i++) {
                nTemp =nTemp.getnSig();
            }
            iVal = nTemp.getiValor();
            
            /*while(nTemp!= null){
            iCont ++;
            nTemp =nTemp.getnSig();
            }*/
        }else{
            throw new Exception("La posicion no es válida");
        }
        return iVal;
    }
    
    public void insertarEn(int iPos, Nodo nNodo){
        //VERIFICAR IPOS >= 0, IPOS < TAMAÑO DE LA LISTA
        
        if(iPos == 0){//INSERTAR AL INICIO DE LA LISTA:
            nNodo.setnSig(nIni);
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
    
    public void borrarNodo(int iPos){
        int pos = 0;
        Nodo nTemp = nIni;
        if(iPos == 0){
            nIni = null;
        }else if(pos == iPos -1){
            Nodo nNodo;
            nNodo = nTemp.getnSig();
            nTemp.setnSig(nNodo.getnSig());
        }else{
            nTemp = nIni.getnSig();
            pos ++;
        }
    
    }
    
    public void listaVacia(){
        Nodo nTemp = nIni;
        if (nIni == null) {
            System.out.println("Lista vacia");
        }else{
            System.out.println("Lista con elementos");;
        }
    }
    
    public void encontrarPosicion(int iNodo){
       Nodo nTemp = nIni;
        int iPos = 0;
        if(nTemp.getiValor() == iNodo){
           iPos = 0;
            System.out.println(iPos);
        }else{
            nIni.getnSig();
            iPos ++;
        }
        System.out.println(iPos);
    }
}    
