/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package donac;

import donac.Clases.Juguete;
import donac.Clases.Lectura;
import donac.Clases.Persona;
import donac.Clases.Prenda;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Donac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner read = new Scanner(System.in);
       short validacion =0;
        System.out.println("Bienvenido a la aplicacion donaciones: ");
        System.out.println("Para donar juguetes presione 1) ");
        System.out.println("Para donar prendas presione  2) ");
        System.out.println("Para donar libros presione   3) ");
        validacion = read.nextShort();
        
        switch (validacion){
        
            case 1: {
                    Juguete();
                    break;
                   }
            case 2: {
                   Prenda();
                   break;
            }
            case 3: {
                    Lectura();
                    break;
            }
            case 4: {
                   System.out.println("Error no ha digitado una opcion valida:"); 
            }
        
        }
    }
    
    public static void Juguete(){
    
        Scanner read = new Scanner(System.in);
        String articuloDona  ="";
        Juguete jugue = new Juguete();
        Persona datos = new Persona();
        ArrayList<Juguete> lista = new ArrayList<>();
        ArrayList<Persona> lista1 = new ArrayList<>();
       
        short validacion =0;
        
        datos.solcitudRegistro();
        lista1.add(datos);
        do{
                System.out.println("Ingrese el nombre del articulo que desea donar: ");
                articuloDona = read.next();
                jugue = new Juguete(articuloDona);
                lista.add(jugue);
                System.out.println("Desea donar otro articulo de juguete: ");
                System.out.println("Presione 2 para salir o cualquier numero para seguir donando: ");
                validacion = read.nextShort();
                
        }while (validacion != 2);
       
        datos.impresionRegistro(lista1);
        jugue.resultado(lista);
   
        
    }
    public static void Prenda(){
        
         Scanner read = new Scanner(System.in);
        String articuloDona  ="";
        Prenda prenda = new Prenda();
        Persona datos = new Persona();
        ArrayList<Prenda> lista = new ArrayList<>();
        ArrayList<Persona> lista1 = new ArrayList<>();
        short validacion =0;
        
        datos.solcitudRegistro();
        lista1.add(datos);
        
        do{
                System.out.println("Ingrese el nombre del articulo que desea donar: ");
                articuloDona = read.next();
                prenda = new Prenda(articuloDona);
                lista.add(prenda);
                System.out.println("Desea donar otro articulo de juguete: ");
                System.out.println("Presione 2 para salir o cualquier numero para seguir donando: ");
                validacion = read.nextShort();
                
        }while (validacion != 2);
        
        datos.impresionRegistro(lista1);
        prenda.resultado(lista);
    
    }
    public static void Lectura(){
        
         Scanner read = new Scanner(System.in);
        String articuloDona  ="";
        Lectura libro = new Lectura();
        Persona datos = new Persona();
        ArrayList<Lectura> lista = new ArrayList<>();
        ArrayList<Persona> lista1 = new ArrayList<>();
        short validacion =0;
        
        datos.solcitudRegistro();
        lista1.add(datos);
        do{
                System.out.println("Ingrese el nombre del articulo que desea donar: ");
                articuloDona = read.next();
                libro = new Lectura(articuloDona);
                lista.add(libro);
                System.out.println("Desea donar otro articulo de juguete: ");
                System.out.println("Presione 2 para salir o cualquier numero para seguir donando: ");
                validacion = read.nextShort();
                
        }while (validacion != 2);
        datos.impresionRegistro(lista1);
        libro.resultado(lista);
    
    }
    
    
}
