package ud08Test04;
// Crearemos una clase llamada serie
// Con los atriburos titulo, numero de temporadas, entregado, generador y creador


public class Serie {
	
	// Por defecto el numero de de temposrdas será 3, y entregado false.
	final int NUMERO_TEMP_CONST = 3;
	final boolean ENTREGADO_CONST = false;
	
	
	//Atributos de la clase
	private String titulo;
	private int temporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	// Constructores
	public Serie() {
		this.titulo = "";
		this.temporadas = NUMERO_TEMP_CONST;
		this.entregado = ENTREGADO_CONST;
		this.genero = "";
		this.creador= "";
		
	}
	// Constructor con el titulo y creador. El resto por defecto
	public Serie(String titulo, String creador) {
		super();
		this.titulo = titulo;
		this.creador = creador;
		this.entregado = ENTREGADO_CONST;
		this.temporadas = NUMERO_TEMP_CONST;
		this.genero = "";
	}

	// Constructor con todos los atributos,excepto entregado.
	public Serie(String titulo, int temporadas, String genero, String creador) {
		super();
		this.titulo = titulo;
		this.temporadas = temporadas;
		this.genero = genero;
		this.creador = creador;
		this.entregado = ENTREGADO_CONST;
	}
	
	//Getters & Setters
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getTemporadas() {
		return temporadas;
	}
	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}
	public boolean isEntregado() {
		return entregado;
	}
	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", temporadas=" + temporadas + ", entregado=" + entregado + ", genero="
				+ genero + ", creador=" + creador + "]";
	}
	
	
	
	
	
	
	

	

}
