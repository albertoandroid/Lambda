package com.androiddesdecero.lamnda;

/**
 * Created by albertopalomarrobledo on 11/2/19.
 */

/*
Interfaz Funcional
Una interfaz Funcional es aquella que solo tiene un Método Abstrato. Si nos encontramos dos metodos
no será una Interfaz Funcional.
Para formalizarlo tenemos la anotacion @FunctionalInterface
Esto nos indica que es una interfaz funcional
 */

@FunctionalInterface
public interface MiNombre {
    String miNombre();
}
