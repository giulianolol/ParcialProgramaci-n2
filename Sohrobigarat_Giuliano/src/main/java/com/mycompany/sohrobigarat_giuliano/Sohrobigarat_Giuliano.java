package com.mycompany.sohrobigarat_giuliano;

import tiendaMusica.Servicio.TiendaMusica;
import tiendaMusica.modelo.Artista;
import tiendaMusica.modelo.CD;
import tiendaMusica.modelo.Formato;
import tiendaMusica.modelo.Velocidad;
import tiendaMusica.modelo.Vinilo;

public class Sohrobigarat_Giuliano {

    public static void main(String[] args) throws Exception {
        try {
        TiendaMusica miTienda = new TiendaMusica(7);
        Artista a = new Artista("The Beatles", "Rock");
        Artista b = new Artista("Michael Jackson", "Pop");
        Vinilo v1 = new Vinilo("Abbey Road", 50f, "The Beatles", "Rock", Velocidad.RPM_33);
        CD c1 = new CD("Thriller", 30f, b, "Pop", Formato.ESTANDAR);
        Vinilo v2 = new Vinilo("Let It Be", 45f, "The Beatles", "Rock", Velocidad.RPM_45);
        CD c2 = new CD("Bad", 28f, b, "Pop", Formato.REMASTERIZADO);
        CD c3 = new CD("Dangerous", 32f, b, "Pop", Formato.DOBLE);


        CD c4 = new CD("Off The Wall", 25f, b, "Michael Jackson", Formato.ESTANDAR);
        miTienda.agregar(v1);
//YA INGRESADO
        miTienda.agregar(v1);
        miTienda.agregar(c1);
        miTienda.agregar(v2);
        miTienda.agregar(c2);
        miTienda.agregar(c3);
//SIN LUGAR
        miTienda.agregar(c4);
        System.out.println("");
//TRUE
        System.out.println(v1.equals(v1));
//FALSE
        System.out.println(v1.equals("The Beatles"));
//FALSE
        System.out.println(v1.equals(v2));
//TRUE
        System.out.println(c1.equals(c1));
//FALSE
        System.out.println(c1.equals(c2));
//FALSE
        System.out.println(c1.equals(c4));
        System.out.println("");
        System.out.println(TiendaMusica.mostrar(miTienda));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
       
    }
}
