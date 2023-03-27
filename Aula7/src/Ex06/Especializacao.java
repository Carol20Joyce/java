package Ex06;

public class Especializacao extends ClasseCurso{
	
	private String cursoes;

	public Especializacao(String nome, int area, int cpf, double duracao, int pagamento, String cursoes) {
		super(nome, area, cpf, duracao, pagamento);
		this.cursoes = cursoes;
	}

	public String getCursoes() {
		return cursoes;
	}

	public void setCursoes(String cursoes) {
		this.cursoes = cursoes;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Curso de Especialização: " + this.cursoes);
		
	}

}
