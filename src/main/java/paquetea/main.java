/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetea;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Víctor
 */
public class main {
    public static void main(String[] args) {
        //Creo algunas traducciones
        Traductor traductor = new Traductor();
        traductor.añadirTraduccion("Car", "Coche");
        traductor.añadirTraduccion("House", "Casa");
        traductor.añadirTraduccion("Airport", "Aeropuerto");
        traductor.añadirTraduccion("Tuesday", "Lunes");
        
        //Ver traducciones
        traductor.mostrarTraducciones();
        //Ver traducion de una palabra
        traductor.mostrarTraduccion("Car");
        //Ver lista de palabras ingles
        List<String> lista = traductor.mostrarPalabrasExtranjeras();
        System.out.println(lista);
        //Ver lista de palabras en español
        Set<String> setLista = new HashSet<>(traductor.mostrarPalabrasEspañolas());
        System.out.println(setLista);
        //Modificar
        traductor.corregirTraduccion("Tuesday", "Martes");
        //Borrar
        traductor.borrarPalabra("House");
        
        //Mostrar
        traductor.mostrarTraducciones();
    }
}
