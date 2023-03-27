package Ex06;

public class CursoLivre extends ClasseCurso{
	
	private String cursol;

	public CursoLivre(String nome, int area, int cpf, double duracao, int pagamento, String cursol) {
		super(nome, area, cpf, duracao, pagamento);
		this.cursol = cursol;
	}

	public String getCursol() {
		return cursol;
	}

	public void setCursol(String cursol) {
		this.cursol = cursol;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Curso de Graduação: " + this.cursol);
	}
		
}
