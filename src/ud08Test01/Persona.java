package ud08Test01;
// Haz una clase llamada 'Persona'
// Los atributos son: nombre, edad, DNI, Sexo (H o M), peso y altura. No queremos que se accedan directamente a ellos.
// Por defecto todos los atributos menos el Dni serán valores por defecto según su tipo. Sexo sera hombre por defecto.

public class Persona {
	
	 enum Sexo {
		 M,
		 H
	}
	
	
	// Atributos
	private String nombre;
	private int edad;
	private String DNI;
	// Esta linia de substituye - private String sexo;
	private Sexo escoge;
	private double peso;
	private double altura;


// Constructor por defecto
	public Persona() {
		this.nombre = "";
		this.edad = 0;
		this.escoge = Sexo.H;
		this.peso = 0.0;
		this.altura = 0.0;
	}

	// Constructor con nombre, edad y sexo.
	public Persona(String nombre, int edad, Sexo escoge) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.escoge = escoge;
		this.peso = 0.0;
		this.altura = 0.0;
	}

	// Constructor con todos los atributos como parametro
	public Persona(String nombre, int edad, String DNI, Sexo escoge, double peso, double altura) {
	
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = DNI;
		this.escoge = escoge;
		this.peso = peso;
		this.altura = altura;
	}
	
	// getters & setters
	// getter = pedir
	// setter = modificar
	
	
	public String getNombre() {
		return nombre;
	}
	
	public Sexo getEscoge() {
		return escoge;
	}

	public void setEscoge(Sexo escoge) {
		this.escoge = escoge;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getDNI() {
		return DNI;
	}


	public void setDNI(String dNI) {
		DNI = dNI;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", escoge=" + escoge + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}

	

	


	/*public boolean hombreMujer(enum sexo) {

		
		return pass;
		
	}*/
	
}



