/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetec;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author Víctor
 */
public class Vaca implements Comparable<Vaca>{
     //Atributo
    private int id;
    private LocalDate fechaNacimiento;
    private String descripcion;

    //Constructor
    public Vaca(int id, LocalDate fechaNacimiento, String descripcion) {
        this.id = id;
        this.fechaNacimiento = fechaNacimiento;
        this.descripcion = descripcion;
    }
    //Getter And Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    //To String
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vaca{");
        sb.append("nid=").append(id);
        sb.append("fechaNacimiento=").append(fechaNacimiento);
        sb.append("descripcion=").append(descripcion);
        sb.append('}');
        return sb.toString();
    }

    //Equals y hashcode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.id;
        hash = 29 * hash + Objects.hashCode(this.fechaNacimiento);
        hash = 29 * hash + Objects.hashCode(this.descripcion);
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
        final Vaca other = (Vaca) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        return Objects.equals(this.fechaNacimiento, other.fechaNacimiento);
    }

    //Compare to por fecha
    @Override
    public int compareTo(Vaca o) {
        /*HE ESTADO PROBANDO A ORDENAR POR FECHA, Y EN CASO EMPATE POR ID
        if (this.fechaNacimiento.isBefore(o.getFechaNacimiento())) {
            return -1;//Si es menor devuelve negativo
        } else if (this.fechaNacimiento.isAfter(o.getFechaNacimiento())) {
            return 1;//Si es mayor 1
        } else {//En caso de empate ordenará por id*/
            if (this.id < o.getId()) {
                return -1;//Si es menor -1
            } else if (this.id > o.getId()) {
                return 1; //Si es mayot 1
            } else {
                return 0;
            }
       /* }*/
    }
}
