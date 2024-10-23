package Oct.ex_18102024_Strings;

public class Lab163_StringBuilder_StringBuffer {
    public static void main(String[] args) {

     //   String name="Pramod";
     //   name ="Armod";
        // it will create 2 string.


        // final class StringBuffer
       StringBuffer stringBuffer = new StringBuffer("Pramod");
        StringBuffer stringBuffer1 = new StringBuffer("Dutta");
        // Append to StringBuffer
       stringBuffer.append("Dutta");
        stringBuffer1.append("Pramod");
        System.out.println(stringBuffer); // PramodDutta
        System.out.println(stringBuffer1); // DuttaPramod
        // StringBuffer and StringBuilder will create only one string

        // c1,c2 -> Toy
        // C1 - Toy 2hour -> C2 Toy 2hour -> synchronized -> Thread-safety -> slow process.


        // Approximately same StringBuilder and StringBuffer
        StringBuilder sb = new StringBuilder("Hello");
         // Append to StringBuilder
        sb.append("World");
        System.out.println(sb); // HelloWorld

        // Inserting into StringBuilder
        sb.insert(5,",");
        System.out.println(sb); // Hello,World

        //Deleting from StringBuilder
        sb.delete(5,6);
        System.out.println(sb); //HelloWorld

        //Reversing StringBuilder
        sb.reverse();
        System.out.println(sb); // dlroWolleH

    }
}
