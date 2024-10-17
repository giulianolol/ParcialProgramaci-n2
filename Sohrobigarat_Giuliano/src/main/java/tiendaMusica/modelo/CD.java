package tiendaMusica.modelo;

import tiendaMusica.Servicio.Disco;

public class CD extends Disco{
    private Formato formato;
    public CD(String titulo, float precio, Artista artista, String pop, Formato formato) {
        super(titulo, precio, artista);
        if (formato == null) {
            throw new IllegalArgumentException("El formato no puede ser nulo.");
        }
        this.formato = formato;
    }

    // Constructor adicional para permitir la creación de un CD sin un objeto Artista
    public CD(String titulo, float precio, String nombre, String generoMusical, Formato formato) {
        this(titulo, precio, new Artista(nombre, generoMusical), "Pop", formato);
    }

    @Override
    public String toString() {
        return super.toString() + " - Formato: " + formato;
    }

    @Override
    public boolean equals(Object CD2) {
        if (CD2 instanceof CD) {
            CD CD2Casteado = (CD) CD2;
            return super.equals(CD2Casteado) && this.formato == CD2Casteado.formato;
        }
        return false;
    }
}
