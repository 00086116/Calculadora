
package Main;

import GUI.Ventana;
import Aritmetica.Aritmetico;
import Conversion.Convertor;
import javax.swing.JFrame;

public class Calculadora_ {

    public static void main(String[] args) {

        JFrame ventana = new JFrame("Calculadora Basica");
        ventana.setContentPane(new Ventana());
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        ventana.pack();
        ventana.setVisible(true);
    }
    
}
