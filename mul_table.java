import java.util.Scanner;

public class mul_table {
    public static void  main(String args[])
    {
        System.out.print("please enter the table num");
        
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();

        for(int i =1; i<=10; i++)
        {
            System.out.println( num + " x " + i + " = " + num*i);

        }



    }
}
