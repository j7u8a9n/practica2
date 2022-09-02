import java.util.List;

public class Autobus {
    Modelo modelo;
    String placa;
    Integer numero;
    List<Linea> lineas;
    public Autobus{
    }

    public Autobus(Modelo modelo, String placa, Integer numero, List<Linea> lineas) {
        this.modelo = modelo;
        this.placa = placa;
        this.numero = numero;
        this.lineas = lineas;
    }
}
