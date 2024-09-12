import java.util.Scanner;

class circle{

        public double area (int a){

            return Math.PI * (a * a);

        }


}


public class Area {
    public static void main(String args[]){

            Scanner  sc = new Scanner(System.in);

            System.out.println("Please enter raduis of the circle");
            int radius = sc.nextInt();
                circle cir = new circle();
                double result = cir.area(radius);
                System.out.println("Area of circle is:" + result);

                System.out.println("Please enter lenght of the recantgle");
                int len = sc.nextInt();

                System.out.println("Please enter width of the recantgle");
                int width = sc.nextInt();

                System.out.println("area of rectangle is:" + len * width);



sc.close();
    }
}

