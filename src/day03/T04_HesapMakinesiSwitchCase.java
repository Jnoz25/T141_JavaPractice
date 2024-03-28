package day03;

import java.util.Scanner;

public class T04_HesapMakinesiSwitchCase {
    public static void main(String[] args) {

        //Kullanıcı 2 değer girsin
        // Kullanıcı ekrandan Toplama çıkarma Çarpma bölme seçsin ve sonucu yazdırsın


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 1. Sayıyı giriniz");
        double sayi1 = scanner.nextDouble();
        System.out.println("Lütfen 2. Sayıyı giriniz");
        double sayi2 = scanner.nextDouble();

        System.out.println("İşlem seçsin");
        System.out.println("1.Toplama");
        System.out.println("2.Çıkarma");
        System.out.println("3.Çarpma");
        System.out.println("4.Bölme");

        int secim = scanner.nextInt();

        double sonuc = 0;

        switch (secim){

            case 1:
            sonuc = sayi1+sayi2;
            break;

            case 2:
                sonuc = sayi1-sayi2;
                break;


            case 3:

            sonuc = sayi1*sayi2;
            break;

            case 4:
            if (sayi2 != 0) {
                sonuc = sayi1 / sayi2;
            }else {
                System.out.println("Sayı sıfıra bölünmez ");
            }
           break;


        }















    }
}
