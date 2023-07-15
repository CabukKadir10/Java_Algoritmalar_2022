package java_odevleri;

import java.util.Scanner;

public class ödev2 {
    public static void main(String[] args) {
        System.out.println("1-) BAKİYE GORUNTULEME");
        System.out.println("2-) PARA CEKME");
        System.out.println("3-) PARA YATIRMA");
        System.out.println("4-) CIKIS YAPMA");

        int bakiye = 5000;
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Yapmak İstediginiz İslemi Giriniz...");
        int islem = scan.nextInt();

        switch(islem) {
        case 1:
            System.out.println("Bakiyeniz: " + bakiye);
            break;
        case 2:
            System.out.println("Cekmek İstediginiz Miktari Giriniz...");
            int miktar = scan.nextInt();
            if(miktar > bakiye) {
                System.out.println("Hatali giris Cekmek istediginiz bakiyeye sahip degilsiniz");
            }else {
                bakiye -= miktar;
            }
            System.out.println("İsleminiz başari ile gerçekleşmiştir.");
            System.out.println("Yeni bakiyeniz: " + bakiye);
            break;
        case 3:
        	System.out.println("Lutfen yatırmak istediginiz mıktari giriniz...");
            miktar = scan.nextInt();
            bakiye += miktar;
            System.out.println("Yeni Bakiyeniz: " + bakiye);
            break;
        case 4:
            System.out.println("Cıkıs Yapılıyor...");
            break;
        default:
            System.out.println("Hatalı Nuramaya Bastınız. Lutfen Tekrar Deneyiniz...");
        }
    }
}
