package PooEstruturasrepeticao;

import java.util.Scanner;

public class Q1 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        double[] notas = new double[5];

        
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        int aprovados = 0;

        
        for (int i = 0; i < 5; i++) {
            if (notas[i] >= 7) {
                aprovados++;
            }
        }

        
        System.out.println("Quantidade de alunos aprovados: " + aprovados);

       
        scanner.close();
    }

}
