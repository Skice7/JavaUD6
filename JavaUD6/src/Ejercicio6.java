import javax.swing.JOptionPane;

/* 

@author V�ctor Castillo

*/
public class Ejercicio6 {
    public static void main(String[] args) {
  
    	numCifrasPositivo();
    }
    
    public static void numCifrasPositivo() {
		String num = JOptionPane.showInputDialog("Introduce el n�mero");
        int numero = Integer.parseInt(num);
        if (numero > 0) {
            JOptionPane.showMessageDialog(null, num.length());
        }
         else if(numero == 0) {
        	 JOptionPane.showMessageDialog(null, "El 0 es un n�mero neutro, introduce un n�mero positivo");
         
        } else {
            JOptionPane.showMessageDialog(null, "Introduce un n�mero positvo");
        }
	}
}