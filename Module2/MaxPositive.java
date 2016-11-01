package Module2;

/**
 * Created by Owner on 11/1/2016.
 */
public class MaxPositive {
  public static void main(String args[]){
  int [] array = {4,-2,-5,10,55,77,54,69,7,90};
  int max = 0;
for(int number : array)
          if(number>0 && max<number)
  max = number;
System.out.println(max);
}}
