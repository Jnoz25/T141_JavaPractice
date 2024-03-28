package day05;

import java.util.Scanner;

;

public class M03_methodCreation {


    public static String repeatText(String text , int number){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < number; i++) {
            result.append(text);

        }
        return result.toString();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Metini girin ve kaç gez yazdırılacağı sayıyı yazın");

        String metin = scanner.nextLine();
        int sayi = scanner.nextInt();


        System.out.println("Girilen metinin " + sayi + " kez tekrari : "+ repeatText(metin,sayi));
    }








}

