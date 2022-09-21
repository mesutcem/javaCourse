package reCapDemo1;

public class Main {
	
	//en büyük sayıyı yazdır

	public static void main(String[] args) {
		
		int sayi1 = 5;
		int sayi2 = 10;
		int sayi3 = 3;
		int enBuyuk = sayi1;
		
		if (enBuyuk<sayi2) {			
			enBuyuk = sayi2;			
		}
		
		if(enBuyuk<sayi3) {
			enBuyuk = sayi3;			
		}
		
		System.out.println("En büyük sayı: " + enBuyuk);
				
		
	}

}
