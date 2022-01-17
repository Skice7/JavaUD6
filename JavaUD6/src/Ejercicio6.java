import javax.swing.JOptionPane;

/* 

@author Víctor Castillo

*/
public class Ejercicio6 {
    public static void main(String[] args) {
  
    	numCifrasPositivo();
    }
    
    public static void numCifrasPositivo() {
		String num = JOptionPane.showInputDialog("Introduce el número");
        int numero = Integer.parseInt(num);
        if (numero > 0) {
            JOptionPane.showMessageDialog(null, num.length());
        }
         else if(numero == 0) {
        	 JOptionPane.showMessageDialog(null, "El 0 es un número neutro, introduce un número positivo");
         
        } else {
            JOptionPane.showMessageDialog(null, "Introduce un número positvo");
        }
	}
}