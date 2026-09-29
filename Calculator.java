import java.util.Scanner;
import java.util.stream.StreamSupport;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int index = -1;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch =='+' || ch =='-' || ch =='*' || ch =='/')
            {
                index = i;
                break;
            }
        }
        long a = Long.parseLong(s.substring(0,index));
        long b = Long.parseLong(s.substring(index+1));
        char op = s.charAt(index);
        if (op =='+')
        {
            System.out.println(a+b);
        } else if(op =='-'){
            System.out.println(a-b);
        } else if(op =='*'){
            System.out.println(a*b);
        }
        else {
            System.out.println(a / b);
        }
    }
}