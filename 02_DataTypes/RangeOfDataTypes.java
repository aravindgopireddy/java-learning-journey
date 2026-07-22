//import java.util.*;

public class RangeOfDataTypes{
public static void main(String[] args){
     System.out.println("Primitive Data Types in Java");
     
// you can find size by giving .SIZE
// you can find minimum value of datatype by using .MIN_VALUE
// you can find maximum value of datatype by using .MAX_VALUE

        System.out.println("Byte:");
        System.out.println("Size: " + Byte.SIZE + " bits");
        System.out.println("Minimum Value: " + Byte.MIN_VALUE);
        System.out.println("Maximum Value: " + Byte.MAX_VALUE);

        System.out.println("\nShort:");
        System.out.println("Size: " + Short.SIZE + " bits");
        System.out.println("Minimum Value: " + Short.MIN_VALUE);
        System.out.println("Maximum Value: " + Short.MAX_VALUE);

        System.out.println("\nInteger:");
        System.out.println("Size: " + Integer.SIZE + " bits");
        System.out.println("Minimum Value: " + Integer.MIN_VALUE);
        System.out.println("Maximum Value: " + Integer.MAX_VALUE);

        System.out.println("\nLong:");
        System.out.println("Size: " + Long.SIZE + " bits");
        System.out.println("Minimum Value: " + Long.MIN_VALUE);
        System.out.println("Maximum Value: " + Long.MAX_VALUE);

        System.out.println("\nFloat:");
        System.out.println("Size: " + Float.SIZE + " bits");
        System.out.println("Minimum Value: " + Float.MIN_VALUE);
        System.out.println("Maximum Value: " + Float.MAX_VALUE);

        System.out.println("\nDouble:");
        System.out.println("Size: " + Double.SIZE + " bits");
        System.out.println("Minimum Value: " + Double.MIN_VALUE);
        System.out.println("Maximum Value: " + Double.MAX_VALUE);

        System.out.println("\nCharacter:");
        System.out.println("Size: " + Character.SIZE + " bits");
        System.out.println("Minimum Value: " + (int)Character.MIN_VALUE);
        System.out.println("Maximum Value: " + (int)Character.MAX_VALUE);

        System.out.println("\nBoolean:");
        System.out.println("Values: " + Boolean.TRUE + " and " + Boolean.FALSE);
}
}