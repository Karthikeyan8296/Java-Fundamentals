import java.util.Scanner;

public class Looping_Statement {
    static void WhileLoop(){

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        int i = 0;
        while (i<=100){
            System.out.println(name+"you"+i);
            i++;
        }
    }

    static void ForLooping(){
        for(int i=0; i<= 10; i++){
            System.out.println("Hello Im For Loop "+i);
        }
    }

    //Rows and Columns
    static void NestedLoops(){
        Scanner scanner = new Scanner(System.in);
        int rows;   //Outer loop will be for row
        int col;    //Inner loop will be for Column
        String symbol="";

        System.out.println("Enter # of rows: ");
        rows = scanner.nextInt();
        System.out.println("Enter # of col: ");
        col = scanner.nextInt();
        System.out.println("Enter symbol to use: ");
        symbol = scanner.next();

        for(int i=1; i<=rows; i++){
            System.out.println();
            for(int j=1; j<=col; j++){
                System.out.print(symbol+" ");
            }
        }
    }
}
