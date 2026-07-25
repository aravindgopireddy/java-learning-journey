import java.util.Scanner;

public class TwoNumEq{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

      System.out.print("Enter first number  : ");
      int a = sc.nextInt();

      System.out.print("Enter second number : ");
      int b = sc.nextInt();

      String result = (a==b)? "Both are equal" : "Both are not equal";

      System.out.println(result);

      sc.close();
    }
}
