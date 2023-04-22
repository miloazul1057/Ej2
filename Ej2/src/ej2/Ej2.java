package ej2;
import java.util.Scanner;

public class Ej2 {

    public static void main(String[] args) {
        
        /*Determinar el Perímetro de una circunferencia 
        y el área de un círculo.*/
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el radio de la circunferencia: ");
        float radio = teclado.nextFloat();
        double perimetro = 2 * Math.PI * radio;
        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("El perimetro de la circunferencia es: " + perimetro);
        System.out.println("El area del circulo es: " + area);
        
    }
    
}
