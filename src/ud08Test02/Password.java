package ud08Test02;
import java.util.Random;
// Haz una clase llamada 'password'
// que tenga los atributos longitud(8) y contrase�a
//Los constructores ser�n lo siguiente:
//Un constructor por defecto - Un constructor con la longitud que nosotros le pasemos. Generara una contrase�a aleatoria con esa longitud

public class Password {
	//Atributos de la clase
	private int longitud;
	private String contrasenya;
	


// Constructores

// Constructor por defecto, que no se le pasa nada por parametro. LONGITUD 8.
public Password(){
	this.longitud = 8;
	this.contrasenya = contrasenyaAleatoria();
	}

//Constructor con la longitud introducida por el constructor
public Password(int longitud) {
	this.longitud = longitud;
	this.contrasenya = contrasenyaAleatoria();
}

//getters & setters
//getter = pedir
//setter = modificar

//Devuelve la lontitud de la contrase�a
public int getLongitud() {
	return longitud;
}


// Devuelve la contrase�a
public String getContrasenya() {
	return contrasenya;
}

// Puede modificar la contrase�a
public void setContrasenya(String contrasenya) {
	this.contrasenya = contrasenya;
}

//Metodo para generar una contrase�a aleatoria

public String contrasenyaAleatoria() {
	String contrasenya = "";
	final char[] numeros = {'1','2','3','4','5','6','7','8','9'};
	
	// Creamos un nuevo objeto random
	Random aleatoria = new Random();
	for (int i = 0; i < longitud; i++) {
		contrasenya += numeros[aleatoria.nextInt(numeros.length)];
		
	}
	
	return contrasenya;
}
//Imprimir Longitud + contrase�a
@Override
public String toString() {
	return "Password [longitud=" + longitud + ", contrase�a=" + contrasenya + "]";
}


}

