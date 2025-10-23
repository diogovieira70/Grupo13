package grupo13.portal_estagios;

import jakarta.persistence.*;

@Entity
@Table(name="curso")
public class Curso {
	public long idCurso;
	public String nomeCurso;
	
	public Curso(long idCurso, String nomeCurso) {
		super();
		this.idCurso = idCurso;
		this.nomeCurso = nomeCurso;
	}

	/**
	 * @return the idCurso
	 */
	public long getIdCurso() {
		return idCurso;
	}

	/**
	 * @param idCurso the idCurso to set
	 */
	public void setIdCurso(long idCurso) {
		this.idCurso = idCurso;
	}

	/**
	 * @return the nomeCurso
	 */
	public String getNomeCurso() {
		return nomeCurso;
	}

	/**
	 * @param nomeCurso the nomeCurso to set
	 */
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	@Override
	public String toString() {
		return "Curso [idCurso=" + idCurso + ", nomeCurso=" + nomeCurso + "]";
	}
	
	
	
}
