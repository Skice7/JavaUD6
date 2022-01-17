import javax.swing.JOptionPane;

/* 

@author Víctor Castillo

*/

public class Ejercicio7 {
    public static void main(String[] args) {
    	
    	convertirmoneda();
    }
  
    
    
    public static void convertirmoneda() {
         double cantidadEuros=Double.parseDouble(JOptionPane.showInputDialog("Escribe una cantidad en euros"));
         String tipomoneda=JOptionPane.showInputDialog("Escribe la moneda que quieres convertir(escribe la moneda) \n Opcion1: libras \n Opción2: dolares \n Opción3: yenes");
         double valor = 0;
 		 boolean correcto = true;
    
        
        switch (tipomoneda){
        case "libras":
        	valor=cantidadEuros*0.86;
            break;
        case "dolares":
        	valor=cantidadEuros*1.29;
            break;
        case "yenes":
        	valor=cantidadEuros*129.852;
            break;
        default:
            System.out.println("introduce la moneda correctamente");
            correcto=false;
        }
        
        if (correcto){
            System.out.println(cantidadEuros+ " euros convertido en " +tipomoneda+ " son " +valor);
        }
 
    }
}