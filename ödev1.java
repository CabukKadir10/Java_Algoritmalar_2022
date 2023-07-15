package java_odevleri;

import java.util.Scanner;

public class ödev1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        int boy, kilo, Boy_Kilo;
        System.out.println("Lutfen boyunuzu cm turunden giriniz.");
        boy = scan.nextInt();
        System.out.println("Lutfen kiloonuzu giriniz.");
        kilo = scan.nextInt();

        Boy_Kilo = boy / kilo;

        if(Boy_Kilo < 2) {
            System.out.println("Sisman");
        }else if(Boy_Kilo < 2.5) {
            System.out.println("Normal");
        }else {
            System.out.println("Zayif");
        }

	}

}
