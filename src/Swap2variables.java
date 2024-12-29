public class Swap2variables {
    static void Swapping(){
        String x = "Water";
        String y = "Acid";
        String temp;

        temp = x;
        x=y;
        y=temp;
        
        System.out.println("x is "+x);
        System.out.println("y is "+y);
    }
}
