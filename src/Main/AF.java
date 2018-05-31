
package Main;

import Aritmetica.Aritmetico;
import Conversion.Convertor;

public interface AF {
    
    Aritmetico getAritmetica(String type);
    Convertor getConvertor(String type);
    
}
