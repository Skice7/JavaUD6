import javax.swing.JOptionPane;
/* 

@author Víctor Castillo

*/
public class Ejercicio8 {
 
    public static void main(String[] args) {
 
     int numero[]=new int[10];
 
        rellenarArray(numero);
        mostrarArray(numero);
    }
 
    public static void rellenarArray(int numero[]){
        for(int i=0;i<numero.length;i++){
            numero[i]=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        }
    }
 
    public static void mostrarArray(int numero[]){
        for(int i=0;i<numero.length;i++){
            System.out.println("En el indice "+i+" con valor: "+numero[i]);
        }
    }
}