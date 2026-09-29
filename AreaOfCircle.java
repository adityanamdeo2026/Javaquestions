import java.util.Scanner;
public class AreaOfCircle{
    static final double PI = 3.141592653;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double R = sc.nextDouble();
        double area = PI * R * R;
        System.out.println(area);
    }
}