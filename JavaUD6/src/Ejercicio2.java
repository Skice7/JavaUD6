import javax.swing.JOptionPane;
/* 

@author Víctor Castillo

*/
public class Ejercicio2 {

	public static void main(String[] args) {
		ElegirNum();
	}

	public static void ElegirNum() {
		String texto = JOptionPane.showInputDialog("Introduce la cantidad de números");
		int CantidadNum = Integer.parseInt(texto);
		texto = JOptionPane.showInputDialog("Elige el numero mas pequeño");
		int num1 = Integer.parseInt(texto);
		texto = JOptionPane.showInputDialog("Elige el numero mas grande");
		int num2 = Integer.parseInt(texto);
		rellenarNum(CantidadNum, num1, num2);
	}

	public static void rellenarNum(int rango, int num1, int num2) {
		for (int i = 0; i < rango; i++) {
			System.out.println(generarNum(num1, num2));
		}
	}

	public static int generarNum(int num1, int num2) {
		return ((int) Math.floor(Math.random() * (num2 - num1) + num1));
	}

}
