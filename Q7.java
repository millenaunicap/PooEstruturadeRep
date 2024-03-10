package PooEstruturasrepeticao;
import java.util.Scanner;

public class Q7 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        
        int numeroInvertido = inverterNumero(numero);

        
        System.out.println("O número invertido de " + numero + " é: " + numeroInvertido);

       
        scanner.close();
    }

    
    public static int inverterNumero(int numero) {
        int numeroInvertido = 0;

        while (numero != 0) {
            
            int digito = numero % 10;

            
            numeroInvertido = numeroInvertido * 10 + digito;

           
            numero /= 10;
        }

        return numeroInvertido;
    }

}
