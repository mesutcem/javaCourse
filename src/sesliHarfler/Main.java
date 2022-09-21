package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char letter ='B';
		char[] kalinSes = {'A','I','O','U'};
		char[] inceSes = {'E','İ','Ö','Ü'};
		boolean isKalin = true;
		
		for(int i = 0; i<4; i++) {
			if(letter == inceSes[i]) {
				isKalin = false;
				break;
			}
			else if(letter == kalinSes[i]) {
				isKalin = true;
				break;
			}
			else {
				System.out.println("Geçersiz harf girdiniz.");
				return;
			}			
		}
		
		if(isKalin == true) {
			System.out.println("Harf kalındır");
		}
		else {
			System.out.println("Harf incedir.");
		}
		
	}

}
