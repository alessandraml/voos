package com.atech.voo.model;

import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Created by alessandra on 2018/01/14.
 */
@Entity
@Table(name = "voos")
public class Voo {

	@Id
    @GeneratedValue
    private Long id;
	private String numero;
    private Time horarioSaida;
    private Time horarioChegada;
	@OneToOne(fetch = FetchType.EAGER)
    private Cidade cidadeOrigem;
	@OneToOne(fetch = FetchType.EAGER)
    private Cidade cidadeDestino;
	@OneToOne(fetch = FetchType.EAGER)
    private Aeronave aeronave;
	@OneToOne(fetch = FetchType.EAGER)
    private Piloto piloto;
    @OneToOne(fetch = FetchType.EAGER)
    private Status status;
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}
	/**
	 * @return the horarioSaida
	 */
	public Time getHorarioSaida() {
		return horarioSaida;
	}
	/**
	 * @param horarioSaida the horarioSaida to set
	 */
	public void setHorarioSaida(Time horarioSaida) {
		this.horarioSaida = horarioSaida;
	}
	/**
	 * @return the horarioChegada
	 */
	public Time getHorarioChegada() {
		return horarioChegada;
	}
	/**
	 * @param horarioChegada the horarioChegada to set
	 */
	public void setHorarioChegada(Time horarioChegada) {
		this.horarioChegada = horarioChegada;
	}
	/**
	 * @return the cidadeOrigem
	 */
	public Cidade getCidadeOrigem() {
		return cidadeOrigem;
	}
	/**
	 * @param cidadeOrigem the cidadeOrigem to set
	 */
	public void setCidadeOrigem(Cidade cidadeOrigem) {
		this.cidadeOrigem = cidadeOrigem;
	}
	/**
	 * @return the cidadeDestino
	 */
	public Cidade getCidadeDestino() {
		return cidadeDestino;
	}
	/**
	 * @param cidadeDestino the cidadeDestino to set
	 */
	public void setCidadeDestino(Cidade cidadeDestino) {
		this.cidadeDestino = cidadeDestino;
	}
	/**
	 * @return the aeronave
	 */
	public Aeronave getAeronave() {
		return aeronave;
	}
	/**
	 * @param aeronave the aeronave to set
	 */
	public void setAeronave(Aeronave aeronave) {
		this.aeronave = aeronave;
	}
	/**
	 * @return the piloto
	 */
	public Piloto getPiloto() {
		return piloto;
	}
	/**
	 * @param piloto the piloto to set
	 */
	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}
	/**
	 * @return the status
	 */
	public Status getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(Status status) {
		this.status = status;
	}
	
}
