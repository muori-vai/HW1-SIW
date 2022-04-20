package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Corso {
	
	public Corso(Long id, String nome, LocalDate dataInizio, int mesi, List<Allievo> allievi, Docente docente) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataInizio = dataInizio;
		this.mesi = mesi;
		this.allievi = allievi;
		this.docente = docente;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String nome;
	private LocalDate dataInizio;
	private int mesi;
	
	@ManyToMany
	private List<Allievo> allievi;
	
	@ManyToOne(cascade = {CascadeType.PERSIST})
	private Docente docente;

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

	public LocalDate getDataInizio() {
		return dataInizio;
	}

	public void setDataInizio(LocalDate dataInizio) {
		this.dataInizio = dataInizio;
	}

	public int getMesi() {
		return mesi;
	}

	public void setMesi(int mesi) {
		this.mesi = mesi;
	}

	public List<Allievo> getAllievi() {
		return allievi;
	}

	public void setAllievi(List<Allievo> allievi) {
		this.allievi = allievi;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}
}
