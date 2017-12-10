
package conversordetemperaturas;


public class TemperaturaErradaExcepcion extends Exception{

    public TemperaturaErradaExcepcion() {
        super("Temperatura tiene que ser mayor de 80ºC");
    }
    public TemperaturaErradaExcepcion(String message){
        super(message);
    }
}