package aula_1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Aula01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		
		Scanner leia = new Scanner(System.in);
		
		double numero1, numero2;
		String nome;
		
		System.out.println("Digite o seu nome");
		nome = leia.nextLine();
		
		System.out.println("Digite o primeiro número");
		numero1 = leia.nextDouble();
		
		System.out.println("Digite o segundo número");
		numero2 = leia.nextDouble();
		
		System.out.println("\nSoma: " + df.format((numero1 + numero2)));
		System.out.println("\nSubtração: " + df.format((numero1 - numero2)));
		System.out.println("\nMultiplicação: " + df.format((numero1 * numero2)));
		System.out.println("\nDivisão: " + df.format((numero1 / numero2)));
		System.out.println("\nPotência: " + df.format(Math.pow(numero1, numero2)));
		System.out.println("\nRaíz Quadrada: " + df.format(Math.sqrt(numero1)));
		System.out.println("\nNome: " + nome);
		
		leia.close();

	}

}
