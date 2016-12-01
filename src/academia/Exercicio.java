package academia;

public class Exercicio {
	private static final double MINUTOS_EM_1_HORA = 60;
	private String nome;
	private double cph; // calorias gastas por hora

	public Exercicio(String nome, double cph) throws Exception {
		if(nome == null || nome.trim().equals(" "))
			throw new Exception("Nome nao pode ser null ou vazio.");
		if(cph < 0)
			throw new Exception("Calorias gastas por hora deve ser maior que zero.");
		this.nome = nome;
		this.cph = cph;
	}

	@Override
	public String toString() {
		return "Exercicio [nome=" + nome + ", cph=" + cph + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getCph() {
		return cph;
	}

	public void setCph(double cph) throws Exception {
		if (cph <= 0)
			throw new Exception(
					"Quantidade de calorias gastas em 1 hora de exercicio deve ser positiva.");
		this.cph = cph;
	}

	public double calPerMinutes(double minutes) {
		return (getCph() * minutes) / MINUTOS_EM_1_HORA;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Exercicio))
			return false;
		Exercicio exc = (Exercicio) obj;
		return exc.getNome().equals(getNome()) && exc.getCph() == getCph();
	}
}
