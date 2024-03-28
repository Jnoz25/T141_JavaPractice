package day05;

import java.util.Scanner;

public class M02_methodCreation {

    public static int ikiSayiyiTopla (int num1,int num2){

        int a = num1+num2;

        return a;



    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen iki sayı giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        System.out.println("Girilen sayıların toplamı     "+ ikiSayiyiTopla(sayi1,sayi2));
        System.out.println("Teşekkürler");

    }

}
