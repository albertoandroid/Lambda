package com.androiddesdecero.lamnda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
Paradigma Funcional
Es un paradigma de la programación declarativa basado en el uso de funciones matematicas.
En contraste con la programación imperativa que enfatiza en los cambios de estado
meditante la mutación de variables

Programación Declarativa. Le decimos al programa "que" es lo que necesita. Ejemplo SQL
Programación Imperativa. Le decimos al programa "como" lo necesitamos. Es decir decimos como implementarlo.

La programación declarativa nos permite tener una semantica más limpia.



A lo largo de este tutorial vamos a ver diferentes opciones de lo que componen el paradigma funcional
y vamos a comenzar con los Lamdas
 */

public class MainActivity extends AppCompatActivity implements PorDefecto1 {

    /*
    Lambdas -> Funciones Anonimas
        -> Esenciales para la programación declarativa
        -> Función sin nombre
        -> La clave de las funciones lambda es que es un metodo abstracto. Es decir un metodo que solo
           esta definido en una interfaz pero no ha sido implementado. Y por lo tanto el programador lo
           puede implemntar donde creamos necesario sin haber heredado de la interfaz.

        Ventajas Funciones Lamda
        1.- Funciones que solo se van a utilizar una vez.
        2.- La funcion puede ser utilizada como parametro de entrada de High Level Funcion
        3.- Muchas veces es una perdida de tiempo y esfuerzo generar una funcion. Es decir hay que irse
        fuera de la linea en la que estamos, hay que darle un buen nombre, ya sabeís que el nombre es
        importante y que no este repetido por nuestros compañeros de codigo, pero si solo
        vamos a utilizar esta función una vez pues no es necesario hacer este esfuerzo.
        4.- Funcionan muy bien con filter, map, reduce etc...
        5.- Codigo más claro
        6.- Reduces las lineas de Codigo. Es decir escribes menos boirpolate codigo

        Extructura
        (argumentos) -> {cuerpo o body "expresión"}
        (arg1, arg2) -> {arg1+arg2}

        //El objetivo final es un codigo más limpio y legible.

        /*
        Expresión lambda es un método anonimo. Sin nombre. Sin embargo, este metodo no se ejecuta solo,
        sino que se usa para implentar un método definido por una interaz funcional.
         */
    /*
    Una interfaz funcional es una interfaz que contine un solo método abstracto.
    Normalmente el método especifica el propósito de la interfaz.

     */



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        Ejemplo de Lambdas sencillas
        () -> "mi nombre es";
        (n) -> n * n;
        (n) -> n==2;
         */

        /*
        Creamos interfaz miNombre
         */
        //Utilizando lambda
        MiNombre miNombre = () -> "Alberto";
        Log.d("TAG1", miNombre.miNombre());

        //Con codigo de la forma de siempre
        MiNombre miNombre1 = new MiNombre() {
            @Override
            public String miNombre() {
                return "paco";
            }
        };
        Log.d("TAG1", miNombre1.miNombre());


        Sumar sumarN = new Sumar() {
            @Override
            public int suma(int a, int b) {
                return a+b;
            }
        };

        Sumar sumaL = (a,b) -> a+b;
        sumaL.suma(2,3);
        Log.d("TAG1", sumaL.suma(2,3) + "");

        Sumar sumaLS = (a,b) -> Log.d("TAG1", a+b + "");
        sumaLS.suma(3,5);



        Sumar sumar1 = (a,b) -> Log.d("TAG1", (a*a + b*b) + "");
        sumar1.suma(1,2);
        sumar1 = (a,b) ->{
            a= a+b;
            a= a+b;
            return a;
        };
        Log.d("TAG1", sumar1.suma(1,2) + "");

        Sumar sumarNN = new Sumar() {
            @Override
            public int suma(int a, int b) {
                a = a * a;
                b = b * b;
                return a + b;
            }
        };

        probarPorDefecto();
        
    }

    public void metodoReferencia(){
        Generico generico = ()->"10".toString();
        generico.generico();
    }

    public void probarInterfazFuncional(){
        MiNombre nombre = () -> "Alberto";
        Log.d("TAG1", nombre.miNombre());
    }

    public void probarPorDefecto(){
       Log.d("TAG1", nombrePorDefecto("Alberto"));
       nombrePorDefecto("pepe");
    }

    @Override
    public void mostrarNombre(String nombre) {

    }

    private int sumar(int numero1, int numero2){
        return numero1 + numero2;
    }

    private List<String> ordenarLista(){
        List<String> lista = new ArrayList<>();
        lista.add("Maria");
        lista.add("Pablo");
        lista.add("Alberto");

        Collections.sort(lista, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        return lista;
    }

}
