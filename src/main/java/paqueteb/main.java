/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteb;

/**
 *
 * @author Víctor
 */
public class main {
    public static void main(String[] args) {
        Loteria loteria = new Loteria();
        //Muestro todos
        loteria.generarResultadosLoteria();
        //Muestro una búsqueda
        loteria.mostrarLoterias();
        //añado uno premiado
        System.out.println("Buscams el 12345");
        loteria.añadir(12345,1.50);
        loteria.buscarDecimo(12345);
    }
}
