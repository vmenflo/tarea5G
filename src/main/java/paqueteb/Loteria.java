/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteb;

import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.TreeMap;

/**
 *
 * @author Víctor
 */
public class Loteria {

    //Atributos
    private Map<Integer, Double> loteria = new TreeMap<>();

    //Constructor
    public Loteria() {
        
    }
    //GETTER AND SETTER

    public Map<Integer, Double> getLoteria() {
        return loteria;
    }

    public void setLoteria(Map<Integer, Double> Loteria) {
        this.loteria = Loteria;
    }

    //To String
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Loteria{");
        sb.append("Loteria=").append(loteria);
        sb.append('}');
        return sb.toString();
    }
    //Equals and HashCode

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.loteria);
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
        final Loteria other = (Loteria) obj;
        return Objects.equals(this.loteria, other.loteria);
    }

    //Métodos
    //Generar mil números aleatorios con sus premios
    public void generarResultadosLoteria() {
        Random r = new Random();
        for (int i = 0; i <= 1000; i++) {
            this.loteria.put(r.nextInt(99999), 
                    r.nextDouble(1000000));
        }
    }
    //Mostrar los numeros
    public void mostrarLoterias(){
        this.loteria.forEach((k,v)-> System.out.printf("El decimo %05d "
                + "tiene un premio de %.2f €\n",k,v));
    }
    
    //Buscar un numero para saber si es premiado
    public void buscarDecimo(Integer numero){
        if(!this.loteria.containsKey(numero)){
            System.out.println("No está premiado");
        }else{
            System.out.println("El decimo " + numero + " tiene un premio de "
                    +this.loteria.get(numero) + " €" );
        }
    }
    //Añadir
    public void añadir(Integer numero, Double premio){
    this.loteria.put(numero,premio );
    }
    
}
