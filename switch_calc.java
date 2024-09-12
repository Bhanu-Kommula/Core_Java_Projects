import java.util.Scanner;

public class switch_calc{


    public static void main(String args[]){

            Scanner sc = new Scanner(System.in);

            System.out.println("enter num 1");
            int num1 = sc.nextInt();

            System.out.println("enter num 2");
            int num2 = sc.nextInt();

            System.out.println("enter operation you want to perform (+ , - , * , / )");
            String op = sc.next();


            switch (op) {
                case "+" :
                System.out.println("output is " + (num1 + num2));
                    
                    break;
                            
            case "-" :
                    System.out.println("output is " + (num1 - num2));
                        
                        break;
            case "*" :
                System.out.println("output is " + (num1 * num2));
                
                    break;
            case "/" :
            if (num2 != 0) {
                System.out.println("Output is: " + (num1 / num2));
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }                        
                        break;

                default:
                System.out.println("Invalid operation ");
                    
                    break;
            }




    }





}