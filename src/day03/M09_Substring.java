package day03;

import java.util.Scanner;

public class M09_Substring {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 4 hatfli bir kelime giriniz");
        String word = scan.nextLine();

        System.out.println(word.substring(3)+word.substring(2,3)+word.substring(1,2)+word.substring(0,1));




    }
}
