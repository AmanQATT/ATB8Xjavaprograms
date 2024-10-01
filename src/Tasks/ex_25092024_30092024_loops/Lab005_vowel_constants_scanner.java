package Tasks.ex_25092024_30092024_loops;

import java.util.Scanner;

public class Lab005_vowel_constants_scanner {
    public static void main(String[] args) {

        //(4)Count vowels and consonants in a String. (pramod) - v = 2 , c =. 4

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name: ");

        String A = sc.nextLine();

        int vowels = 0;
        int consonant = 0;
        for (int i = 0; i < A.length(); i++)
        {
            if (A.charAt(i) == 'a' || A.charAt(i) == 'e' || A.charAt(i) == 'i' || A.charAt(i) == 'o' || A.charAt(i) == 'u')
                vowels = vowels + 1;
            else
                consonant = consonant + 1;
        }
        System.out.println("Total vowels=" +vowels);
        System.out.println("Total consonants=" +consonant);
    }
    }
