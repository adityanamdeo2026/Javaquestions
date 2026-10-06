import java.util.Scanner;
public class SomeSum {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int answer = 0;
        for (int i = 1; i<=n; i++)
        {
            int num = i;
            int digitsum= 0;
            while(num>0)
            {
                int digit = num%10;
                digitsum = digitsum+ digit;
                num = num/10;

            }
            if(digitsum>=a && digitsum<=b)
            {
                answer = answer + i;
            }
        }
        System.out.println(answer);
    }
}