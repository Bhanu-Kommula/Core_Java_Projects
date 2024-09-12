import java.util.Scanner;


public class infinte_loop {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        
       while (true){ 
        
        System.out.println("Enter a number or enter 999 to exit");
        int num = sc.nextInt();

        if(num == 999){

            System.out.println("Exiting program");
        }


        
        if (num > 0){
            System.out.println(" The number " + num + " is Positive");
        }
        else if (num < 0){
            System.out.println(" The number " + num + " is Negative");

        }
        else
        {
            System.out.println(" The number " + num + " is Zero");

        }
    }
}}
