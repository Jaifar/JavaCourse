package module6;

/**
 * Created by Owner on 11/1/2016.
 */
public class Multiplication {
    public static void main(String args[]) {
        int[] array = {4, -2, -5, 10, 55, 77, 54, 69, 7, 90};
        int product = 1;
        for (int number : array)
            product *= number;
        System.out.println("Multiplication: " + product);
    }
}
