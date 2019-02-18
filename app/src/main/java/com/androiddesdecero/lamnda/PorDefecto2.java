package com.androiddesdecero.lamnda;

/**
 * Created by albertopalomarrobledo on 15/2/19.
 */

public interface PorDefecto2 {

    void mostrarNombre2(String nombre);
    default String nombrePorDefecto(String nombre){
        return nombre + "Default2";
    }
}
