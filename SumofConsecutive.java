import java.util.Scanner;
public class SumofConsecutive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int start;
            int end;
            if (x < y) {
                start = x;
                end = y;
            } else {
                start = y;
                end = x;
            }
            int sum = 0;
            for (int j = start + 1; j < end; j++) {
                if (j % 2 != 0) {
                    sum = sum + j;
                }
            }
            System.out.println();
        }
    }
}
