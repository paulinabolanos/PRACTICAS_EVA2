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
        
        System.out.println(gcd(140,70));
        
    }
    public static int gcd (int dividendo, int divisor){
        
        if(divisor ==  0){
            System.out.println("El máximo común divisor es: ");
            return dividendo;
        }else{
            int division = dividendo / divisor; //3
            int residuo = dividendo - (divisor * division);
            
            return gcd(divisor, residuo); 
        }
    }
    
}
