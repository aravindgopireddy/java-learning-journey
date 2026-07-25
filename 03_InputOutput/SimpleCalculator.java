import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first number  : ");
        int a = sc.nextInt();

        System.out.println("Enter your second number : ");
        int b = sc.nextInt();

        System.out.println("The addition is : "+(a+b));
        System.out.println("The subtraction is : "+(a-b));
        System.out.println("The multiplicationtion is : "+(a*b));
        System.out.println("The quocient is : "+(a/b));
        System.out.println("The remainder is : "+(a%b));

        sc.close();
    }
}
