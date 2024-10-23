package Tasks.ex_18102024;

public class StringPalindrome {
    public static void main(String[] args) {

//     (3)   Palindrome
//
//        Input : str = "abba"
//        Output: Yes
//
//        Input : str = "pramod"
//        Output: No

        String str1 = "Aman";

        String temp = "";

        for(int i= str1.length()-1;i>=0; i--){
            temp = temp + str1.charAt(i);

        }
        if(str1.equals(temp)){
            System.out.println("Palindrome");
        }
        else
            System.out.println("Not a palindrome");
    }
}
