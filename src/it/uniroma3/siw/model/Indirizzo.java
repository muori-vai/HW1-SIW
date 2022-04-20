package it.uniroma3.siw.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Indirizzo {

	public Indirizzo(Long id, String via, int numeroCivico, String comune, int cAP, String provincia) {
		super();
		this.id = id;
		this.via = via;
		this.numeroCivico = numeroCivico;
		this.comune = comune;
		CAP = cAP;
		this.provincia = provincia;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String via;
	private int numeroCivico;
	private String comune;
	private int CAP;
	private String provincia;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getVia() {
		return via;
	}
	public void setVia(String via) {
		this.via = via;
	}
	public int getNumeroCivico() {
		return numeroCivico;
	}
	public void setNumeroCivico(int numeroCivico) {
		this.numeroCivico = numeroCivico;
	}
	public String getComune() {
		return comune;
	}
	public void setComune(String comune) {
		this.comune = comune;
	}
	public int getCAP() {
		return CAP;
	}
	public void setCAP(int cAP) {
		CAP = cAP;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
}
