public class LargestOfThree {
    public static void main(String[] args){

    int a=4;
    int b=2;
    int c=3;

    int largest = (a>b)?a:b;
    int lar = (largest>c)?largest:c;

    System.out.println(lar);
    }
}
