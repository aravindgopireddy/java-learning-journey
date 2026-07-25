import java.util.Scanner;

public class GreatBetTwoNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number  : ");
        int a = sc.nextInt();

        System.out.print("Enter second number : ");
        int b = sc.nextInt();

        String result = (a>b)?"First number is greater" :
        "Second number is greater";

        System.out.println(result);

        sc.close();

    }
}
