package sept.ex_16092024_Operators;

public class Lab038_Relational_operators {
    public static void main(String[] args) {
       //relational operator(Compare two value)
       // >,< , >= <=, != , !, ==  -> it gives output true or false
       int a=10;
       int b=30;
       boolean c=a>b;
       System.out.println(c);

       int age_shivani =34;
       int age_aman=34;
       //boolean result = age_aman > age_shivani; // false
        boolean result = age_aman >= age_shivani; // false // now we have two condition  age_aman >age_shivani or(gate)  age_aman = age_shivani;
        System.out.println(result);
    }
}
