package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Docente {

	public Docente(Long id, String nome, String cognome, String luogoNascita, LocalDate dataNascita, String partitaIVA,
			List<Corso> corsi) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.luogoNascita = luogoNascita;
		this.dataNascita = dataNascita;
		this.partitaIVA = partitaIVA;
		this.corsi = corsi;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String nome;
	private String cognome;
	private String luogoNascita;
	private LocalDate dataNascita;
	private String partitaIVA;
	
	@OneToMany(mappedBy = "docente") //fetch = FetchType.EAGER?
	  								 //in base all'applicazione, qui si potrebbe mettere EAGER nel caso
	  								 //fosse più efficiente caricare anche tutti i corsi di un docente
	private List<Corso> corsi;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getLuogoNascita() {
		return luogoNascita;
	}

	public void setLuogoNascita(String luogoNascita) {
		this.luogoNascita = luogoNascita;
	}

	public LocalDate getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}

	public String getPartitaIVA() {
		return partitaIVA;
	}

	public void setPartitaIVA(String partitaIVA) {
		this.partitaIVA = partitaIVA;
	}

	public List<Corso> getCorsi() {
		return corsi;
	}

	public void setCorsi(List<Corso> corsi) {
		this.corsi = corsi;
	}
}
