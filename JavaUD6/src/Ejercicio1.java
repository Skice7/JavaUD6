import javax.swing.JOptionPane;

/* 

@author Víctor Castillo

*/
public class Ejercicio1 {


    


    public static void main(String[] args) {
        

        SeleccionCalculo();

    }

    public static void SeleccionCalculo() {
    	double resultado = 0;
    	
        String seleccionar = JOptionPane.showInputDialog("Selecciona (circulo / triangulo / cuadrado)");

        switch (seleccionar) {
            case "circulo":
                resultado = AreaCirculo();
                System.out.println(resultado);

            break;

            case "triangulo":
                resultado = AreaTriangulo();
                System.out.println(resultado);

            break;

            case "cuadrado":
                resultado = AreaCuadrado();
                System.out.println(resultado);

            break;

            default:
                System.out.println("el calculo introducido no existe");
                break;
        }

    }


    public static double AreaCirculo() {
        double radio, resultado;
        radio= Double.parseDouble(JOptionPane.showInputDialog("introduce el radio"));


        resultado = Math.PI*Math.pow(radio, 2);

        return resultado;
    }

    public static double AreaTriangulo() {
        double base, altura, resultado;
        base= Double.parseDouble(JOptionPane.showInputDialog("introduce la base"));
        altura= Double.parseDouble(JOptionPane.showInputDialog("introduce la altura"));

        resultado = (base * altura) / 2;

        return resultado;
    }

    public static double AreaCuadrado() {
        double lado, resultado;
        lado= Double.parseDouble(JOptionPane.showInputDialog("introduce el lado"));

        resultado = lado * lado;

        return resultado;
    }


}