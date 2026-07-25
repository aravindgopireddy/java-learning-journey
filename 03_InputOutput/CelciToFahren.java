import java.util.Scanner;

public class CelciToFahren {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
 
    System.out.print("Enter temperature in celcius : ");  
    float a = sc.nextFloat();

    System.out.println("Temperature in fahrenheit  : "+(a*9/5+32));
    sc.close();
    }
}
