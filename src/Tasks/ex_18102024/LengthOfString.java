package Tasks.ex_18102024;

public class LengthOfString {
    public static void main(String[] args) {

      // (1) Calculate the length of the String - without using the length() function.
       //     String name =”Pramod”; →  6 , CharArray, for loop

        String str1 = "Suraj";
        int count =0;

        for(int i =0; i<str1.length(); i++){

            if(str1.charAt(i) == '/'){
                break;

            }
            else
                count++;
        }
        System.out.println("Length of the string is "+count);
    }
}
