package day05;

import java.util.Scanner;

public class M05_whileLoop {

    public static long usHesapla(int taban, int us){

        long sonuc=1;
        while (us !=0){
            sonuc*=taban;
            us--;
        }

        return sonuc;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Üssünü bulmak istedgin sayıyı gir");
        int taban = scan.nextInt();
        System.out.println("üs sayısını gir");
        int us = scan.nextInt();
        System.out.println("Sonuç " + usHesapla(taban,us));

    }
}
