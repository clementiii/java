package methods;

public class methods {

        //Global Variable = outside the main method and methods / can be accessed everywhere
        static String strGlobal = "This is a Global String";
        static int num = 100;

        //this is the main method
        public static void main(String[] args) {
        //Local Variable = can only be accessed inside methods
        String strLocal = "This is a local String";

        sayHello();
        //local variable
        System.out.println(strLocal);
        //global variable
        sayGlobal();

        //you can concatinate in the string "Clement" with other variables and shiz
        say("Clement");

        // you call the method and declare the intigers
        add( 12, 34);

        //return method
        int sum = addition(5, 3);
        System.out.println(sum);

        //return boolean
        System.out.println(isLegalAge(19) + " You are of legal age");

        //return overloading 
        System.out.println(additions(5, 5 ));
        System.out.println(additions(5, 5, 5));
        System.out.println(additions(5.5, 5.6));
        System.out.println(additions(6.5, 7.3, 2.2));

        } 

        //METHODS
        // you can call other methods inside methods
        //modifier returntype method(){}
        static void sayHello(){
            System.out.println("HELLO");
        }

        //from global variable
        static void sayGlobal(){
            System.out.println(strGlobal);
            System.out.println("im " + num + " in mathematics!");
        }

        //method w/ arguments /string
        static void say(String word){
            //this prints clement since it should be labeled in the main method
            System.out.println(word);
        }

        //method w/ argumnets / int
        static void add(int num1, int num2){
            System.out.println(num1 + num2);
        }

        //return keyword
        //return types :
        /* void returns nothing
         * int returns integers
         * String returns strings
         * and so on
         */

         //methods w/ return 
         //can be stored inside variables
         /* modifiers returntype methodName (arguments){

            //Do anything Here
            return value;

         } */

         //example 1 
         static int addition(int number1, int number2){

            return number1+number2;

         }
         
         //example 2 boolean 
         static boolean isLegalAge(int age){

            if(age >= 18) return true;
            else return false;
         }

         //overloading methods
         //can use the same method name but different parameters
         static int additions(int numbers1, int numbers2){
            return numbers1+numbers2;
         }

         static int additions(int numbers1, int numbers2, int numbers3){
            return numbers1+numbers2+numbers3;
         }
         static double additions(double numbers1, double numbers2){
            return numbers1+numbers2;
         }
         static double additions(double numbers1, double numbers2, double numbers3){
            return numbers1+numbers2+numbers3;
         }


}
