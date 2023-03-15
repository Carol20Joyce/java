package aula_1;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		float salariob, noturno, extras, desconto;
		String nome;
		
		System.out.println("Digite o salariob");
		salariob = leia.nextFloat();
		
		System.out.println("Digite o noturno");
		noturno = leia.nextFloat();
		
		System.out.println("Digite a extras");
		extras = leia.nextFloat();
		
		System.out.println("Digite a desconto");
		desconto = leia.nextFloat();
		
		System.out.println("Sálario Líquido: " + (salariob + noturno + (extras * 5) - desconto));

	}

}
