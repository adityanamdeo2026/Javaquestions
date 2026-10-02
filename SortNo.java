import java.util.Scanner;
public class SortNo{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int x = a;
        int y = b;
        int z = c;
        if(x>y) {
            int temp = x;
            x = y;
            y = temp;
        }if(x>z) {
            int temp = z;
            x = z;
            y = temp;
        }if(y>z) {
           int temp = y;
        y = z;
        z = temp;
        }
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
