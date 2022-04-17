package ud08Test03;
// Creamos una clase llamada Electrodomestico
// Con los Atributos precio base, color, consumo energetico (a-f) y peso. 
//Indica que se podran heredar.

public class Electrodomestico {
	
	// Por defecto creamos las constantes en modo final
	final double PRECIO_CONST = 100;
	final Color COLOR_CONST = Color.blanco;
	final Consumo LETRA_CONST = Consumo.F;
	final double PESO_CONST = 5;
	
	enum Consumo {
		A, B, C, D, E, F
	}
	
	enum Color {
		blanco, negro, rojo, azul, gris
		
	}
	// Atributo de electrodomestico
	private double precio;
	private Color colorin;
	private Consumo letra;
	private double peso;
	
	//Constructor por defecto
	public Electrodomestico() {
		this.precio= PRECIO_CONST;
		this.colorin = COLOR_CONST;
		this.letra = LETRA_CONST;
		this.peso = PESO_CONST;
		
	}
	// Constructor con el precio y el peso. El resto por defecto
	public Electrodomestico(double precio, double peso) {
		super();
		this.precio = precio;
		this.peso = peso;
		this.colorin = COLOR_CONST;
		this.letra = LETRA_CONST;
		
	}
	// Constructor con todos los atributos
	public Electrodomestico(double precio, Color colorin, Consumo letra, double peso) {
		super();
		this.precio = precio;
		this.colorin = colorin;
		this.letra = letra;
		this.peso = peso;
	}

	// Getter & Setters
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Color getColorin() {
		return colorin;
	}

	public void setColorin(Color colorin) {
		this.colorin = colorin;
	}

	public Consumo getLetra() {
		return letra;
	}

	public void setLetra(Consumo letra) {
		this.letra = letra;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	// Para imprimir
	@Override
	public String toString() {
		return "Electrodomestico [precio=" + precio + ", color=" + colorin + ", letra=" + letra + ", peso=" + peso
				+ "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
