package Module2;

/**
 * Created by Owner on 11/1/2016.
 */
public class SecondLargest {
  public static void main(String args[]) {
    int[] array = {4, -2, -5, 10, 55, 77, 54, 69, 7, 90};
    int largest = array[0];
    int secondLargest = array[0];
    for (int number : array)
      if (number > largest) {
        secondLargest = largest;
        largest = number;
      } else if (number > secondLargest)
        secondLargest = number;
    System.out.println("Second largest: " + secondLargest);
  }
}