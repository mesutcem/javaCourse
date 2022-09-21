package arraysDemo;

public class arraysDemo {

	public static void main(String[] args) {
		
		String ogrenci1="Mesut";
		String ogrenci2="Saim";
		String ogrenci3="Enes";
		String ogrenci4="Ahmet";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		System.out.println("--------------------");

		String[] ogrenciler = new String[4]; //eşittire kadarki okunuşu: string array öğrenciler, eşittirin sağındaki köşeli parantezde dizinin kaç elemanlı olacağı girilir
		ogrenciler[0] = "Mesut"; // öğrencilerin 1. elemanını(index sıfırını) tanımladık
		ogrenciler[1] = "Saim"; // öğrencilerin 2. elemanını(index birini) tanımladık
		ogrenciler[2] = "Enes"; //...
		ogrenciler[3] = "Ahmet"; //...
		
		String[] ogrenciler2 = {"Mesut", "Saim", "Enes", "Ahmet"}; //ogrenciler2 dizisinin elemanlarını tek satırda bu şekilde de yazabiliriz
		
		for(int i=0; i<ogrenciler.length; i++){ //i sıfırdan başlamak üzere oğrencilerin uzunluğundan küçük olacak şekilde i'yi bir bir arttır
			System.out.println(ogrenciler[i]); //öğrencilerin i'ninci indexini yazdır
		}
		
		System.out.println("--------------------");
		
		for(String ogrenci:ogrenciler) { //ogrenci öyle bi şey ki öğrencilerin içindeki elemanları tek tek geziyo
			System.out.println(ogrenci); // ogrenciler dizisindeki elemanları tek tek gezen ogrenciyi yazdır
		}
		
		

	}

}
