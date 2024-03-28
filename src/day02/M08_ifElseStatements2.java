package day02;

import java.util.Scanner;

public class M08_ifElseStatements2 {
    public static void main(String[] args) {
          /*
       1- Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
       Ornek:  gun=Pazar output = “Hafta sonu”  gun=Sali output = “Hafta ici”
       *** String icin equals method’unusalı kullanin
        */
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen gün ismini giriniz: ");
        String day= scan.nextLine().toLowerCase();

        if (day.equals("pazartesi")){
            System.out.println("Bugün "+day+ " Hafta içi bir gündesiniz! İyi Çalışmalar");
        }else if (day.equals("salı")){
            System.out.println("Bugün "+day+ " Hafta içi bir gündesiniz! İyi Çalışmalar");
        }else if (day.equals("çarşamba")) {
            System.out.println("Bugün " + day + " Hafta içi bir gündesiniz! İyi Çalışmalar");
        }else if (day.equals("perşembe")) {
            System.out.println("Bugün " + day + " Hafta içi bir gündesiniz! İyi Çalışmalar");
        }else if (day.equals("cuma")) {
            System.out.println("Bugün " + day + " Hafta içi bir gündesiniz! İyi Çalışmalar");
        }
        else{
            System.out.println("Bugün "+day+ " Haftasonu bir gündesiniz! İyi tatiler");
        }

    }

}
