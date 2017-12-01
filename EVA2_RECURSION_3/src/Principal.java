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
        System.out.println(potenciaN(3,3));
    }
    
    public static int potenciaN (int base, int n){
        if(n == 1){
            return base;
        }else if (n == 2){
            return base * base;
        }else{
            return base * potenciaN(base, n - 1);
        }
    }
    
}
