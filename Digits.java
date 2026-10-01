import java.util.Scanner;
public class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i<t;i++)
        {
            int x = sc.nextInt();
            if (x == 0) {
                System.out.println(0);
                continue;
            }
            while (x>0) {
                int digit = x % 10;
                x = x / 10;
                System.out.print(digit + " ");
            }
            System.out.println();
        }
    }
}