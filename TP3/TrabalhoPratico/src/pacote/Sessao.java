package pacote;

public class Sessao {
	protected int numeroSala;
	protected Filme filme;
	protected String horario;
	protected Unidade unidade;
	protected boolean is3d;
	
	
	public int getNumeroSala() {
		return numeroSala;
	}
	public void setNumeroSala(int numeroSala) {
		this.numeroSala = numeroSala;
	}
	public Filme getFilme() {
		return filme;
	}
	public void setFilme(Filme filme) {
		this.filme = filme;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public Unidade getUnidade() {
		return unidade;
	}
	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}
	public boolean isIs3d() {
		return is3d;
	}
	public void setIs3d(boolean is3d) {
		this.is3d = is3d;
	}
	
	
}
