import java.util.Scanner;

public class great_of_three{


    
public static void main(String args[])
{
    Scanner sc  = new Scanner(System.in);

    System.out.println("please enter num 1");
    int num1 = sc.nextInt();

    System.out.println("please enter num 2");
    int num2 = sc.nextInt();

    System.out.println("please enter num 3");
    int num3 = sc.nextInt();

    if (num1 > num2 && num1 > num3 ){

        System.out.println("Number 1 is greater value is: "+ num1);
    }

    else if ( num2 > num1 && num2 > num3){
        System.out.println("Number 2 is greater: value is " + num2);

    }
    else {
        System.out.println("Number 3 is greater and value is " + num3);

    }

}
}