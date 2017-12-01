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
    static int iCont = 0;
    public static void main(String[] args) {
        // TODO code application logic here

        //System.out.println("Fibonacci de 9 = " + fibonacci(9));
        
        for (int i = 0; i <= 9; i++) {
            System.out.print(fibonacci(i) + " - ");
        }
    }
    
    public static int fibonacci(int posicion){
  
        
        /*iCont ++;
        System.out.println(iCont);*/
        
        /*if(posicion == 0)
        return 0;
        else if (posicion == 1)
        return 1;
        else
        return fibonacci(posicion - 1) + fibonacci (posicion - 2);*/
        
        switch(posicion){
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return fibonacci(posicion - 1) + fibonacci(posicion - 2);
        }
    }
    
}
