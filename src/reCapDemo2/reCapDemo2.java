package reCapDemo2;

public class reCapDemo2 {

	public static void main(String[] args) {
		double[] myList = {1.2, 2.6, 4.3, 0.3};
		
		//listedeki sayıları yazdıralım
		for(double sayilar:myList) {
			System.out.println(sayilar);
		}
		
		System.out.println("--------------");
		
		//listedeki sayıları toplayalım
		double toplam = 0;
		for(double i:myList) {
			toplam = toplam + i;		
		}
		System.out.println("Toplam: " + toplam);
		
		System.out.println("--------------");
		
		//listedeki en büyük sayıyı yazdıralım
		double enBuyuk = myList[0];
		if(enBuyuk<myList[3]) {
			enBuyuk = myList[3];
		}
		if(enBuyuk<myList[2]) {
			enBuyuk = myList[2];
		}
		if(enBuyuk<myList[1]) {
			enBuyuk = myList[1];
		}
		System.out.println("En büyük sayı: " + enBuyuk);

	}

}
