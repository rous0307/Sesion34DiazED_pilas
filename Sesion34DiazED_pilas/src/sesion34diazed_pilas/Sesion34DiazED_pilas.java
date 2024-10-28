
package sesion34diazed_pilas;

import java.util.Stack;
import javax.swing.JOptionPane;

public class Sesion34DiazED_pilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //declaracion de pila
        Stack<Integer> pilaDiaz = new Stack<>();
        
        pilaDiaz.push(100);
        pilaDiaz.push(150);
        pilaDiaz.push(230);
        pilaDiaz.push(10);
        pilaDiaz.push(160);
        
        JOptionPane.showMessageDialog(null, "Datos de pila ordenada es :\n"+pilaDiaz);//mando a llamar a mi pila
        
        JOptionPane.showMessageDialog(null, "Autor: Rosa Isela Diaz");
    }
    
}
