package mukemmelSayilar;

public class Main {
	
	public static void main(String[] args) {
		int total = 0;
		int number =0;
		
		if(number < 1) {
			System.out.println("Geçersiz sayı girdiniz.");
			return;
		}
		for(int i = 1; i<number; i++) {
			if(number%i == 0) {
				total = total + i;
			}
			
		}
		
		if(total == number) {
			System.out.println("Sayı mükemmeldir.");
		}
		else {
			System.out.println("Sayı mükemmel değildir.");
		}
	}

}
