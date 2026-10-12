import java.util.Scanner;
public class Replacement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        for (int i =0;i<n;i++)
        {
            int num = sc.nextInt();
            if (num > 0) {
                System.out.print("1");
            }else if (num<0) {
                System.out.print("2");
            }else {
                System.out.print("0");
            }
            if(i <n -1)
            {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
