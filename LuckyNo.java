import java.util.Scanner;
public class LuckyNo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean found = false;
        for(int i=a;i<=b;i++)
        {
            int num =i;
            boolean lucky = true;
            while(num>0){
                int digit = num%10;
                if(digit!=4 && digit!=7)
                {
                    lucky = false;
                    break;
                }
                num = num/10;
            }
            if (lucky)
            {
                System.out.print(i+" ");
                found =true;
            }
        }
    if(!found)  {
        System.out.println(-1);
      }
    }
}