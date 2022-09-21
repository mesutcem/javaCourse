package introduction;

public class Main {

	public static void main(String[] args) {
		//System.out.println("imasinner");
		
		String text = "immasinnerinacode";
		String myName = "mesut";
		
		//System.out.println(text);
		
		int age = 18;
		
		double dollarAgo = 18.2;
		double dollarNow = 18.2;
		
		boolean didDollarDecrease = false;
		
		String arrowDirection = "";
		
		if (dollarNow < dollarAgo) {
			arrowDirection = "down.svg";
			System.out.println(arrowDirection);
		
		} else if(dollarNow > dollarAgo) {
			arrowDirection = "up.svg";
			System.out.println(arrowDirection);
		}
		else {
			arrowDirection = "equal.svg";
			System.out.println(arrowDirection);
			
		}
		
		//array
		
		String[] krediler = {"Hızlı Kredi", "Maaşı Halkbank", "Mutlu Emekli"}; // köşeli parantez -> liste oluyo
		


		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
			
		}

	}

}
