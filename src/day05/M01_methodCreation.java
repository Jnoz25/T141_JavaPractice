package day05;

import java.util.Scanner;

public class M01_methodCreation {
    //Soru: Bir metod oluşturun ve bu metod bir string alıp bu string'in uzunluğunu döndürsün.

    public static int calculateStringLenght(String text){


        return text.length();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir metin girin uzunluğu birazdan size söyleyeceğim");
        String metin = scan.nextLine();
        System.out.println("Girilen String Uzunluğu   " +calculateStringLenght(metin) );

    }


}
