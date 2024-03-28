package day03;

import java.util.Scanner;

public class M11_Substring {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen mail adresinizi giriniz");

        String email = scan.next();

        if (email.contains("hotmail")){
            email =email.replaceAll("hotmail","gmail");
            System.out.println(email);

        }else {

            System.out.println("Mail değişmemiştir");
        }



    }

}
