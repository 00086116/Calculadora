
package Conversion;

import Aritmetica.Aritmetico;
import Main.AF;

public class FabricaDeConversion implements AF{

    @Override
    public Aritmetico getAritmetica(String type) {
        return null;
    }

    @Override
    public Convertor getConvertor(String type) {
        switch(type){
            case "Binario":
                return new Binario();
            default:
                break;
        }
        return null;
    }

}
