
package conversordetemperaturas;

public class ConversordeTemperaturas {


    public static void main(String[] args) {
ConversorTemperaturas obj1=new ConversorTemperaturas();

    try{
    
        System.out.println(obj1.centigradosAFharenheit(85));

    }catch(Exception e){
    System.out.println(e.getMessage());
}
    
    try{
        System.out.println(obj1.centigradosARemur(120));
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
    }
    
}
