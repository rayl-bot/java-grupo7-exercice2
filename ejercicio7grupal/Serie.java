
package ejercicio7grupal;

public class Serie implements Entregable {
	// Atributos
	protected String tituloSerie;
	protected int numTemporada;
	protected boolean entregado;
	protected String generoSerie;
	protected String creador;

	/**
	 * Constructor por defecto
	 * 
	 * @param tituloSerie
	 * @param numTemporada
	 * @param entregado
	 * @param generoSerie
	 * @param creador
	 */
	public Serie() {
		this.tituloSerie = "";
		this.numTemporada = 3;
		this.entregado = false;
		this.generoSerie = "";
		this.creador = "";
	}

	/**
	 * Constructor con titulo y creador
	 * 
	 * @param tituloSerie
	 * @param creador
	 */
	public Serie(String tituloSerie, String creador) {
		this.numTemporada = 3;
		this.entregado = false;
		this.generoSerie = "";
		this.tituloSerie = tituloSerie;
		this.creador = creador;
	}

	/**
	 * Constructor con todos los atributos excepto entregado
	 * 
	 * @param tituloSerie
	 * @param numTemporada
	 * @param generoSerie
	 * @param creador
	 */
	public Serie(String tituloSerie, int numTemporada, String generoSerie, String creador) {
		this.tituloSerie = tituloSerie;
		this.numTemporada = numTemporada;
		this.generoSerie = generoSerie;
		this.creador = creador;
	}

	// Metodos get y set de todos los atributos
	// excepto entregado
	public String getTituloSerie() {
		return tituloSerie;
	}

	public void setTituloSerie(String tituloSerie) {
		this.tituloSerie = tituloSerie;
	}

	public int getNumTemporada() {
		return numTemporada;
	}

	public void setNumTemporada(int numTemporada) {
		this.numTemporada = numTemporada;
	}

	public String getGeneroSerie() {
		return generoSerie;
	}

	public void setGeneroSerie(String generoSerie) {
		this.generoSerie = generoSerie;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public String toString() {
		return "Serie [tituloSerie=" + tituloSerie + ", numTemporada=" + numTemporada + ", entregado=" + entregado
				+ ", generoSerie=" + generoSerie + ", creador=" + creador + "]";
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
		Serie serie1 = (Serie) a;
		if (this.numTemporada > serie1.numTemporada) {
			return 1;
		} else if (this.numTemporada < serie1.numTemporada) {
			return -1;
		} else {
			return 0;
		}
	}
}
