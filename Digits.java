import java.util.Scanner;
public class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i<n;i++)
        {
            int x = sc.nextInt();

            if (x == 0) {
                System.out.println(0);
                continue;
            }
            while (x > 0) {
                int digit = x % 10;
                System.out.print(digit + " ");
                x = x / 10;
            }
            System.out.println();
        }
    }
}