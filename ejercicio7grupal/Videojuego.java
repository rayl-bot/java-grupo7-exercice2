package ejercicio7grupal;

public class Videojuego implements Entregable {
	/***
	 * Declaracion de las variables
	 * 
	 */
	protected String titulo, genero, company;
	protected int horasEstimadas;
	protected boolean entregado;

	// CONSTRUCTORS
	/**
	 * Constructor por defecto
	 */
	public Videojuego() {
		this.titulo = "";
		this.horasEstimadas = 10;
		this.genero = "";
		this.company = "";
		entregado = false;
	}

	/**
	 * @param titulo
	 * @param horasEstimadas
	 */
	public Videojuego(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = "";
		this.company = "";
		entregado = false;
	}

	/**
	 * @param titulo
	 * @param genero
	 * @param company
	 * @param horasEstimadas
	 * @param entregado
	 */
	public Videojuego(String titulo, String genero, String company, int horasEstimadas) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.company = company;
		this.horasEstimadas = horasEstimadas;
		this.entregado = entregado;
	}

	// GETTERS Y SETTERS
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}

	/**
	 * @return the horasEstimadas
	 */
	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	/**
	 * @param horasEstimadas the horasEstimadas to set
	 */
	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	@Override
	public String toString() {
		return "El videojuego " + titulo + " pertenece al genero " + genero + ", creado por " + company + ", tiene "
				+ horasEstimadas + " horas de juego estimadas";
	}

	@Override
	public void Entregar() {
		// TODO Auto-generated method stub
		this.entregado = true;
	}

	@Override
	public void Devolver() {
		// TODO Auto-generated method stub
		this.entregado = false;
	}

	@Override
	public boolean isEntregado() {
		// TODO Auto-generated method stub
		return this.entregado;
	}

	@Override
	public int compareTo(Object a) {
		// TODO Auto-generated method stub
		Videojuego game = (Videojuego) a;
		if (this.horasEstimadas > game.horasEstimadas)
			return 1;
		else if (this.horasEstimadas < game.horasEstimadas)
			return -1;
		else
			return 0;
	}

}
