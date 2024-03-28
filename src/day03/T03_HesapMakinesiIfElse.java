package day03;
import java.util.Scanner;
public class T03_HesapMakinesiIfElse {
    public static void main(String[] args) {
        //Basit bir hesap makinesi yapalım. Kullanıcıdan  2 değer alınız. Toplama çıkarma çarpma ve bölme işlemlerini yaptırsın.
    //*Not sayı 0 a bölünemez eğer sayı2 değeri 0 girilirse hata versin.
    //*Not işlem dışında başka bir değer girerse hatalı giriş yapıldı diye uyarı versin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen birinci sayı giriniz");
        double sayi1 = scanner.nextDouble();

        System.out.println("Lütfen ikinci sayı giriniz");
        double sayi2 = scanner.nextDouble();

        System.out.println("Yapmak istediğiniz işlemi seçiniz : Toplama (+) , Çıkarma (-) , Çarpma (*) , Bölme (/)");
        String islem = scanner.next();

        double sonuc = 0;

        if (islem.equals("+")) {
            sonuc = sayi1+sayi2;
        } else if (islem.equals("-")) {
            sonuc = sayi1-sayi2;
        } else if (islem.equals("*")) {
            sonuc = sayi1 * sayi2;
        } else if (islem.equals("/")) {
            if (sayi2 != 0) {
                sonuc = sayi1 / sayi2;
            }else {
                System.out.println("Sayı sıfıra bölünmez");

            }

        }
        else {

            System.out.println("Hatalı giris yapıldı");

        }


        System.out.println("Sonuç   :" + sonuc);

    }

}
