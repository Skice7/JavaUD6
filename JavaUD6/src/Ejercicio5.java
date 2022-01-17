import javax.swing.JOptionPane;

/* 

@author V�ctor Castillo

*/
public class Ejercicio5 {
    public static void main(String[] args) {
    	
    	IntroducirNum();
        
    }
    
    public static void IntroducirNum() {
    	
    	
        int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
        String binario=decimalBinario(numero);
        System.out.println("El numero "+numero+ " en binario es "+binario);
    	
    }
   public static String decimalBinario (int numero){
        String binario="";
        String digito;
        for(int i=numero;i>0;i/=2){
            if(i%2==1){
                digito="1";
            }else{
                digito="0";
            }
            
            binario=digito+binario;
        }
        return binario;
    }
}