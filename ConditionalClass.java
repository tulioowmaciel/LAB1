
public class ConditionalClass {

	public static void main(String[] args) {
		int age= 116;  
		
		// IF( SE ) > o c�digo ser� executado somente se a condi��o dentro do IF for verdadeira
		if (age > 18) { 
			System.out.println("Voc� � obrigado a votar!");
			
		}
		
	if (age > 65) {
		System.out.println("Voc� pode optar por votar!");
		
	}
	
	age =2;
	if (age < 16) {
		System.out.println("Voc� n�o pode votar!");
		
	}
	
	if (age <= 16) {
		System.out.println("Voc� n�o pode votar!");
		
	}
	
	age = 18;
	if (age >= 18) {
		System.out.println("Voc� pode votar!");
		}
	

	age = 50;
	if (age == 50) {
		System.out.println("voc� tem 50 anos");
		
	}
	
	if (age != 100) {
		System.out.println("Voc� ainda � novo");
	}
	
	
	}
	
	
	
		
	
}
