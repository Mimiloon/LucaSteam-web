package com.ejemplos.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vgsales")
public class Game {
	// ----------------------
	// Atributos
	// ----------------------

	/**
	 * Identificador del juego
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int rank;
	/**
	 * Nombre del juego
	 */
	@Column(name = "Name")
	private String name;
	/**
	 * Diferentes plataformas de juegos
	 */
	@Column(name = "Platform")
	private String platform;
	/**
	 * Año de salida del juego
	 */
	@Column(name = "Year")
	private int year;
	/**
	 * Diferentes generos del juego
	 */
	@Column(name = "Genre")
	private String genre;
	/**
	 * Editor del juego
	 */
	@Column(name = "Publisher")
	private String publisher;
	/**
	 * Venta de juegos en Norteamérica
	 */
	private float NA_Sales;
	/**
	 * Venta de juegos en Europa
	 */
	private float EU_Sales;
	/**
	 * Venta de juegos en Japón
	 */
	private float JP_Sales;
	/**
	 * Otras ventas
	 */
	@Column(name = "Other_Sales")
	private float other_sales;
	/**
	 * Ventas globales
	 */
	@Column(name = "Global_Sales")
	private float global_sales;

	// -----------------------
	// Constructores
	// -----------------------

	/**
	 * Constructor por defecto
	 */
	public Game() {
		super();
	}

	/**
	 * Constructor con 11 parametros
	 * 
	 * @param rank         identificador del juego
	 * @param name         nombre del juego
	 * @param platform     plataforma del juego
	 * @param year         año de publicación del juego
	 * @param genre        genero del juego
	 * @param publisher    editor del juego
	 * @param NA_Sales     ventas en Norteamerica
	 * @param EU_Sales     ventas en Europa
	 * @param JP_Sales     ventas en Japon
	 * @param other_sales  otras ventas
	 * @param global_sales ventas globales
	 */
	public Game(int rank, String name, String platform, int year, String genre, String publisher, float nA_Sales,
			float eU_Sales, float jP_Sales, float other_sales, float global_sales) {
		super();
		this.rank = rank;
		this.name = name;
		this.platform = platform;
		this.year = year;
		this.genre = genre;
		this.publisher = publisher;
		NA_Sales = nA_Sales;
		EU_Sales = eU_Sales;
		JP_Sales = jP_Sales;
		this.other_sales = other_sales;
		this.global_sales = global_sales;
	}

	// ---------------------------
	// Metodos setters y getters
	// ---------------------------

	/**
	 * Metodo que devuelve el identificador del juego
	 * 
	 * @return id del juego
	 */
	public int getRank() {
		return rank;
	}

	/**
	 * Metodo que modifica el identificador del juego
	 * 
	 * @param rank
	 */
	public void setRank(int rank) {
		this.rank = rank;
	}

	/**
	 * Metodo que devuelve el nombre del juego
	 * 
	 * @return nombre del juego
	 */
	public String getName() {
		return name;
	}

	/**
	 * Metodo que modifica el nombre del juego
	 * 
	 * @param nombre
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Metodo que devuelve la plataforma del juego
	 * 
	 * @return plataforma del juego
	 */
	public String getPlatform() {
		return platform;
	}

	/**
	 * Metodo que modifica la plataforma del juego
	 * 
	 * @param platform
	 */
	public void setPlatform(String platform) {
		this.platform = platform;
	}

	/**
	 * Metodo que devuelve el año del juego
	 * 
	 * @return año del juego
	 */
	public int getYear() {
		return year;
	}

	/**
	 * Metodo que modifica el año del juego
	 * 
	 * @param year
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * Metodo que devuelve el genero del juego
	 * 
	 * @return genero del juego
	 */
	public String getGenre() {
		return genre;
	}

	/**
	 * Metodo que modifica el genero del juego
	 * 
	 * @param genre
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}

	/**
	 * Metodo que devuelve el editor del juego
	 * 
	 * @return editor del juego
	 */
	public String getPublisher() {
		return publisher;
	}

	/**
	 * Metodo que modifica el editor del juego
	 * 
	 * @param publisher
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	/**
	 * Metodo que devuelve las ventas norteamericanas de juegos
	 * 
	 * @return ventas norteamericanas de juegos
	 */
	public float getNA_Sales() {
		return NA_Sales;
	}

	/**
	 * Metodo que modifica las ventas norteamericanas de juegos
	 * 
	 * @param nA_Sales
	 */
	public void setNA_Sales(float nA_Sales) {
		NA_Sales = nA_Sales;
	}

	/**
	 * Metodo que devuelve las ventas europeas de juegos
	 * 
	 * @return ventas europeas de juegos
	 */
	public float getEU_Sales() {
		return EU_Sales;
	}

	/**
	 * Metodo que modifica las ventas europeas de juegos
	 * 
	 * @param eU_Sales
	 */
	public void setEU_Sales(float eU_Sales) {
		EU_Sales = eU_Sales;
	}

	/**
	 * Metodo que devuelve las ventas japonesas de juegos
	 * 
	 * @return ventas japonesas de juegos
	 */
	public float getJP_Sales() {
		return JP_Sales;
	}

	/**
	 * Metodo que modifica las ventas japonesas de juegos
	 * 
	 * @param jP_Sales
	 */
	public void setJP_Sales(float jP_Sales) {
		JP_Sales = jP_Sales;
	}

	/**
	 * Metodo que devuelve otras ventas de juegos
	 * 
	 * @return otras ventas de juegos
	 */
	public float getOther_sales() {
		return other_sales;
	}

	/**
	 * Metodo que modifica otras ventas de juegos
	 * 
	 * @param other_sales
	 */
	public void setOther_sales(float other_sales) {
		this.other_sales = other_sales;
	}

	/**
	 * Metodo que devuelve las ventas globales de juegos
	 * 
	 * @return ventas globales de juegos
	 */
	public float getGlobal_sales() {
		return global_sales;
	}

	/**
	 * Metodo que modifica las ventas globales de juegos
	 * 
	 * @param global_sales
	 */
	public void setGlobal_sales(float global_sales) {
		this.global_sales = global_sales;
	}

	// ---------------------------
	// Metodo toString()
	// ---------------------------

	/**
	 * Metodo mediante el cual sacamos por pantalla una especie de informe de los
	 * juegos
	 */
	@Override
	public String toString() {
		return "Game [rank=" + rank + ", name=" + name + ", platform=" + platform + ", year=" + year + ", genre="
				+ genre + ", publisher=" + publisher + ", NA_Sales=" + NA_Sales + ", EU_Sales=" + EU_Sales
				+ ", JP_Sales=" + JP_Sales + ", other_sales=" + other_sales + ", global_sales=" + global_sales + "]";
	}

}
