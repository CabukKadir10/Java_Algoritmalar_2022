package java_odevleri;

import java.util.Scanner;

public class ödev3 {

	public static void main(String[] args) {
		int pay, payda;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen pay degerini giriniz...");
		pay = scan.nextInt();
		System.out.println("Lutfen payda degerini giriniz...");
		payda = scan.nextInt();
		
		if(payda > pay) {
			System.out.println("Basit Kesir Girdiniz..");
		}else if(pay == payda) {
			System.out.println("Girdiginiz deger tam sayıdır..");
		}else {
			float ondalik = (float)(pay%payda)/payda;
			System.out.println("Birleşik kesir girdiniz kesir degeri " + pay/payda + " tam " + ondalik+ " dir");
		}
	}
}
