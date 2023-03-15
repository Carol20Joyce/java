package aula_1;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		float n1, n2, n3, n4;
		
		System.out.println("Digite a n1");
		n1 = leia.nextFloat();
		
		System.out.println("Digite a n2");
		n2 = leia.nextFloat();
		
		System.out.println("Digite a n3");
		n3 = leia.nextFloat();
		
		System.out.println("Digite a n4");
		n4 = leia.nextFloat();
		
		System.out.println("Cálculo: " + ((n1 * n2) - (n3 * n4)));

	}

}
