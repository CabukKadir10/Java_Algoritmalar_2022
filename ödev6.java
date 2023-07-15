package java_odevleri;

import java.util.Scanner;

public class ödev6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String cinsiyet;
		int adim_sayisi;
		float kalori;
		
		System.out.println("lutfen cinsiyeti giriniz.");
		cinsiyet = scan.nextLine();
		
		System.out.println("Lutfen atılan adım sayısını giriniz.");
		adim_sayisi = scan.nextInt();
		
		if(cinsiyet.equals("kadin")) {
			kalori = adim_sayisi*30/500; 
		}else {
			kalori = adim_sayisi*45/500;
		}
		
		System.out.println("yakılan kalori: " + kalori);

	}
}
