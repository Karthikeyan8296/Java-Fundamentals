import java.util.Arrays;

public class Generals {
    static void Switch(){
        String month = "June";

        switch (month){
            case "Jan":
                System.out.println("it is Jan");
                break;
            case "feb":
                System.out.println("it is Feb");
                break;
            case "June":
                System.out.println("it is June, Yes!!");
                break;
            case "May":
                System.out.println("it is May");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
    static void Array(){
        //Arrays in Java
        int[] primeNum = {2, 3, 5, 7};
        System.out.println(primeNum[0]);

        int[] ages ={30, 40, 50};
        System.out.println(Arrays.toString(ages));

        //To print all the array elements
        String[] cars = {"BMW", "RC", "AUDI"};
        for (String i : cars){
            System.out.print(i+" ");
        }
        System.out.println();

        //we can assign and then later we can write an array
        String[] bikes = new  String[3];
        bikes[0] = "RE";
        bikes[1] = "Mt";
        bikes[2] = "KTM";

        for(int i=0; i<bikes.length; i++){
            System.out.print(bikes[i]);
        }
        System.out.println();

        for(String j : bikes){
            System.out.print(j);
        }
    }
    static void Array2D(){
        System.out.println();
        //2D array is also known as multi Dimensional Array
        String[][] cars = new String[3][3];

        //this is row 0 and col 0
        cars[0][0] = "Camera";
        cars[0][1] = "BMW";
        cars[0][2] = "Pika";
        cars[1][0] = "Manga";
        cars[1][1] = "Anney";
        cars[1][2] = "Jack";
        cars[2][0] = "Mario";
        cars[2][1] = "bot";
        cars[2][2] = "AK";

        //we can also import the elements to our to 2d array like this
        String[][] bikes = {
                {"Camera", "BMW", "Pika"},
                {"Manga", "Anney", "Jack"},
                {"Camera", "BMW", "Pika"}
        };

        //Outed for loop for rows, and Inner for loop for columns
        for(int i=0; i<cars.length; i++){
            System.out.println();
            for (int j=0; j<cars[i].length; j++){
                System.out.print(cars[i][j]+" ");
            }
        }
    }

    static void StringMethod(){

    }

}
