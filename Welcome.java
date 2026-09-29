import java.util.Scanner;
public class Welcome{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        if(a>=b)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}