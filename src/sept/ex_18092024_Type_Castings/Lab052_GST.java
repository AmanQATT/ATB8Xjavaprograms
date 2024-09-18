package sept.ex_18092024_Type_Castings;

public class Lab052_GST {
    public static void main(String[] args) {
        //GST=18.45;
        int course=100;
        float GST=18.45f;
      // int Total_price=course+GST;//Narrowing - implicit - JVM never allow//invalid
       // float Total_price=course+GST;//Narrowing - implicit - JVM//valid

        int Total_price=course+(int)GST;//Narrowing - explicit - LOSS//invalid

        System.out.println(Total_price);
    }
}
