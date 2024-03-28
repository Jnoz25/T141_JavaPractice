package day03;

import java.util.Scanner;

public class M01_ternary01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");

        int sayi = scan.nextInt();

        System.out.println(sayi>= 0 ? (sayi<10 ? "Rakam " : "Pozitif sayi") : " Negatif Sayi");




    }
}
