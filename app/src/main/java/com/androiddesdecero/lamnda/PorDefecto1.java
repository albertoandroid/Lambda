package com.androiddesdecero.lamnda;

/**
 * Created by albertopalomarrobledo on 15/2/19.
 */

/*
Hasta Java 8 las intefaces solo podían tener metodos abstractos. Es decir métodos que no implementan
ningún tipo de logica, tarea que recaía en la clase que las implementaba.
Pero a partir de java 8 podemos tener metodos por defecto.
 */
public interface PorDefecto1 {

    void mostrarNombre(String nombre);
    default String nombrePorDefecto(String nombre){
        return nombre + "Default1";
    }
}
