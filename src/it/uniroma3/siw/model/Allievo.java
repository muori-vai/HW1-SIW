package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Allievo {

	public Allievo(Long id, String nome, String cognome, LocalDate dateNascita, String luogoNascita, String matricola,
			String email, List<Corso> corsi, Azienda azienda) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.dateNascita = dateNascita;
		this.luogoNascita = luogoNascita;
		this.matricola = matricola;
		this.email = email;
		this.corsi = corsi;
		this.azienda = azienda;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String nome;
	private String cognome;
	private LocalDate dateNascita;
	private String luogoNascita;
	private String matricola;
	private String email;
	
	@ManyToMany(mappedBy = "allievi") //fetch = FetchType.EAGER?
									  //in base all'applicazione, qui si potrebbe mettere EAGER nel caso
									  //fosse pi? efficiente caricare anche tutti i corsi di un allievo
	private List<Corso> corsi;
	
	@ManyToOne
	private Azienda azienda;

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

	public LocalDate getDateNascita() {
		return dateNascita;
	}

	public void setDateNascita(LocalDate dateNascita) {
		this.dateNascita = dateNascita;
	}

	public String getLuogoNascita() {
		return luogoNascita;
	}

	public void setLuogoNascita(String luogoNascita) {
		this.luogoNascita = luogoNascita;
	}

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Corso> getCorsi() {
		return corsi;
	}

	public void setCorsi(List<Corso> corsi) {
		this.corsi = corsi;
	}

	public Azienda getAzienda() {
		return azienda;
	}

	public void setAzienda(Azienda azienda) {
		this.azienda = azienda;
	}
}
