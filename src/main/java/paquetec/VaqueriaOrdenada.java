/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetec;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Víctor
 */
public class VaqueriaOrdenada {
 //Atributos
    
    private SortedSet<Vaca> vaqueria = new TreeSet<>();
    
    //Constructor

    public VaqueriaOrdenada() {
    }
    //Getter and Setter

    public SortedSet<Vaca> getVaqueria() {
        return vaqueria;
    }

    public void setVaqueria(SortedSet<Vaca> vaqueria) {
        this.vaqueria = vaqueria;
    }
    //To String
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VaqueriaOrdenada{");
        sb.append("vaqueria=").append(vaqueria);
        sb.append('}');
        return sb.toString();
    }
    //Equals and HashCode

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.vaqueria);
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
        final VaqueriaOrdenada other = (VaqueriaOrdenada) obj;
        return Objects.equals(this.vaqueria, other.vaqueria);
    }
    
    //Métodos
    //Metodo para saber el numero de vacas
    public int numeroVacas() {
    return vaqueria.size();
    }
    //Metodo añadir Vaqueria de Vacas
    public void add(Vaca vaca){
        this.vaqueria.add(vaca);
    }
    
    //Método para saber si la vaqueria tiene vacas
    public boolean estaLlena(){
        return !this.vaqueria.isEmpty();
        
    }
    
    //Saber si un animal está en la vaqueria
    public boolean buscarVaca(Vaca vaca){
        return this.vaqueria.contains(vaca);
    }
    
    //Sacar todos los animales en forma de Array
    public ArrayList<Vaca> generarArrayVacas(){
        ArrayList<Vaca> lista = new ArrayList<>(vaqueria);
    
        return lista;
    }
    
    //Dar de baja una vaca
    public void darBajaVaca(Vaca vaca){
        this.vaqueria.remove(vaca);
    }
    
    //Mostrar
    public void mostrar(){
          vaqueria.forEach(System.out::println);
    }
    
    //añadir
    public void añadir(){
        vaqueria.add(new Vaca(1,LocalDate.now(),"Vaca lechera"));
        vaqueria.add(new Vaca(2,LocalDate.now(),"Vaca lechera"));
        vaqueria.add(new Vaca(3,LocalDate.now(),"Vaca lechera"));
    }
}
