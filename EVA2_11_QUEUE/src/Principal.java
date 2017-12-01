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
        // TODO code application logic here
        
        Queue qFilaSuper = new Queue();
        System.out.println(qFilaSuper.leerPrimerNodo());
        qFilaSuper.agregarNodo(new Nodo (100));
        qFilaSuper.agregarNodo(new Nodo (200));
        qFilaSuper.agregarNodo(new Nodo (300));
        qFilaSuper.agregarNodo(new Nodo (400));
        System.out.println(qFilaSuper.leerPrimerNodo());
        System.out.println(qFilaSuper.removerPrimerNodo());
        System.out.println(qFilaSuper.removerPrimerNodo());
        System.out.println(qFilaSuper.removerPrimerNodo());
        System.out.println(qFilaSuper.removerPrimerNodo());
        System.out.println(qFilaSuper.removerPrimerNodo());
    }
    
}

class Nodo{
    private int iVal;
    private Nodo nPrev;
    private Nodo nSig;
    public Nodo(){
        iVal=0;
        nPrev = null;
        nSig=null;
    }
    public Nodo(int iNum){
        iVal= iNum;
        nPrev=null;
        nSig=null;
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

class Queue{
    Nodo nIni;
    Nodo nFin;

    public Queue(){
        nIni = null;
        nFin =null;     
    }
    public Queue(Nodo nNodo){
        nIni = nNodo;
        nFin = nNodo;
        
    }
    public void agregarNodo(Nodo nNodo) {//AGREGAR UN NODO AL FINAL DE LA LISTA
        if (nIni == null) {
            nIni = nNodo;
            nFin = nNodo;

        } else {
            nFin.setnSig(nNodo);
            nNodo.setnPrev(nFin);
            nFin = nNodo;
        }
    }
    
    public int leerPrimerNodo(){
        int iVal = 0;
        if(nIni == null){
            //lanzar una excepcion
            iVal = 0;//OJO: CERO ES UN ENTERO VÁLIDO, SIEMPRE ES MEJOR LANZAR UNA
            //EXCEPCION
        }else{
            iVal = nIni.getiVal();
        }
        return iVal;
    }
    
    public int removerPrimerNodo(){
        int iVal = 0;
        if(nIni == null){
            //lanzar una excepcion
            iVal = 0;//OJO: CERO ES UN ENTERO VÁLIDO, SIEMPRE ES MEJOR LANZAR UNA
            //EXCEPCION
        }else{
            iVal = nIni.getiVal();
            //ELIMINAR EL PRIMER NODO DE LA LISTA
            //VERIFICAR CANTIDAD DE NODOS
            //SI SOLO HAY UN NODO nINI = null, nFin = null
            if(nIni.getnSig() == null){
                nIni = null;
                nFin = null;
            }else{
                //SI HAY MÁS NODOS, RECONECTAR
                nIni = nIni.getnSig();//NOS CONECTAMOS AL SEGUNDO NODO DE LA LISTA
                nIni.setnPrev(null);
            }
            
        }
        return iVal;
    }
}
