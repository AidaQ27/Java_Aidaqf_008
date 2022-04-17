package ud08Test02;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Password password1 = new Password();
		
		System.out.println(password1.contrasenyaAleatoria());
		System.out.println(password1.toString());
		
		Password password2 = new Password(15);
		
		System.out.println(password2.contrasenyaAleatoria());
		System.out.println(password2.toString());
		
		
		
	}

}
