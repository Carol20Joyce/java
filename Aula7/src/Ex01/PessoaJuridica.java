package Ex01;

public class PessoaJuridica extends ClasseCliente{
	
	private float cnpj;

	public PessoaJuridica(String nome, int genero, float rg, int id, int pagamento, float cnpj) {
		super(nome, genero, rg, id, pagamento);
		this.cnpj = cnpj;
	}

	public float getCnpj() {
		return cnpj;
	}

	public void setCnpj(float cnpj) {
		this.cnpj = cnpj;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("CNPJ: " + this.cnpj);
	}

}
