package grupo13.portal_estagios;

public class OfertaEstagio {
	public long idOferta;
	public String titulo;
	public String detalhes;
	public String tipoEstagio;
	public String estadoOferta;
	
	public Coordenador coordenador;
	public Empresa empresa;
	
	public OfertaEstagio(long idOferta, String titulo, String detalhes, String tipoEstagio, String estadoOferta,
			Coordenador coordenador, Empresa empresa) {
		super();
		this.idOferta = idOferta;
		this.titulo = titulo;
		this.detalhes = detalhes;
		this.tipoEstagio = tipoEstagio;
		this.estadoOferta = estadoOferta;
		this.coordenador = coordenador;
		this.empresa = empresa;
	}

	/**
	 * @return the idOferta
	 */
	public long getIdOferta() {
		return idOferta;
	}

	/**
	 * @param idOferta the idOferta to set
	 */
	public void setIdOferta(long idOferta) {
		this.idOferta = idOferta;
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

	/**
	 * @return the coordenador
	 */
	public Coordenador getCoordenador() {
		return coordenador;
	}

	/**
	 * @param coordenador the coordenador to set
	 */
	public void setCoordenador(Coordenador coordenador) {
		this.coordenador = coordenador;
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

	@Override
	public String toString() {
		return "OfertaEstagio [idOferta=" + idOferta + ", titulo=" + titulo + ", detalhes=" + detalhes
				+ ", tipoEstagio=" + tipoEstagio + ", estadoOferta=" + estadoOferta + ", coordenador=" + coordenador
				+ ", empresa=" + empresa + "]";
	}
	
	
	
	
	

}
