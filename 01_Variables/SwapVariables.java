public class SwapVariables {
    public static void main(String[] args){
        int a=2;
        int b=3;
        int c;
        System.out.println("Before Swapping : a="+a+",b="+b);
        c=a;
        a=b;
        b=c;
        System.out.println("After Swapping  : a="+a+",b="+b);
    }
}
