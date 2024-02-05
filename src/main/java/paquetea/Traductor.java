/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetea;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import static javax.management.Query.value;

/**
 *
 * @author Víctor
 */
public class Traductor {

    //Atributos
    private Map<String, String> traducciones = new TreeMap<String, String>();

    //Constructor
    public Traductor() {
    }

    //GETTER AND SETER
    public Map<String, String> getTraducciones() {
        return traducciones;
    }

    public void setTraducciones(Map<String, String> traducciones) {
        this.traducciones = traducciones;
    }

    //TO String
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Traductor{");
        sb.append("traducciones=").append(traducciones);
        sb.append('}');
        return sb.toString();
    }

    //Equals and Hash
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.traducciones);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Traductor other = (Traductor) obj;
        return Objects.equals(this.traducciones, other.traducciones);
    }

    //MÉTODOS
    //Mostrar
    public void mostrarTraducciones() {
        System.out.println("List of translations: ");
        this.traducciones.forEach((k, v) -> System.out.println("The meaning of "
                + k + " in Spanish is " + v));
    }

    //Mostrar Traduccion
    public void mostrarTraduccion(String palabraExtranjera) {
        if(!this.traducciones.containsKey(palabraExtranjera)){
            System.out.println("Lo siento, no se encuentra la palabra");
        }else{
        System.out.println("The meaning in Spanish of " + palabraExtranjera + " is "
                + this.traducciones.get(palabraExtranjera));
        }
    }

    //Añadir palabrás
    public void añadirTraduccion(String palabraExtranjera, String español) {
        this.traducciones.put(palabraExtranjera, español);
        //Si hago put a una clave ya existente machaca el valor
    }

    //Borrar palabras
    public void borrarPalabra(String palabraExtranjera) {
        this.traducciones.remove(palabraExtranjera);
    }
    
    //Hacer una correccion
    public void corregirTraduccion(String palabra, String palabraModificar){
    this.traducciones.replace(palabra,palabraModificar);
    }
    
    //método hacer lista palabras extranjeras
    public List<String> mostrarPalabrasExtranjeras(){
        return new ArrayList<>(this.traducciones.keySet());
    }
    //Método para hacer lista palabras español
    public Set<String> mostrarPalabrasEspañolas(){
        //Lo hago con Set para probar
        return new HashSet<>(this.traducciones.values());
    }
}
