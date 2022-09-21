package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] {1,3,5,7,9,0};
		int aranacak = 5;
		boolean buradaMi = false;
		
		for(int i = 0; i<sayilar.length; i++) {
			if(aranacak == sayilar[i]) {
				buradaMi = true;				
			}		
		}
		if(buradaMi == true) {
			System.out.println("Sayı bu kümededir.");
		}
		else {
			System.out.println("Sayı bu kümede değildir.");
		}
	}

}
