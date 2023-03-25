package TestaCurso;

import Ex06.ClasseCurso;

public class TestaCurso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int area, duracao, pagamento;
		String nome, curso;
		
		ClasseCurso c1 = new ClasseCurso("Andreia Cristina", 4, "Analise e Desenvolvimentode Sistemas", 2.6, 2);
		c1.visualizar();
		
		ClasseCurso c2 = new ClasseCurso("Odair Rodrigues", 5, "Agronomia", 5.0, 1);
		c1.visualizar();

	}

}
