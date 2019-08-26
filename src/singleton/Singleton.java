/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author judil
 */
public class Singleton {

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static Singleton getSingle() {
        return Single;
    }

    public static void setSingle(Singleton Single) {
        Singleton.Single = Single;
    }

    private String nombre;
    private static Singleton Single;

    
    private Singleton(String nombre) {
        this.nombre = nombre;
        System.out.println("Mi nombre es: " + this.nombre);
    }

    public static Singleton getSingletonInstance(String nombre) {
        if (Single == null){
            Single = new Singleton  (nombre);
        }
        else{
            System.out.println("No se puede crear el objeto "+ nombre + " porque ya existe un objeto de la clase Sigleton");
        }
        
        return Single;
    }
    public static void main(String[] args) {
        Singleton Juan = Single.getSingletonInstance("Juan");
        Singleton Mr = Single.getSingletonInstance("Mr. Nobody");
        
   
        System.out.println(Juan.getNombre());
        System.out.println(Mr.getNombre()); 
    }
    
}
