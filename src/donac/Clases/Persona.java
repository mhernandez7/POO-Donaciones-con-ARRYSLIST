/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package donac.Clases;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public  class Persona {
    
    protected String nombre;
    protected String contacto;
   

    public String getNombre() {
        return nombre;
    }

    public String getContacto() {
        return contacto;
    }
 
    public void solcitudRegistro(){
    Scanner read = new Scanner(System.in);    
        System.out.println("Ingrese su nombre: ");
        this.nombre = read.next();
        System.out.println("Ingrese su contacto: ");
        this.contacto = read.next();
    }

    public void impresionRegistro(ArrayList<Persona>lista){
        
        for (int i= 0; i<lista.size();i++){
        
            System.out.println("Los datos del registro son: "+lista.get(i));
        }
    
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("nombre=").append(nombre);
        sb.append(", contacto=").append(contacto);
        sb.append('}');
        return sb.toString();
    }
    
    
}
