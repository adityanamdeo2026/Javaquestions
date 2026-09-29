import java.util.Scanner;
public class SequenceOfNoandSum {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if(m<=0 || n<=0)
            {
                break;
            }
            int start , end;
            if(m<n)
            {
                start = m;
                end = n;
            }else
            {     start = n;
                  end = m;
            }
            int sum=0;
            for(int i= start;i<=end;i++)
            {
                System.out.print(i + " ");
                sum = sum +i;
            }
            System.out.println("sum ="+sum);
        }
    }
}