import java.util.Scanner;
public class MaxMin{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = Math.max(a, Math.max(b,c));
        int min = Math.min(b, Math.min(a,c));

        System.out.println(min + " " + max);
    }
}