package sept.ex_18092024_Type_Castings;

public class Lab059 {
    public static void main(String[] args) {
        int a=10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);
        //Part -> A -> ++a , exp1=11 , a=11
        //+
        //Part -> B -> a++ , exp2=11 , a=12
        //+
        //Part -> C -> a++ , exp3=12 , a=13

        //Line No.|a |exp
        //5  |11 | NA
        //6  |12 | 11+11+12=34
    }
}
