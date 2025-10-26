package pt.upt.equipa13.portalestagios.model;
import grupo13.portal_estagios.Curso;
import grupo13.portal_estagios.Utilizador;
import jakarta.persistence.*;

@Entity
@Table(name="aluno")
public class Aluno extends Utilizador{
	public long nAluno;
	public String nome;
	public String dataNascimento;
	
	public Curso curso;
	
	public Aluno(long idUtilizador, String nomeUtilizador, String password, String tipoUtilizador, long nAluno,
			String nome, String dataNascimento, Curso curso) {
		super(idUtilizador, nomeUtilizador, password, tipoUtilizador);
		this.nAluno = nAluno;
		this.tipoUtilizador = "Estudante";
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.curso = curso;
	}
	/**
	 * @return the nAluno
	 */
	public long getnAluno() {
		return nAluno;
	}

	/**
	 * @param nAluno the nAluno to set
	 */
	public void setnAluno(long nAluno) {
		this.nAluno = nAluno;
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
	 * @return the dataNascimento
	 */
	public String getDataNascimento() {
		return dataNascimento;
	}

	/**
	 * @param dataNascimento the dataNascimento to set
	 */
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
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
		return "Aluno [nAluno=" + nAluno + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", curso=" + curso
				+ ", idUtilizador=" + idUtilizador + ", nomeUtilizador=" + nomeUtilizador + ", password=" + password
				+ ", tipoUtilizador=" + tipoUtilizador + "]";
	}
	
}
