package leyenda.dao;// default package
// Generated 22-abr-2019 12:08:48 by Hibernate Tools 5.1.10.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Espadas generated by hbm2java
 */
@Entity
@Table(name = "espadas", catalog = "LEYENDA")
public class Espadas implements java.io.Serializable {

	private String nombreEspada;
	private Integer puntosAtaque;

	public Espadas() {
	}

	public Espadas(String nombreEspada) {
		this.nombreEspada = nombreEspada;
	}

	public Espadas(String nombreEspada, Integer puntosAtaque) {
		this.nombreEspada = nombreEspada;
		this.puntosAtaque = puntosAtaque;
	}

	@Id

	@Column(name = "NOMBRE_ESPADA", unique = true, nullable = false, length = 50)
	public String getNombreEspada() {
		return this.nombreEspada;
	}

	public void setNombreEspada(String nombreEspada) {
		this.nombreEspada = nombreEspada;
	}

	@Column(name = "PUNTOS_ATAQUE")
	public Integer getPuntosAtaque() {
		return this.puntosAtaque;
	}

	public void setPuntosAtaque(Integer puntosAtaque) {
		this.puntosAtaque = puntosAtaque;
	}

}
