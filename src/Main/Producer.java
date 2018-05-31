
package Main;

import Aritmetica.Factory;
import Conversion.FabricaDeConversion;

public class Producer {
    public static AF getFactory(String type){
        switch(type){
            case "Aritmetica":
                return new Factory();
            case "Conversion":
                return new FabricaDeConversion();
        }
        return null;
    }
}
