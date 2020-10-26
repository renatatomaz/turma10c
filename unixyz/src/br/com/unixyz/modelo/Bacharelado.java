package br.com.unixyz.modelo;

public class Bacharelado extends Formacao {

	private int cargaHorariaEstagio;
	private String tabalhoConclusao;
	
	public void calcMensalidade (double fator) {
		super.setMensalidade((super.getMensalidade() *600 * (float) fator) + (cargaHorariaEstagio * 40));	
	}
	
	public String getAll () {
		return
				super.getAll() + "\n" +
				"Carga Horária Estagio: " + cargaHorariaEstagio + "\n" +
				"Trabalho de Conclusão: " + tabalhoConclusao;
	}
	
	public void setAll (String descricao, int duracao, float mensalidade, int cargaHorariaEstagio,
			String tabalhoConclusao) {
		super.setAll(descricao, duracao, mensalidade);
		this.cargaHorariaEstagio = cargaHorariaEstagio;
		this.tabalhoConclusao = tabalhoConclusao;
	}

	public Bacharelado() {
		super();
	}

	public Bacharelado(String descricao, int duracao, float mensalidade, int cargaHorariaEstagio,
			String tabalhoConclusao) {
		super(descricao, duracao, mensalidade);
		this.cargaHorariaEstagio = cargaHorariaEstagio;
		this.tabalhoConclusao = tabalhoConclusao;
	}
	
	public int getCargaHorariaEstagio() {
		return cargaHorariaEstagio;
	}
	public void setCargaHorariaEstagio(int cargaHorariaEstagio) {
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}
	public String getTabalhoConclusao() {
		return tabalhoConclusao;
	}
	public void setTabalhoConclusao(String tabalhoConclusao) {
		this.tabalhoConclusao = tabalhoConclusao;
	}
	
	
	
}
