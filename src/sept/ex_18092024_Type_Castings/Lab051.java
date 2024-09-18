package sept.ex_18092024_Type_Castings;

public class Lab051 {
    public static void main(String[] args) {
        long phone_no = 9834567898l;
       // short s=phone_no; //Narrowing - implicit - JVM never allow//invalid
       short s1=(short)phone_no; //Narrowing - explicit - loss //invalid
    }
}
