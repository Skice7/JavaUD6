import javax.swing.JOptionPane;
import java.util.Random;
/* 

@author V�ctor Castillo

*/
public class Ejercicio10 {

	public static void main(String[] args) {
		
		tamanioarray();
    }
	
	public static void tamanioarray() {
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un tama�o"));
        int array[] = new int[num1];
        RellenarArray(array);
        MostrarArray(array);
        System.out.println("El n�mero m�s grande es: " + MayorArray(array));
	}

    public static void RellenarArray(int array[]) {
        int max = Integer.parseInt(JOptionPane.showInputDialog("rango maximo"));
        Random claseRandom = new Random();
        for (int i = 0; i < array.length; i++) {
            int num1 = claseRandom.nextInt(max);
            if(Primo(num1)==true) {
                array[i] = num1;
            } else {
                i--;
            }
        }
    }

    public static boolean Primo(int numero) {

            int contador = 2;
            boolean resultado = true;
            while ((resultado) && (contador != numero)) {
                if (numero % contador == 0)
                    resultado = false;
                contador++;
            }
            return resultado;

    }

    public static void MostrarArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int MayorArray(int array[]) {
    	int mayor = 0;
        for(int i = 0; i < array.length;i++){
            if(array[i] > mayor) {
                mayor = array[i];
            }
        }
        return mayor;
    }
}