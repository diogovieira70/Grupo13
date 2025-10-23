package grupo13.portal_estagios;

import jakarta.persistence.*;

@Entity
@Table(name="empresa")

public class Empresa extends Utilizador {
	
	public long idEmpresa;
	public String nomeEmpresa;
	public String contacto;
	
	public Empresa(long idUtilizador, String nomeUtilizador, String password, String tipoUtilizador, long idEmpresa,
			String nomeEmpresa, String contacto) {
		super(idUtilizador, nomeUtilizador, password, tipoUtilizador);
		this.idEmpresa = idEmpresa;
		this.tipoUtilizador = "Empresa";
		this.nomeEmpresa = nomeEmpresa;
		this.contacto = contacto;
	}

	/**
	 * @return the idEmpresa
	 */
	public long getIdEmpresa() {
		return idEmpresa;
	}

	/**
	 * @param idEmpresa the idEmpresa to set
	 */
	public void setIdEmpresa(long idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	/**
	 * @return the nomeEmpresa
	 */
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	/**
	 * @param nomeEmpresa the nomeEmpresa to set
	 */
	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	/**
	 * @return the contacto
	 */
	public String getContacto() {
		return contacto;
	}

	/**
	 * @param contacto the contacto to set
	 */
	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	@Override
	public String toString() {
		return "Empresa [idEmpresa=" + idEmpresa + ", nomeEmpresa=" + nomeEmpresa + ", contacto=" + contacto
				+ ", idUtilizador=" + idUtilizador + ", nomeUtilizador=" + nomeUtilizador + ", password=" + password
				+ ", tipoUtilizador=" + tipoUtilizador + "]";
	}
	
	
	
	
	
	
	
	
	
	
	

}
