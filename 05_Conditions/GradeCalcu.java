import java.util.Scanner;

public class GradeCalcu {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter your marks : ");
       int a = sc.nextInt();

      if(101>a && a>89){
        System.out.println("Grade A");
      }else if(91>a && a>79){
        System.out.println("Grade B");
      }else if(81>a && a>69){
        System.out.println("Grade C");
      }else if(71>a && a>59){
        System.out.println("Grade D");
      }else if(61>a && a>49){
        System.out.println("Grade E");
      }else if(51>a && a>0){
        System.out.println("FAIL");
      }else{
        System.out.println("ERROR");
      }

      sc.close();
    }
}
