package module6;

/**
 * Created by Owner on 11/1/2016.
 */
  public class SumOfArray{
    public static void main(String args[]){
      int[] array = {2,3,4,5,7,8,9,9,8,10};
      int sum = 0;
      // цикл для обхода каждого элемента массива
      for( int num : array) {
        // суммирование каждого элемента массива
        sum = sum + num;
      }
      System.out.println("Сумма элементов массива равна: " + sum);
    }
  }
