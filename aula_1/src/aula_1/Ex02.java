package aula_1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DecimalFormat df = new DecimalFormat("###,###,#0.00");
		
		Scanner leia = new Scanner(System.in);
		
		float nota1, nota2, nota3, nota4;
		String nome;
		
		System.out.println("Digite a nota1");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite a nota2");
		nota2 = leia.nextFloat();
		
		System.out.println("Digite a nota3");
		nota3 = leia.nextFloat();
		
		System.out.println("Digite a nota4");
		nota4 = leia.nextFloat();
		
		System.out.println("Nota média: " + df.format((nota1 + nota2 + nota3 + nota4)/4)); 
		
	
		
		

	}

}
