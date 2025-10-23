package grupo13.portal_estagios;

public class Coordenador extends Utilizador{
	public long idCoordenador;
	public String nome;
	public Curso curso;
	
	
	
	public Coordenador(long idUtilizador, String nomeUtilizador, String password, String tipoUtilizador,
			long idCoordenador, long idUtilizador2, String nome, Curso curso) {
		super(idUtilizador, nomeUtilizador, password, tipoUtilizador);
		this.idCoordenador = idCoordenador;
		idUtilizador = idUtilizador2;
		this.nome = nome;
		this.curso = curso;
	}



	public Coordenador(long idUtilizador, String nomeUtilizador, String password) {
		super(idUtilizador, nomeUtilizador, password, "Coordenador");
		// TODO Auto-generated constructor stub
	}



	/**
	 * @return the idCoordenador
	 */
	public long getIdCoordenador() {
		return idCoordenador;
	}



	/**
	 * @param idCoordenador the idCoordenador to set
	 */
	public void setIdCoordenador(long idCoordenador) {
		this.idCoordenador = idCoordenador;
	}



	/**
	 * @return the idUtilizador
	 */
	public long getIdUtilizador() {
		return idUtilizador;
	}



	/**
	 * @param idUtilizador the idUtilizador to set
	 */
	public void setIdUtilizador(long idUtilizador) {
		this.idUtilizador = idUtilizador;
	}



	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}



	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}


	


	/**
	 * @return the curso
	 */
	public Curso getCurso() {
		return curso;
	}



	/**
	 * @param curso the curso to set
	 */
	public void setCurso(Curso curso) {
		this.curso = curso;
	}



	@Override
	public String toString() {
		return "Coordenador [idCoordenador=" + idCoordenador + ", idUtilizador=" + idUtilizador + ", nome=" + nome
				+ ", curso=" + curso + ", nomeUtilizador=" + nomeUtilizador + ", password=" + password
				+ ", tipoUtilizador=" + tipoUtilizador + "]";
	}




	
	
	
	
	
}
