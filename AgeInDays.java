import java.util.Scanner;
public class AgeInDays{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int year = days/365;
        days = days%365;
        int months = days/30;
        days = days%30;
        System.out.println(year + "years");
        System.out.println(months + "months");
        System.out.println(days + "days");
    }
}