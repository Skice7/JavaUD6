import javax.swing.JOptionPane;
/* 

@author Víctor Castillo

*/
public class Ejercicio3 {

	public static void main(String[] args) {

		introducirprimo();
	}
		
	
	public static void introducirprimo() {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
		if (Primo(num1)) {
			System.out.println("El numero " + num1 + " es primo");
		} else {
			System.out.println("El numero " + num1 + " no es primo");
		}
	}

	public static boolean Primo(int numero) {

		 int contador = 2;
         boolean esPrimo = true;
         while ((esPrimo) && (contador != numero)) {
             if (numero%contador == 0)
                 esPrimo = false;
             contador++;
         }
         return esPrimo;
    }
}

