
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author administrador
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arbol arMiArbol = new Arbol();
        try {
            arMiArbol.agregarNuevoNodo(new Nodo(100));
            arMiArbol.agregarNuevoNodo(new Nodo(101));
            arMiArbol.agregarNuevoNodo(new Nodo(97));
            arMiArbol.agregarNuevoNodo(new Nodo(80));
            arMiArbol.agregarNuevoNodo(new Nodo(115));
            arMiArbol.agregarNuevoNodo(new Nodo(114));
            //arMiArbol.agregarNuevoNodo(new Nodo(97)); aqui se lanza excepcion
            arMiArbol.imprimirPreOrden();
            arMiArbol.imprimirInOrden();
            arMiArbol.imprimirPosOrden();
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

class Nodo{
    private int iVal;
    private Nodo nIzq;  //nPrev
    private Nodo nDer;  //nSig

    public Nodo() {
        iVal = 0;
        nIzq = null;
        nDer = null;
    }

    public Nodo(int iVal) {
        this.iVal = iVal;
        nIzq = null;
        nDer = null;
    }

    public int getiVal() {
        return iVal;
    }

    public void setiVal(int iVal) {
        this.iVal = iVal;
    }

    public Nodo getnIzq() {
        return nIzq;
    }

    public void setnIzq(Nodo nIzq) {
        this.nIzq = nIzq;
    }

    public Nodo getnDer() {
        return nDer;
    }

    public void setnDer(Nodo nDer) {
        this.nDer = nDer;
    }
    
}

class Arbol{
    private Nodo nRoot;
    
    public Arbol(){
        nRoot = null;
    }
    
    public Arbol(Nodo nNodo){
        nRoot = nNodo;
    }
    
    public void agregarNuevoNodo(Nodo nNodo) throws Exception{
        agregarNodo(nRoot, nNodo);
    }
    
    public void agregarNodo(Nodo nActual, Nodo nNodo) throws Exception{
        if(nRoot == null){
            nRoot = nNodo;
        }else{
            if(nNodo.getiVal() < nActual.getiVal()){//MENOR
                if(nActual.getnIzq() == null){ //POSICION VACIA (NULL) AQUI VA
                    nActual.setnIzq(nNodo);
                }else{//AQQUI HAY UN NODO
                    agregarNodo(nActual.getnIzq(), nNodo);
                }
            }else if(nNodo.getiVal() > nActual.getiVal()){//MAYOR
                if(nActual.getnDer() == null){ //POSICION VACIA (NULL) AQUI VA
                    nActual.setnDer(nNodo);
                }else{//AQQUI HAY UN NODO
                    agregarNodo(nActual.getnDer(), nNodo);
                }
            }else {//VALORES IGUALES (NO ACEPTAMOS VALORES REPETIDOS)
                throw new Exception("NO SE ACEPTAN VALORES REPETIDOS");
            }
        }
    }
    
    public void imprimirPreOrden(){
        impPO(nRoot);
    }
    
    public void impPO(Nodo nActual){
        if(nActual != null){
            System.out.print(nActual.getiVal() + " - ");//visitar el nodo
            impPO(nActual.getnIzq());//rrecorer el lado derecho
            impPO(nActual.getnDer());//recorrer el lado derecho
        }
    }
    
    public void imprimirInOrden(){
        impIO(nRoot);
    }
    
    public void impIO(Nodo nActual){
        if(nActual != null){
            impPO(nActual.getnIzq());//rrecorer el lado izquierdo
            System.out.print(nActual.getiVal() + " - ");//visitar el nodo
            impPO(nActual.getnDer());//recorrer el lado derecho
        }
    }
    
    public void imprimirPosOrden(){
        impPSO(nRoot);
    }
    
    public void impPSO(Nodo nActual){
        if(nActual != null){
            impPO(nActual.getnIzq());//rrecorer el lado izquierdo
            impPO(nActual.getnDer());//recorrer el lado derecho
            System.out.print(nActual.getiVal() + " - ");//visitar el nodo
        }
    }
}
