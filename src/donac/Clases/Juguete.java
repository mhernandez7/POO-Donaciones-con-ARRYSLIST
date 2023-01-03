/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package donac.Clases;

import java.util.ArrayList;

/**
 *
 * @author Miguel
 */
public class Juguete extends Persona {
    
    protected String juguete ;

    public Juguete(String juguete) {
        this.juguete = juguete;
    }
    public Juguete() {
        this.juguete = "";
    }

    public void resultado(ArrayList<Juguete>lista) {
        
        for (int i =0; i< lista.size(); i++){
            
            System.out.println("Los Articulos donados son: "+lista.get(i));
            
        }
            System.out.println("La cantidad de Articulos que fueron donados fue de: "+lista.size());
            
    }

    @Override
    public String toString() {
        return "Articulo  Juguete " + "Nombre=" + juguete + '}';
    }

   
    
}
