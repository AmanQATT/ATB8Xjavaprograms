package sept.ex_20092024_Ternary_operator;

public class Lab073_Elseif {
    public static void main(String[] args) {
      int num1=30;
      int num2=30;
      if(num1>num2){
          System.out.println(num1);
      }else if(num2> num1){
          System.out.println(num2);
      }else{
          System.out.println("Equal");
      }
    }
}
