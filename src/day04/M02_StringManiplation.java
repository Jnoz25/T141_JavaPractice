package day04;

import java.util.Scanner;

public class M02_StringManiplation {
    public static void main(String[] args) {
        /*

        * Kullanıcıdan aldığınız  Adı, Soyadı ve kredi kartı numaralarını aşağıdaki gibi özel forma dönüştürün
        * Kredi kartı numarasını kontrol edin, yoksa 16 haneden küçük olursa   "Geçersiz kredi kartı numarası" yazdırın.
        * input : John White 1234234534561478
          output: Ad : J*** Soyad :W**** kartNo:***********1478 (Adın baş harfleri ve soyadı büyük olmalıdır)
        */

        Scanner scan = new Scanner(System.in);
        System.out.print("İsminiz : ");
        String name = scan.nextLine();
        System.out.print("Soyisminiz");
        String surname = scan.nextLine();
        System.out.print("Arada boşluk bırakmadan 16 haneli kredi kartı numaranızı giriniz");
        String creditCard = scan.nextLine();
        name =name.substring(0,1).toUpperCase()+name.substring(1).replaceAll("\\w","*");
        surname =surname.substring(0,1).toUpperCase()+surname.substring(1).replaceAll("\\w","*");


        if (creditCard.length()>16 || creditCard.length()<16){
            System.out.println("Geçersiz kredi kartı numarası");
        }else {
            System.out.println("Adı : "+name);
            System.out.println("SoyAdı : "+surname);

            System.out.println("Kart Son 4 hane" + creditCard.substring(0,13).replaceAll("\\w","*")+creditCard.substring(12));
        }



    }
}
