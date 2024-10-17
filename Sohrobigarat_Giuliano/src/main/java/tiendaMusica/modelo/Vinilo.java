
package tiendaMusica.modelo;

import tiendaMusica.Servicio.Disco;

public class Vinilo extends Disco {
    private Velocidad velocidad;

     public Vinilo(String titulo, float precio, String nombre, String generoMusical, Velocidad velocidad) {
        super(titulo, precio, nombre, generoMusical);
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return super.toString() + " - Velocidad: " + velocidad;
    }

    @Override
    public boolean equals(Object vinilo2) {
        if (vinilo2 instanceof Vinilo) {
            Vinilo vinilo2Casteado = (Vinilo) vinilo2;
            return super.equals(vinilo2Casteado) && this.velocidad == vinilo2Casteado.velocidad;
        }
        return false;
    }
}
