import java.util.List;

public class Linea {
    String nombre;
    List<Autobus> autobuses;
    Integer parada;

    public Linea() {
    }

    public Linea(String nombre, List<Autobus> autobuses, Integer parada) {
        this.nombre = nombre;
        this.autobuses = autobuses;
        this.parada = parada;
    }
}
}
