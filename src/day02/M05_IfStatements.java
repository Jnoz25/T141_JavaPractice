package day02;



import java.util.Scanner;

public class M05_IfStatements {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı girin");
        int age = scan.nextInt();
        System.out.println("Türkiye cumhuriyeti vatandaşı mısınız ? (E/H)");
        char nationality = scan.next().toUpperCase().charAt(0);

        if (age >= 18 && nationality == 'E') {

            System.out.println("Ehliyet alabirisniz");
        }



        /*
        Türkiye Cumhuriyetinde yaşayan birisi eğer 18 yaşında ve tc vatandaşı ise ehliyet alabilir
        Kullanıcıdan yaşını vs tc vatandaşı olup olmadığını sorup ehliyet alabilyiorsa yazdır.
         */

    }
}
