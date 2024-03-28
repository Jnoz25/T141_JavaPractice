package day02;

import java.util.Scanner;

public class M01_dataCasting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen Ondalıklı iki adet sayı giriniz");
        System.out.print("1.Sayi : ");
        double sayi1 = scan.nextDouble();
        System.out.print("2.Sayi : ");
        double sayi2 = scan.nextDouble();
        System.out.println("Hesaplama tamamlandı");
        System.out.println("Sonuç: " + (int) (sayi1 / sayi2));


    }
}
