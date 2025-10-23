package grupo13.portal_estagios;

public class Candidatura extends OfertaEstagio{
	public long idCandidatura;
	public Aluno aluno;
	public Empresa empresa;
	public String titulo;
	public String detalhes;
	public String tipoEstagio;
	public String estadoOferta;
	
	
	public Candidatura(long idOferta, String titulo, String detalhes, String tipoEstagio, String estadoOferta,
			Coordenador coordenador, Empresa empresa, long idCandidatura, Aluno aluno, Empresa empresa2, String titulo2,
			String detalhes2, String tipoEstagio2, String estadoOferta2) {
		super(idOferta, titulo, detalhes, tipoEstagio, estadoOferta, coordenador, empresa);
		this.idCandidatura = idCandidatura;
		this.aluno = aluno;
		empresa = empresa2;
		titulo = titulo2;
		detalhes = detalhes2;
		tipoEstagio = tipoEstagio2;
		estadoOferta = estadoOferta2;
	}


	/**
	 * @return the idCandidatura
	 */
	public long getIdCandidatura() {
		return idCandidatura;
	}


	/**
	 * @param idCandidatura the idCandidatura to set
	 */
	public void setIdCandidatura(long idCandidatura) {
		this.idCandidatura = idCandidatura;
	}


	/**
	 * @return the aluno
	 */
	public Aluno getAluno() {
		return aluno;
	}


	/**
	 * @param aluno the aluno to set
	 */
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}


	/**
	 * @return the empresa
	 */
	public Empresa getEmpresa() {
		return empresa;
	}


	/**
	 * @param empresa the empresa to set
	 */
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}


	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}


	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	/**
	 * @return the detalhes
	 */
	public String getDetalhes() {
		return detalhes;
	}


	/**
	 * @param detalhes the detalhes to set
	 */
	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}


	/**
	 * @return the tipoEstagio
	 */
	public String getTipoEstagio() {
		return tipoEstagio;
	}


	/**
	 * @param tipoEstagio the tipoEstagio to set
	 */
	public void setTipoEstagio(String tipoEstagio) {
		this.tipoEstagio = tipoEstagio;
	}


	/**
	 * @return the estadoOferta
	 */
	public String getEstadoOferta() {
		return estadoOferta;
	}


	/**
	 * @param estadoOferta the estadoOferta to set
	 */
	public void setEstadoOferta(String estadoOferta) {
		this.estadoOferta = estadoOferta;
	}


	@Override
	public String toString() {
		return "Candidatura [idCandidatura=" + idCandidatura + ", aluno=" + aluno + ", empresa=" + empresa + ", titulo="
				+ titulo + ", detalhes=" + detalhes + ", tipoEstagio=" + tipoEstagio + ", estadoOferta=" + estadoOferta
				+ ", idOferta=" + idOferta + ", coordenador=" + coordenador + "]";
	}
	
	
	
	

}
