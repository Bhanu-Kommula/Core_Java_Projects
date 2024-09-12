import java.util.Scanner;



public class com_interest {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the principal amount");
        double amount = sc.nextDouble();
        System.out.println("Enter the time in years");
        int time = sc.nextInt();
        System.out.println("Enter the interest rate");
        double interest_rate = sc.nextDouble();

        System.out.println("Your compound interest is: " + amount * Math.pow((1+ interest_rate/100),(time)));


    }
}
