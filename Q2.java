package PooEstruturasrepeticao;
import java.util.Scanner;

public class Q2 {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        
        int somaDosDigitos = calcularSomaDosDigitos(numero);

       
        System.out.println("A soma dos dígitos do número " + numero + " é: " + somaDosDigitos);

       
        scanner.close();
    }

    
    public static int calcularSomaDosDigitos(int numero) {
        int soma = 0;

       
        while (numero != 0) {
           
            int digito = numero % 10;

           
            soma += digito;

            
            numero /= 10;
        }

        return soma;
    }

}
