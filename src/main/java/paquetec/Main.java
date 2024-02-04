/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetec;

import java.time.LocalDate;

/**
 *
 * @author Víctor
 */
public class Main {
    public static void main(String[] args) {
        
        VaqueriaMap lista = new VaqueriaMap();
        Vaca vaca=new Vaca(1,LocalDate.now(),"Vaca lechera");
        VaqueriaOrdenada vaqueria = new VaqueriaOrdenada();
        vaqueria.añadir();
        lista.getLista().put(1, new VaqueriaOrdenada());
        lista.getLista().put(2, vaqueria);
        lista.getLista().put(3, new VaqueriaOrdenada());
        
        
        //Buscamos una vaqueria en concreto
        lista.mostrarSeleccionada(2);
        //Mostramos todo lo que tenemos
        lista.mostrar();
    }
}
