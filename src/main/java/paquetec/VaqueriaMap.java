/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetec;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

/**
 *
 * @author Víctor
 */
public class VaqueriaMap {

    //Atributos
    private Map<Integer, VaqueriaOrdenada> lista = new TreeMap<>();

    //Constructor
    public VaqueriaMap() {
    }

    //GETTER Y SETTER
    public Map<Integer, VaqueriaOrdenada> getLista() {
        return lista;
    }

    public void setLista(Map<Integer, VaqueriaOrdenada> lista) {
        this.lista = lista;
    }

    //To String
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VaqueriaMap{");
        sb.append("lista=").append(lista);
        sb.append('}');
        return sb.toString();
    }
    //Equals

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.lista);
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
        final VaqueriaMap other = (VaqueriaMap) obj;
        return Objects.equals(this.lista, other.lista);
    }

    //Mostrar
    public void mostrar() {
        lista.forEach((key, valor) -> System.out.println("La clave " + key
                + " tenemos " + valor));
    }
    
    //mostrar la que queramos
    public void mostrarSeleccionada(int numero){
        lista.get(numero);
    }
}
