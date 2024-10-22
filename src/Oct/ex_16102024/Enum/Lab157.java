package Oct.ex_16102024.Enum;

public class Lab157 {
    public static void main(String[] args) {
        System.out.println(Color.RED.getHexcode());
        System.out.println(Color.GREEN.getHexcode());

        if(Color.GREEN.getHexcode() == "#61FF33"){
            System.out.println("color is green");
        }
    }

}

enum Color{
    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF");

     String hexcode;

   // constructor
   Color(String hexcode) {
        this.hexcode = hexcode;
    }
    // getter
    String getHexcode(){
      return this.hexcode;
    }
}
