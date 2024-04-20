package day10;

import java.util.Scanner;

public class CO4_SoruCozum {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Lütfen bir tamsayı, kelime veya cümle girin:");
            String input = scanner.nextLine();
            input = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // Remove non-alphanumeric characters and convert to lowercase
            boolean isPalindrome = true;
            int firstMismatchIndex = -1;
            for (int i = 0; i < input.length() / 2; i++) {
                if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                    isPalindrome = false;
                    firstMismatchIndex = i;
                    break;
                }
            }
            if (isPalindrome) {
                System.out.println("Bu giriş bir palindromdur.");
            } else {
                System.out.println("Bu giriş bir palindrom değil.");
                System.out.println("İlk uyuşmayan karakter: " + input.charAt(firstMismatchIndex));
            }
        }
    }