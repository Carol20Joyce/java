package TestaCurso;

import Ex06.ClasseCurso;
import Ex06.CursoLivre;
import Ex06.Especializacao;

public class TestaCurso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int area, duracao, pagamento, cpf;
		String nome, cursol, cursoes ;
		
		ClasseCurso cc1 = new ClasseCurso("Andreia Cristina", 4, 147852369, 2.6, 2);
		cc1.visualizar();
		
		ClasseCurso cc2 = new ClasseCurso("Odair Rodrigues", 5, 963852741, 5.0, 1);
		cc2.visualizar();
		
		CursoLivre cl1 = new CursoLivre("Mariana Pacheco", 8, 1597534628, 4.0, 2, "Historia");
		cl1.visualizar();
		
		CursoLivre cl2 = new CursoLivre("Henrique Sabino", 7, 1597534628, 6.5, 1, "Medicina");
		cl2.visualizar();
		
		Especializacao ce1 = new Especializacao("Leticia Linhares", 1, 147852369, 3.7, 2, "Física");
		ce1.visualizar();
		
		Especializacao ce2 = new Especializacao("Cleonice Silva", 6, 147852369, 4.2, 1, "Artes Cenicas");
		ce2.visualizar();

	}

}
