import java.util.Scanner;

public class AreaOfCircle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Radius : ");
        float a = sc.nextFloat();

        System.out.println("Area of circle : "+(3.14159*a*a));

        sc.close();
    }
}