package sept.ex_25092024_Loops;

public class Lab107_continue {
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) { // 0 to 9
            System.out.println(i);
            if(i == 5){
                continue; // when i=5 then it will skip the next lines and go to start.
            }
            System.out.println("After");
            
        }
    }
}
