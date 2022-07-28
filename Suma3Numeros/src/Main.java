import java.util.ArrayList; // import the ArrayList class
import Coche.Coche; // Importamos la clase Coche del paquete Coche

public class Main {
    public static void main(String[] args) {
        int resultado = 0;
        resultado = suma3num(1, 2, 3);
        System.out.println(resultado);
        Coche micoche = new Coche();
        int NumPuertas = micoche.SumarPuerta(2);
        System.out.println(NumPuertas);
    }
    public static int suma3num(int a, int b, int c){
        return (a+b+c);
        }

}