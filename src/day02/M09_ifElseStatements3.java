package day02;

import java.util.Scanner;

public class M09_ifElseStatements3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen kontrol etmek istediğiniz yılı yazınız");
        int year = scan.nextInt();

        if (year % 100 == 0 && year % 400 == 0) {
            System.out.println("Girdiğiniz" + year + "yılı  ARTIK YILDIR ve 366 gündür");
        } else if (year%100!=0 && year%4==0) {
            System.out.println("Girdiğiniz"+year+"yılı ARTIK YILDIR VE 366 gündür");
            
        } else {
            System.out.println("Girdiğiniz yıl artık yıl değildir");
        }
    }
}
