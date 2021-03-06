package leyenda.dao;// default package
// Generated 22-abr-2019 12:08:48 by Hibernate Tools 5.1.10.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * DragonesPrincesas generated by hbm2java
 */
@Entity
@Table(name = "dragones_princesas", catalog = "LEYENDA")
public class DragonesPrincesas implements java.io.Serializable {

	private String nombreDragon;
	private Integer puntosVida;
	private Integer puntosArmadura;
	private Integer puntosAtaque;
	private String nombrePrincesa;
	private String colorMagia;
	private Integer numerosConjuros;
	private String nombreRosa;

	public DragonesPrincesas() {
	}

	public DragonesPrincesas(String nombreDragon) {
		this.nombreDragon = nombreDragon;
	}

	public DragonesPrincesas(String nombreDragon, Integer puntosVida, Integer puntosArmadura, Integer puntosAtaque,
			String nombrePrincesa, String colorMagia, Integer numerosConjuros, String nombreRosa) {
		this.nombreDragon = nombreDragon;
		this.puntosVida = puntosVida;
		this.puntosArmadura = puntosArmadura;
		this.puntosAtaque = puntosAtaque;
		this.nombrePrincesa = nombrePrincesa;
		this.colorMagia = colorMagia;
		this.numerosConjuros = numerosConjuros;
		this.nombreRosa = nombreRosa;
	}

	@Id

	@Column(name = "NOMBRE_DRAGON", unique = true, nullable = false, length = 50)
	public String getNombreDragon() {
		return this.nombreDragon;
	}

	public void setNombreDragon(String nombreDragon) {
		this.nombreDragon = nombreDragon;
	}

	@Column(name = "PUNTOS_VIDA")
	public Integer getPuntosVida() {
		return this.puntosVida;
	}

	public void setPuntosVida(Integer puntosVida) {
		this.puntosVida = puntosVida;
	}

	@Column(name = "PUNTOS_ARMADURA")
	public Integer getPuntosArmadura() {
		return this.puntosArmadura;
	}

	public void setPuntosArmadura(Integer puntosArmadura) {
		this.puntosArmadura = puntosArmadura;
	}

	@Column(name = "PUNTOS_ATAQUE")
	public Integer getPuntosAtaque() {
		return this.puntosAtaque;
	}

	public void setPuntosAtaque(Integer puntosAtaque) {
		this.puntosAtaque = puntosAtaque;
	}

	@Column(name = "NOMBRE_PRINCESA", length = 50)
	public String getNombrePrincesa() {
		return this.nombrePrincesa;
	}

	public void setNombrePrincesa(String nombrePrincesa) {
		this.nombrePrincesa = nombrePrincesa;
	}

	@Column(name = "COLOR_MAGIA", length = 50)
	public String getColorMagia() {
		return this.colorMagia;
	}

	public void setColorMagia(String colorMagia) {
		this.colorMagia = colorMagia;
	}

	@Column(name = "NUMEROS_CONJUROS")
	public Integer getNumerosConjuros() {
		return this.numerosConjuros;
	}

	public void setNumerosConjuros(Integer numerosConjuros) {
		this.numerosConjuros = numerosConjuros;
	}

	@Column(name = "NOMBRE_ROSA", length = 50)
	public String getNombreRosa() {
		return this.nombreRosa;
	}

	public void setNombreRosa(String nombreRosa) {
		this.nombreRosa = nombreRosa;
	}

}
