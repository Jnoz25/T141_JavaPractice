package day04;

import java.util.Scanner;

public class M06_nestedForLoops {

    /*
 Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız.
        Sonuç böyle olmalıdır;

               *
              * *
             * * *
            * * * *
           * * * * *
            * * * *
             * * *
              * *
               *

           şeklini konsola yazdiriniz.
 */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Boyut giriniz");
        int boyut = scanner.nextInt();

        for (int i = 1; i <boyut ; i++) {

            for (int j = 1; j < boyut-i; j++) {
                System.out.print(" ");
                
            }
            for (int k = 1; k <=i ; k++) {
                System.out.print("* ");

            }
            System.out.println();
        }
        for (int i = boyut-1; i >=1 ; i--) {
            for (int j = 1; j < boyut-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i ; k++) {
                System.out.print("* ");

            }
            System.out.println();

        }


    }




}
