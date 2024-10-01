package Tasks.ex_25092024_30092024_loops;

public class Lab004_vowels_constant {
    public static void main(String[] args) {
        //(4) Count vowels and consonants in a String. (pramod) - v = 2 , c = 4

        String str = "pramod";
        int vowels = 0, consonants = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
