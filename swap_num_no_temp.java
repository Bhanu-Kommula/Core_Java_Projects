public class swap_num_no_temp {
    public static void main(String args[]){

            int a = 6;
            int  b = 9;

            System.out.println("Value of a is: "+a + "\nvalue of b is: " +b );

            a = a+b;
            b = a- b;
            a = a-b;

            System.out.println("Swap_Value of a is: "+a + "\nSwap_value of b is: " +b );



    }
}
