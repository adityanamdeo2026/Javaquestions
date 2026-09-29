import java.util.Scanner;
public class TwoNo{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double result = a/b;
        System.out.println("floor" + (long)a + " / " + (long)b + " = " + (long)Math.floor(result));
        System.out.println("ceil" + (long)a + " / " + (long)b + " = " + (long)Math.ceil(result));
        System.out.println("round" + (long)a + " / " + (long)b + " = " + (long)Math.round(result));
    }
}
