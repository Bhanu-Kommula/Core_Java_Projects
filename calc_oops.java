import java.util.Scanner;

class Calc{

    public void add(int a, int b){

        System.out.println("Results " + (a + b)); 
    }
    public void sub(int a, int b){

        System.out.println("Results " + (a - b)); 
    }
    public void mul(int a, int b){

        System.out.println( "Results " + (a * b)); 
    }
    public void div(int a, int b){
        try {
        System.out.println("Results " + ( a / b));
        }

        catch ( Exception e){
            System.out.println("Please enter other number otherthan Zero(0)" + e);

        }
    }


}



public class calc_oops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       while (true) {
        
        System.out.println("Enter your 1st number or 000 to exit" );
        int num1 = sc.nextInt();
        if( num1 == 000){
            System.out.println("exiting calc");
            break;
        }

        System.out.println("Enter your 2nd number");

        int num2 = sc.nextInt();
        System.out.println("Enter your operation + - * /");

        String operator = sc.next();

        Calc obj = new Calc();

        switch (operator) {
            case "+":
                obj.add(num1, num2);
                break;
            case "-":
                obj.sub(num1, num2);
                break;
            case "*":
                obj.mul(num1, num2);
                break;
            case "/":
                obj.div(num1, num2);
                break;
            default:
                System.out.println("Select a valid operator");
                break;
        }
    

    }    
        sc.close();

}
}