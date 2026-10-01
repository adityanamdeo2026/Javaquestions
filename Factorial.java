import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i =0;i<t;i++) {
            int n = sc.nextInt();
            long fact = 1;
            for(int j =1;j<=n;j++ ) {
                fact = fact * j
                ;
            }
             System.out.println(fact);
        }
    }
}