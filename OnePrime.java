import java.util.Scanner;
public class OnePrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean prime = true;
        if(n<2)
        {
            System.out.println("NO");
        }
        else {
            for(int i =2;i<n;i++){
                if(n%i==0){
                    prime = false;
                    break;

                }
            }
        }
        if(prime){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}