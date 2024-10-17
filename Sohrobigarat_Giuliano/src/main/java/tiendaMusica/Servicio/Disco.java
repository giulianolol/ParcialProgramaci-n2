package tiendaMusica.Servicio;

import java.util.Random;
import tiendaMusica.modelo.Artista;

public class Disco {
    protected Artista artista;
    protected int anioLanzamiento;
    protected String titulo;
    protected float precio;
    protected  static Random generadorDeAnio;
    
    static{
        generadorDeAnio = new Random();
    }
    
     public Disco(String titulo, float precio, Artista artista) {
        this.titulo = titulo;
        this.precio = precio;
        this.artista = artista;
        this.anioLanzamiento = 0;
    }

     public Disco(String titulo, float precio, String nombre, String generoMusical) {
        this(titulo, precio, new Artista(nombre, generoMusical));
     }
     
     public int getAnioLanzamiento() {
        if (anioLanzamiento == 0) {
            anioLanzamiento = generadorDeAnio.nextInt(2024 - 1950 + 1) + 1950;
        }
        return anioLanzamiento;
    }
     
     public float getPrecio(){
         return precio;
     }
     
     private  String mostrar(Disco disco) {
        return disco.titulo + " (" + disco.getAnioLanzamiento() + ") - " + disco.artista.getNombreGenero() + ": $" + disco.getPrecio();
    }
     
     public static boolean sonIguales(Disco disco1, Disco disco2) {
        return disco1.titulo == disco2.titulo & disco1.artista == disco2.artista;
    }
     
     
    @Override
    public boolean equals(Object disco2) {
        if (disco2 instanceof Disco) {
            Disco disco2Casteado = (Disco) disco2;
            return sonIguales(this, disco2Casteado);
        }
        return false;
    }
    
    @Override
    public String toString() {
        return mostrar(this);
    }
     
}
