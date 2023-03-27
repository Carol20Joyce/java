package ExCliente;

import Ex01.ClasseCliente;
import Ex01.PessoaFisica;
import Ex01.PessoaJuridica;

public class TestaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int opcao, cpf, id;
		String nome, sexo, pagamento;
		float rg, cnpj;

		ClasseCliente c1 = new ClasseCliente("Joyce Caroline", 3, 12345667f, 001, 3);
		c1.visualizar();
		
		ClasseCliente c2 = new ClasseCliente("Lua Maria", 2, 12345467f, 002, 1);
		c2.visualizar();
		
		PessoaFisica pf1 = new PessoaFisica("Ana Beatriz", 2, 1234567f, 003, 2, 65974123);
		pf1.visualizar();
		
		PessoaFisica pf2 = new PessoaFisica("Jonathan", 1, 1234567f, 004, 4, 96385274);
		pf2.visualizar();
		
		PessoaJuridica pj1 = new PessoaJuridica("Mayara Santos", 4, 3698521f, 005, 2, 741852963);
		pj1.visualizar();
		
		PessoaJuridica pj2 = new PessoaJuridica("Ayra Mahalla", 5, 3698521f, 006, 4, 741852963);
		pj2.visualizar();
		
	}

}
