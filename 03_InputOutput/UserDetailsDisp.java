import java.util.Scanner;

public class UserDetailsDisp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

    System.out.println("Enter your name : ");
     String name=sc.next();

     System.out.println("Enter you rollno : ");
     int roll=sc.nextInt();

     System.out.println("Enter your section : ");
     char sec=sc.next().charAt(0);

     System.out.println("    ----Your Details----");
     System.out.println("\nYour Name  : "+name);
     System.out.println("Your RollNo. : "+roll);
     System.out.println("Your Section : "+sec);

     sc.close();
    }
}
