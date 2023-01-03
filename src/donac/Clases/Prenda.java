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
public class Prenda extends Persona {

    
     protected String prenda ;

    public Prenda(String prenda) {
        this.prenda = prenda;
    }
    public Prenda() {
        this.prenda = "";
    }

    public void resultado(ArrayList<Prenda>lista) {
        
        for (int i =0; i< lista.size(); i++){
            
            System.out.println("Los Articulos donados son: "+lista.get(i));
            
        }
            System.out.println("La cantidad de Articulos que fueron donados fue de: "+lista.size());
            
    }

    @Override
    public String toString() {
        return "Articulo  Prenda " + "Nombre=" + prenda + '}';
    }
    
}
