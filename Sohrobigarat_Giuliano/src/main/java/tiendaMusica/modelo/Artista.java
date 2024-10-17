package tiendaMusica.modelo;

public class Artista {
    private String nombre;
    private String generoMusical;

    public Artista(String nombre, String generoMusical) {
        this.nombre = nombre;
        this.generoMusical = generoMusical;
    }
    public static Boolean sonIguales(Artista artista1, Artista artista2){
        return artista1.nombre == artista2.nombre & artista1.generoMusical == artista2.generoMusical;
    }
    public String getNombreGenero(){
        return(this.nombre + ":" + this.generoMusical);
    }
}
