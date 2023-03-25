package ExCliente;

import Ex01.ClasseCliente;

public class TestaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int opcao;
		String nome, sexo, pagamento;
		float rg, cpf;

		ClasseCliente c1 = new ClasseCliente("Joyce Caroline", 3, 12345667f, 169852340, 3);
		c1.visualizar();
		
		ClasseCliente c2 = new ClasseCliente("Lua Maria", 2, 12345467f, 169869540, 1);
		c2.visualizar();
		
	}

}
