package ooplearning;

public class methods1 {

    //Global Variables
    static String section="A";
    static int num  = 100;

    //main method
    public static void main(String[] args) {

        //local variable
        String name = "Jhonny";

       saySection();
       sayNumber();

    }
    
    static void saySection(){
        System.out.println(section);
    }
    static void sayNumber(){
        System.out.println(num);
    }

}
