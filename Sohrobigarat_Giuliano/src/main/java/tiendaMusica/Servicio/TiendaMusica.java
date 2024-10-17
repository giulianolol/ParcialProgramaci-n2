package tiendaMusica.Servicio;

import java.util.ArrayList;
import java.util.List;
import tiendaMusica.modelo.CD;
import tiendaMusica.modelo.TipoDisco;
import tiendaMusica.modelo.Vinilo;

public class TiendaMusica {
    
    private int capacidad;
    private  List<Disco> discos;

    public TiendaMusica() {
        this.capacidad = 5;
        this.discos = new ArrayList<>();
    }
    
    public TiendaMusica(int capacidad) {
        this.capacidad = capacidad;
        this.discos = new ArrayList<>();
    }

    public boolean sonIguales(Disco disco) {
        for (Disco discoaux : discos) {
            if (Disco.sonIguales(discoaux, disco)) {
                return true;
            }
        }
        return false;
    }
    
    public void agregar(Disco disco) throws Exception {
        if (discos.size() >= capacidad) {
            throw new Exception("Capacidad máxima alcanzada");
        }
        if (sonIguales(disco)) {
            throw new Exception("El disco ya existe en la tienda");
        }
        discos.add(disco);
    }
    
 private double getPrecio(TipoDisco tipo) {
        double total = 0;
        for (Disco discoAux : discos) {
            if ((tipo == TipoDisco.VINILOS && discoAux instanceof Vinilo) ||
                (tipo == TipoDisco.CDS && discoAux instanceof CD) ||
                tipo == TipoDisco.TODOS) {
                total += discoAux.getPrecio();
            }
        }
        return total;
    }
    
        public double getPrecioDeVinilos() {
        return getPrecio(TipoDisco.VINILOS);
    }

    public double getPrecioDeCDs() {
        return getPrecio(TipoDisco.CDS);
    }

    public double getPrecioTotal() {
        return getPrecio(TipoDisco.TODOS);
    }

    public static String mostrar(TiendaMusica tienda) {
        StringBuilder cadena = new StringBuilder("Tienda de Música:\n");
        for (Disco discoAux : tienda.discos) {
            cadena.append(discoAux.toString()).append("\n");
        }
        return cadena.toString();
    }
}
