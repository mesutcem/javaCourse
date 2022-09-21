package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "       Bugün Ne Yiyeceğiz       ";		
		System.out.println(mesaj);
		
		System.out.println("Eleman sayısı: " + mesaj.length());
		System.out.println("5. eleman: " + mesaj.charAt(2));
		System.out.println(mesaj.concat(": YARRAK yiyeceğiz."));
		System.out.println(mesaj.startsWith("b"));
		System.out.println(mesaj.endsWith("a"));
		
		char [] karakterler = new char[5];
		
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		
		System.out.println(mesaj.indexOf("n")); //ilk bulduğu parametreyi görür görmez kodu bitirir.
		System.out.println(mesaj.lastIndexOf("i")); //ilk bulacağı parametreyi sağdan aramaya başlar. ama soldan kaçıncı olduğunu yazar
		
		System.out.println("---------------------------------");
		
		//System.out.println(mesaj.replace(" ", "-"));
		
		String yeni = mesaj.replace(" ", "-");
		System.out.println(yeni);
		
		System.out.println(mesaj.substring(2,4)); //mesajı 2'den başla 4'e kadar kes demek.
		System.out.println(mesaj.substring(2));  // mesajı 2'den başlayarak kes demek.
		
		//mesaj stringi içerisindeki kelimeleri boşluk charının yardımıyla alt alta yazdırmak:
		
		for(String kelime : mesaj.split(" ")) {
			System.out.println(kelime);			
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		
		System.out.println(mesaj.trim());
		
		
		
	}

}
