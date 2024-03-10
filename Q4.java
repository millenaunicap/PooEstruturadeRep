package PooEstruturasrepeticao;
import java.util.Scanner;

public class Q4 {
	
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        double[] alturas = new double[5];

	       
	        for (int i = 0; i < 5; i++) {
	            System.out.print("Digite a altura da pessoa " + (i + 1) + " (em metros): ");
	            alturas[i] = scanner.nextDouble();
	        }

	       
	        double mediaAltura = calcularMediaAltura(alturas);

	        
	        System.out.println("A média de altura das 5 pessoas é: " + mediaAltura + " metros");

	        
	        scanner.close();
	    }

	   
	    public static double calcularMediaAltura(double[] alturas) {
	        double somaAlturas = 0;

	       
	        for (double altura : alturas) {
	            somaAlturas += altura;
	        }

	        
	        return somaAlturas / alturas.length;
	    }

}
