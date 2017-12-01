
import java.util.ArrayList;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paulina
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <Integer> alMiArrayList = new ArrayList();
        alMiArrayList.add(100);//0
        alMiArrayList.add(200);//1
        alMiArrayList.add(300);//2
        alMiArrayList.add(400);//3
        alMiArrayList.add(500);//4
        
        for (Integer alMiArrayList1 : alMiArrayList) {
            System.out.print(alMiArrayList1 + " - ");
        }
        alMiArrayList.add(2, 999);
        System.out.println("");
        
        for (Integer alMiArrayList1 : alMiArrayList) {
            System.out.print(alMiArrayList1 + " - ");
        }
        
        //RECORRER UN COLLECTION CON ITERADORES
        System.out.println("\n ITERADOR");
        Iterator itRecorreArray = alMiArrayList.iterator();
        while(itRecorreArray.hasNext()){
            System.out.print(itRecorreArray.next() + " - ");
        }
    }
}
    

