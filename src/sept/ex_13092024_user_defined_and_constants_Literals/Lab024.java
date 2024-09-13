package sept.ex_13092024_user_defined_and_constants_Literals;

public class Lab024 {
    public static void main(String[] args) {
        //Literals
        //boolean
        //integral

        //char Literals
        //single char
        char c1 = 'A';
        char c2 = 'B';
        char C3 = '@';

        // Escape char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char car_r = '\r';

        System.out.println("Pramod"+ new_line + "Dutta");
        //System.out.println("Pramod"+ '\n' + "Dutta"); same as upper line
        System.out.println("Pramod"+ tab_line + "Dutta");
        System.out.println("Pramod"+ back_space + "Dutta");
        System.out.println("Pramod"+ car_r  + "Dutta");

        //char c11 = 'A'; //65 - ASCII
        char c11 = '\u1F60'; // ASCII
        //chinese , indian , japanese ---> unicode
        // /u09878 -> unicode value

        System.out.println(c11); //  its smiley but intelliJ show some random character

    }
}
