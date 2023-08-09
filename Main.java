import java.util.Scanner;

import org.w3c.dom.ls.LSOutput;

public class Main {

	public static void main(String[] args) {
		int dogumYili,çinZodyagıBurcu;
		String burc = null;
		Scanner inp = new Scanner(System.in);
		System.out.println("Dogum Yilinizi Giriniz: ");
		dogumYili = inp.nextInt();
		
		çinZodyagıBurcu = dogumYili%12;
		
		if (çinZodyagıBurcu == 0) {
			burc ="Maymun";
		}
		else if (çinZodyagıBurcu == 1) {
			burc ="Horoz";
		}
		else if (çinZodyagıBurcu == 2) {
			burc ="Kopek";
		}
		else if (çinZodyagıBurcu == 3) {
			burc ="Domuz";
		}
		else if (çinZodyagıBurcu == 4) {
			burc ="Fare";
		}
		else if (çinZodyagıBurcu == 5) {
			burc ="Okuz";
		}
		else if (çinZodyagıBurcu == 6) {
			burc ="Kaplan";
		}
		else if (çinZodyagıBurcu == 7) {
			burc ="Tavsan";
		}
		else if (çinZodyagıBurcu == 8) {
			burc ="Ejderha";
		}
		else if (çinZodyagıBurcu == 9) {
			burc ="Yilan";
		}
		else if (çinZodyagıBurcu == 10) {
			burc ="At";
		}
		else if (çinZodyagıBurcu == 11) {
			burc ="Koyun";
		}
		
		System.out.println("Çin Zodyagı Burcunuz : "+burc);
		

	}
	
	

}
