package Tasks.ex_18102024;

public class ReverseAString {
    public static void main(String[] args) {

        //(2)Reverse the String without using the any functions. (for loop)
        String str1 = "Aman";
        String temp = "";

        for(int i = str1.length()-1; i>=0; i--){
            temp = temp + str1.charAt(i);
        }
        System.out.println("Reversed string is "+temp);
    }
}
