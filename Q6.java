package PooEstruturasrepeticao;
import java.util.Scanner;

public class Q6 {
	
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Digite um número inteiro: ");
	        int numero = scanner.nextInt();

	        
	        int somaDigitosPares = calcularSomaDigitosPares(numero);

	       
	        System.out.println("A soma dos dígitos pares do número " + numero + " é: " + somaDigitosPares);

	       
	        scanner.close();
	    }

	   
	    public static int calcularSomaDigitosPares(int numero) {
	        int soma = 0;

	       
	        numero = Math.abs(numero);

	        
	        while (numero != 0) {
	            
	            int digito = numero % 10;

	            
	            if (digito % 2 == 0) {
	                
	                soma += digito;
	            }

	            
	            numero /= 10;
	        }

	        return soma;
	    }

}
