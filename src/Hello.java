import java.util.Scanner;

public class Hello {
     static void myMethod(){
        System.out.println("Hi mom!");
    }
    static void userInputs(){
        System.out.println("whats your Registration number??");
         Scanner scanner = new Scanner(System.in);
         int regNum = scanner.nextInt();
        System.out.println("Registered:"+regNum);
    }
    static void operation(){
         //casting the datatypes
         int num = 10;
         double result = (double) num / 3;
        System.out.println(result);
    }
}
