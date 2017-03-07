package module6;

/**
 * Created by Owner on 11/1/2016.
 */
public class ModulusFirstLast {
    public static void main(String args[]) {
        int[] array = {4, -2, -5, 10, 55, 77, 54, 69, 7, 90};
        System.out.println("First: " + ArraysUtils.modulusFirst(array));
        System.out.println("Last: " + ArraysUtils.modulusLast(array));
    }
}