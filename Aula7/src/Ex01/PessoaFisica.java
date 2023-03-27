package Ex01;

public class PessoaFisica extends ClasseCliente{
	
	private int cpf;

	public PessoaFisica(String nome, int genero, float rg, int id, int pagamento, int cpf) {
		super(nome, genero, rg, id, pagamento);
		this.cpf = cpf;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("CPF: " + this.cpf);
	}

}
