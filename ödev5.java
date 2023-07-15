package java_odevleri;

import java.util.Scanner;

public class ödev5 {

	public static void main(String[] args) {
		int dakika;
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen 100 ile 500 arasinda bir deger giriniz");
		dakika = scan.nextInt();
		
		if(dakika >= 100 && dakika<=500) {
			if((dakika%60 + 30) < 60) {
				System.out.println("Sinavin baslangıc saati 8.30'dur " + dakika +"dk sonra saat " +( dakika/60 + 8) + "." +(dakika%60 + 30));
			}else {
				System.out.println("Sinavin baslangıc saati 8.30'dur " + dakika +"dk sonra saat " +( dakika/60 + 8 + 1) + "." +(dakika%60 + 30)%60);
			}
		}else {
			System.out.println("Lutfen belirtilen kosullarda giris yapiniz...");
		}
	}
}
