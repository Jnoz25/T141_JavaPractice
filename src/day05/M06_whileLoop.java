package day05;

import java.util.Scanner;

public class M06_whileLoop {

    static int bolum=0;


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bölünen sayiyi giriniz");
        int bolunen= scan.nextInt();
        System.out.print("Lütfen bölen sayi girin");
        int bolen = scan.nextInt();
        System.out.println("Sonuc : "+bol(bolunen,bolen));


    }

    public static int bol(int bolunen, int bolen) {

        while (bolunen>=bolen){
            bolunen-=bolen;
            bolum++;

        }
        return bolum;


    }
}
