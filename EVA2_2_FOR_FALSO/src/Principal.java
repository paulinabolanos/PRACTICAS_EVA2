/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author temporal2
 */
//El metodo se llama a si mismo
//

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //IMPRIMIR LOS NUMEROS DEL 5 AL 1
        for (int i = 5; i >= 1; i--) {
            System.out.println("i = " + i);
        }
        falsoFor(5);
        System.out.println("");
        falsoForUp(1,5);
    }
    
    public static void falsoFor(int iVal){
        System.out.print(iVal + " - "); //ACCION
        if(iVal > 1)//CONDICION PARA TERMINAR LA RECURSION
            falsoFor(iVal - 1);//LLAMADA RECURSIVA
    }
    
    public static void falsoForUp(int iIni, int iFin){
        System.out.print(iIni + " - ");
        if(iIni < iFin)
            falsoForUp(iIni + 1, iFin);
    }
    
}
