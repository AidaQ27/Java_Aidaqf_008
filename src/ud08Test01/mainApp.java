package ud08Test01;

import java.util.Scanner;

import ud08Test01.Persona.Sexo;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creamos el objeto
		Sexo sexo= Sexo.H ;
		Sexo sexoM = Sexo.M;
		Persona per =new Persona();
		Persona persona1 = new Persona("Pepo", 35, "6969669", sexo , 72.30, 1.69);
		Persona persona2 = new Persona("Pepo", 35, "6969669", sexo, 72.30, 1.69);
		Persona persona3 = new Persona("Maria", 45, "456465465", sexoM, 56.36, 1.65);
		
		
		Scanner sc= new Scanner(System.in);
		
		
		
	// Impresion de pruebas 
	//	System.out.println(persona1)
	//  System.out.println(persona2);
	//	System.out.println(persona3);
	//	System.out.println(persona4);
		
		
		System.out.println(persona1.getNombre()); //Para que muestre el nombre de persona1
		persona2.setNombre("Katty"); //Para que modifique el nombre de persona2
		System.out.println(persona2);// Muestra la modificacion de persona 2
		System.out.println(persona2.getPeso()); //Para mostrar el peso de persona2
		System.out.println(persona3);
	}

}
