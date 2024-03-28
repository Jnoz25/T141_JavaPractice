package day03;

import java.util.Scanner;

public class M06_switchStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Bir ay numarası girin (1-12): ");
        int ay = scan.nextInt();


        switch (ay) {
            case 12:
            case 1:
            case 2:
                System.out.println("Kış mevsimi");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("İlkbahar mevsimi");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yaz mevsimi");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Sonbahar mevsimi");
                break;
            default:
                System.out.println("Geçersiz ay numarası.");
                break;
        }
    }
}