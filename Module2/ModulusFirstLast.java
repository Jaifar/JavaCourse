package Module2;

/**
 * Created by Owner on 11/1/2016.
 */
public class ModulusFirstLast {
  public static void main(String args[]) {
    int[] array = {4, -2, -5, 10, 55, 77, 54, 69, 7, 90};
    int first = array[0];
    int last = array[array.length - 1];
    System.out.println("First: " + Math.abs(first));
    System.out.println("Last: " + Math.abs(last));
  }
}