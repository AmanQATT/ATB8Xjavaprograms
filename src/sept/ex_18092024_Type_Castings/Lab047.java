package sept.ex_18092024_Type_Castings;

public class Lab047 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 10;
       // byte c = a+b; // This is not possible because it suggested always go with bigger ones.
        // byte will not handle this so we take bigger one it is int.
        int c = a+b;
        System.out.println(c);


         char a1= 'A'; // ascii value is 65
        System.out.println(a1); // when we directly print this then it prints character.
        char b1= 'B';// 66
        // only concatenation(Add of two char) will lead this.
        int c1=a1+b1;
        System.out.println(c1); // 131
        // when two characters are added there ASCII value is added.
    }
}
