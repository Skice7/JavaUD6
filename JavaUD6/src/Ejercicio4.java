import javax.swing.JOptionPane;
/* 

@author Víctor Castillo

*/
public class Ejercicio4 {

	public static void main(String[] args) {

		introducirfactorial();
		
		}
	
	
	public static void introducirfactorial(){
	
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
		System.out.println("El factorial de " + numero + " es " + factorial(numero));
	
	}

	public static int factorial(int numero) {
		int resultado = numero;
		
		for (int i = (numero-1); i > 0; i--) {
			
			resultado = resultado * i;
		}
		return resultado;
	}

}
