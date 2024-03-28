package day04;

import java.util.Scanner;

public class M04_forLoops {
    /*
Girilen bir stringdeki a harfi sayısını bulunuz.
ama  c harfine  gelirse döngüden çıkılsın
Test daha : java candır gerisi heyecandır.
 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir metin giriniz");

        String word = scan.nextLine();
        int a=0;

        for (int i = 0; i < word.length() ; i++) {

            if (word.toLowerCase().charAt(i)== 'a'){

                a++;
            }else if (word.charAt(i)=='c'){
                break;

            }
            System.out.println("a harfi sayisi" +a);

        }




    }


}
