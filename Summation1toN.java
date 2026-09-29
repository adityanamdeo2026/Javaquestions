import java.util.Scanner;
public class Summation1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long sum = a * (a + 1) / 2;
        System.out.println(sum);
    }
}
