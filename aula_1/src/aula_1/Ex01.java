package aula_1;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		float salario, abono;
		String nome;
		
		System.out.println("Digite o sálario");
		salario = leia.nextFloat();
		
		System.out.println("Digite o abono");
		abono = leia.nextFloat();
		
		System.out.println("Soma: " + (salario + abono));
		
		leia.close();

	}

}
