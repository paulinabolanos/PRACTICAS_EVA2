
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

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
        LinkedList <Persona> llPersonas = new LinkedList();
        llPersonas.add(new Persona("Paulina ", "Bola ", 18 , true, 1000.87));
        llPersonas.add(new Persona("Paul ", "Estrada ", 20 , false , 4500.97));
        llPersonas.add(new Persona("Suli ", "Cesar ", 80 , true, 7800.34));
        llPersonas.add(new Persona("Wilchis ", "Tacos ", 34 , false , 2300.23));
        llPersonas.add(new Persona("Juan ", "Sembrando ", 56 , true, 6700.45));
        
        for(Persona llPersona : llPersonas){
            System.out.println("Nombre: " + llPersona.getsNombre() + "\n" + 
                               "Apellido: " + llPersona.getsApellido() + "\n" +
                               "Edad: " + llPersona.getiEdad() + "\n" +
                               "Sexo: " + llPersona.isbSexo() + "\n" +
                               "Salario: " + llPersona.getdSalario() + "\n");
        }
        
        Comparator cmCriterioOrdenA = new Comparator(){//CLASE ANÓNIMA

            @Override
            public int compare(Object o1, Object o2) {
                // + : El objeto 1 es mas grande
                // - : El objeto 1 es mas mas pequeño
                Persona p1 = (Persona)o1;
                Persona p2 = (Persona)o2;
                String sApellido1, sApellido2;
                sApellido1 = p1.getsApellido();
                sApellido2 = p2.getsApellido();
                char c1, c2;
                c1 = sApellido1.charAt(0); //arreglo
                c2 = sApellido2.charAt(0);
                return c1 - c2;
            }
            
        };
        
        /*Comparator cmCriterioOrdenE = new Comparator(){
        
        @Override
        public int compare(Object o1, Object o2) {
        Persona p1 = (Persona)o1;
        Persona p2 = (Persona)o2;
        int iEdad1, iEdad2;
        iEdad1 = p1.getiEdad();
        iEdad2 = p2.getiEdad();
        
        }
        
        };*/
        
        System.out.println("");
        System.out.println("LISTA ORDENADA (APELLIDO)");
        Collections.sort(llPersonas, cmCriterioOrdenA);
        for(Persona llPersona : llPersonas){
            System.out.println("Nombre: " + llPersona.getsNombre() + "\n" + 
                               "Apellido: " + llPersona.getsApellido() + "\n" +
                               "Edad: " + llPersona.getiEdad() + "\n" +
                               "Sexo: " + llPersona.isbSexo() + "\n" +
                               "Salario: " + llPersona.getdSalario() + "\n");
        }
        
    }
    
}
class Persona{
    private String sNombre;
    private String sApellido;
    private int iEdad;
    private boolean bSexo;
    private double dSalario;

    public Persona(String sNombre, String sApellido, int iEdad, boolean bSexo, double dSalario) {
        this.sNombre = sNombre;
        this.sApellido = sApellido;
        this.iEdad = iEdad;
        this.bSexo = bSexo;
        this.dSalario = dSalario;
    }

    public String getsNombre() {
        return sNombre;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public String getsApellido() {
        return sApellido;
    }

    public void setsApellido(String sApellido) {
        this.sApellido = sApellido;
    }

    public int getiEdad() {
        return iEdad;
    }

    public void setiEdad(int iEdad) {
        this.iEdad = iEdad;
    }

    public boolean isbSexo() {
        return bSexo;
    }

    public void setbSexo(boolean bSexo) {
        this.bSexo = bSexo;
    }

    public double getdSalario() {
        return dSalario;
    }

    public void setdSalario(double dSalario) {
        this.dSalario = dSalario;
    }
    
    
    
    
}
