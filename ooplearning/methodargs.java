  //modiefier returntype methodName(arguments)}{  do anything here }
package ooplearning;

public class methodargs {
    public static void main(String[] args) {
        print("Hello World"); 
        print("sup");
        add(1,2);
        greet("jonas" , 12);
    }
    static void add(int num1, int num2){
        System.out.println(num1 + num2);
    }

    static void print(String word){
        System.out.println(word);
    }
    static void greet(String name ,int age){
        
        System.out.println("Hello "+name);
        System.out.println("You are " + age + " years old !");
    }
}
