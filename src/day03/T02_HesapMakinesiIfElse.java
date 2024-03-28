package day03;
import java.util.Scanner;

public class T02_HesapMakinesiIfElse {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("İlk sayıyı girin:");
            double sayi1 = scanner.nextDouble();

            System.out.println("İkinci sayıyı girin:");
            double sayi2 = scanner.nextDouble();

            System.out.println("İşlemi seçin: Toplama (+), Çıkarma (-), Çarpma (*), Bölme (/)");
            String islem = scanner.next();

            double sonuc = 0;

            if (islem.equals("+")) {
                sonuc = sayi1 + sayi2;
            } else if (islem.equals("-")) {
                sonuc = sayi1 - sayi2;
            } else if (islem.equals("*")) {
                sonuc = sayi1 * sayi2;
            } else if (islem.equals("/")) {
                if (sayi2 != 0) {
                    sonuc = sayi1 / sayi2;
                } else {
                    System.out.println("Bir sayı sıfıra bölünemez!");
                    return;
                }
            } else {
                System.out.println("Geçersiz işlem!");
                return;
            }

            System.out.println("Sonuç: " + sonuc);
        }
    }
