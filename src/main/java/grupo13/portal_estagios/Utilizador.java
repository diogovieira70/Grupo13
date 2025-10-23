package grupo13.portal_estagios;
import jakarta.persistence.*;

@Entity
@Table(name="utilizador")
public class Utilizador {
	@Id
	@Column(name="idUtilizador")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long idUtilizador;
	public String nomeUtilizador;
	public String password;
	public String tipoUtilizador;
	
	public Utilizador(long idUtilizador, String nomeUtilizador, String password, String tipoUtilizador) {
		super();
		this.idUtilizador = idUtilizador;
		this.nomeUtilizador = nomeUtilizador;
		this.password = password;
		this.tipoUtilizador = tipoUtilizador;
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
	 * @return the nomeUtilizador
	 */
	public String getNomeUtilizador() {
		return nomeUtilizador;
	}



	/**
	 * @param nomeUtilizador the nomeUtilizador to set
	 */
	public void setNomeUtilizador(String nomeUtilizador) {
		this.nomeUtilizador = nomeUtilizador;
	}



	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}



	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}



	/**
	 * @return the tipoUtilizador
	 */
	public String getTipoUtilizador() {
		return tipoUtilizador;
	}



	/**
	 * @param tipoUtilizador the tipoUtilizador to set
	 */
	public void setTipoUtilizador(String tipoUtilizador) {
		this.tipoUtilizador = tipoUtilizador;
	}



	@Override
	public String toString() {
		return "Utilizador [idUtilizador=" + idUtilizador + ", nomeUtilizador=" + nomeUtilizador + ", tipoUtilizador=" + tipoUtilizador + "]";
	}
	
	
	
	

}
