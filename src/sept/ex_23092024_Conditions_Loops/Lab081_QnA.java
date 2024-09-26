package sept.ex_23092024_Conditions_Loops;

public class Lab081_QnA {
    public static void main(String[] args) {
        //it is valid syntax
        char ch = 'A';//65
        switch(ch) {
            //yes it is valid
        }

        //it is valid syntax
         //   boolean b=true;
        //    switch(b) {
         //   }
            //invalid : because boolean will not use in switch expression.


        //it is valid syntax
        long a11=30l;
        switch((int)a11){
            // valid: but long will not direct used(it will use with int wrapper type)
            // long convert in int then use.
        }
    }
}
