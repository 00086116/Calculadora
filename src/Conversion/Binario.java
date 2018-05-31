
package Conversion;

public class Binario implements Convertor {

    @Override
    public String Convertir(int a) {
        
        String binario = Integer.toBinaryString(a);
        
        return binario;
        
    }
    
}
