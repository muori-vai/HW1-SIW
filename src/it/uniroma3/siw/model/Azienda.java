package it.uniroma3.siw.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Azienda {

	public Azienda(Long id, String ragioneSociale, String numeroTelefono, Indirizzo indirizzo) {
		super();
		this.id = id;
		this.ragioneSociale = ragioneSociale;
		this.numeroTelefono = numeroTelefono;
		this.indirizzo = indirizzo;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String ragioneSociale;
	private String numeroTelefono;
	
	@OneToOne(cascade = {CascadeType.PERSIST}) //CascadeType.REMOVE?
	private Indirizzo indirizzo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRagioneSociale() {
		return ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public Indirizzo getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}
}
