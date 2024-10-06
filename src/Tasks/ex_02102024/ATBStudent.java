package Tasks.ex_02102024;

public class ATBStudent {
    //(3)Create a Class  ATBStudent and 5 Objects - (A/B) - github.com
        int roll_no=10, age=15;
        String firstname="Amit";
        String lastname="Roy";
        String std="7th";
        String Email="amitroy@gmail.com";
        String address ="Wagholi";

        public void display_roll_no()
        {
            System.out.println("Student Information");
            System.out.println("==========================================");
            System.out.println("Student Roll Number: "+roll_no);
        }
        public void display_name()
        {
            System.out.println("Student_Name: "+firstname+" " +lastname);
        }
        public void display_address()
        {
            System.out.println("Student_Adress: "+address);
        }
        public void display_age()
        {
            System.out.println("Student_Age : "+age);
        }
        public void display_email()
        {
            System.out.println("Student_Email : "+Email);
        }
        public static void main (String [] args)
        {

            //object 1
            ATBStudent get_roll_no = new ATBStudent();
            get_roll_no.display_roll_no();

            //object 2
            ATBStudent get_name = new ATBStudent();
            get_name.display_name();

            //object 3
            ATBStudent get_address = new ATBStudent();
            get_address.display_address();

            //object 4
            ATBStudent get_age = new ATBStudent();
            get_age.display_age();

            //object 5
            ATBStudent get_email = new ATBStudent();
            get_email.display_email();
        }
    }


