package day04;

import java.util.Scanner;

public class M05_forLoops {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int toplam=0;
        for (int i = 1; i <=10 ; i++) {
            System.out.println("Lütfen"+i+" . sayiyi giriniz");
            int number = scan.nextInt();
            if (number>5 && number<10){
                continue;
        }
            toplam+=number;
        }

    }
}
