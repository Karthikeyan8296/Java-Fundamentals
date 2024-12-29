import java.util.Random;

public class Math_operation {
    static void operations(){
        int x = 10;
        double y = 28.3;

        //max, min, abs(absolute), sqrt, round, ceil, floor, pow
        double z = Math.floor(y);
        System.out.println(z);
    }

    static void randomNumber(){
        Random random = new Random();
        int x = random.nextInt(6)+1;
        System.out.println(x);
    }
}
