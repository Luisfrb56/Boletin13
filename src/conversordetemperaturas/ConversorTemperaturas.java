
package conversordetemperaturas;


public class ConversorTemperaturas {
    static final float constante=80;

public float centigradosAFharenheit(float centigrados) throws TemperaturaErradaExcepcion{  
    if(centigrados<=constante){
       
    throw new TemperaturaErradaExcepcion();
    } else {
return ((float) ((9/5)*(centigrados+32.4)));
}
}

public float centigradosARemur (float centigrados) throws TemperaturaErradaExcepcion{
    if(centigrados<=constante){
        throw new TemperaturaErradaExcepcion();
    }else{
        return ((float) ((4.0/5.0)*centigrados));
    }
}
}
