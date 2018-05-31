
package Aritmetica;

import Conversion.Convertor;
import Main.AF;

public class Factory implements AF {

    @Override
    public Aritmetico getAritmetica(String type) {
        switch(type){
            case "Suma":
                return new Suma();
            case "Resta":
                return new Resta();
            case "Multiplicacion": 
                return new Multiplicacion();
            case "Division":
                return new Division();
        }
        return null;
    }

    @Override
    public Convertor getConvertor(String type) {
        return null;
    }
    
}
