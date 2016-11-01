package Module2;

/**
 * Created by Owner on 11/1/2016.
 */
public class MinMaxArray {
  public static void main(String[] args) {


        int [] loc = {25, 11, 25, 50, 9, 89, 7, 8, 99,67};
        int max = loc[0];
        int min = loc[0];
        for(int i = 0; i != loc.length; i ++){
          if(loc[i] > max){
            max = loc[i];
          }
          if(loc[i] < min){
            min = loc[i];
          }
        }
        System.out.println(min + " " + max);
      }
    }



