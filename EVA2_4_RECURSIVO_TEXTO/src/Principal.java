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
        
        /*for (int i = 1; i <= 10; i++) {
            System.out.println(cadenaRecursiva(i));
        }
        for (int i = 9; i >= 1; i--) {
            System.out.println(cadenaRecursiva(i));
        }
        
        System.out.println("Cadena : " + cadenaRecursiva(5));*/
        
        /*Scanner var = new Scanner(System.in);
        System.out.println("¿Cual es su mensaje?");
        String mensaje3 = var.nextLine();
        String cadena = mensaje3;
        for (int i = 0; i < 10; i++) {
        System.out.println(mensaje3);
        mensaje3 = mensaje3 + cadena;
        
        }
        for (int i = 10; i > 0; i--) {
        for (int j = 0; j < i; j++) {
        System.out.print(cadena);
        }
        System.out.println("");
        }*/
        System.out.println(cadenaRecursiva(4));
        
    }
    
    public static String cadenaRecursiva(int iNum){
        if(iNum > 1){
            return " * " + cadenaRecursiva(iNum - 1);
        }else{
            return " * ";
        }
    }
    
    /*  public static String cadenaRecursiva1(int iNum){
    String cadena;
    while(iNum > 1){
    cadena = " * " + cadenaRecursiva1(iNum -1);
    iNum --;
    }
    }*/
    
}
