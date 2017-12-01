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
        
        System.out.println(sumarDigitos(455));
    }
    
    public static int sumarDigitos(int iNum){
        if (iNum == 0){
            return 0;
        }else {
            return sumarDigitos(iNum / 10) + (iNum % 10);
        }
    }
    
}
