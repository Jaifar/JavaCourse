package module6;

/**
 * Created by Owner on 3/7/2017.
 */
public final class ArraysUtils {
    public final static int sum(int array[]) {
        int sum = 0;
        // цикл для обхода каждого элемента массива
        for (int num : array) {
            // суммирование каждого элемента массива
            sum = sum + num;

        }
        return sum;

    }

    public final static int min(int array[]) {

        int min = array[0];
        for (int i = 0; i != array.length; i++) {

            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }


    public final static int max(int array[]) {
        int max = array[0];
        for (int i = 0; i != array.length; i++) {

            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }


    public final static int maxPositive(int array[]) {
        int max = 0;
        for (int number : array)
            if (number > 0 && max < number)
                max = number;
        return max;
    }


    public final static int modulusFirst(int array[]) {
        return Math.abs(array[0]);


    }

    public final static int modulusLast(int array[]) {
        return Math.abs(array[array.length - 1]);


    }

    public final static int secondLargest(int array[]) {
        int largest = array[0];
        int secondLargest = array[0];
        for (int number : array)
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest)
                secondLargest = number;
        return secondLargest;
    }

    public final int[] reverse(int[] array) {// разворачивает массив
        int[] array1 = new int[array.length]; // создаем новый массив,
        // в котором столько же элементов, как и в том, что подали на вход
        for (int i = 0; i < array1.length; i++) {
            array1[array1.length - i - 1] = array[i];// array = 1 2 3, array1 = 3 2 1 "перевернули массив"

        }
        return array1;

    }

    public final int[] findEvenElements(int[] array) { //подсчет четных элементов
        int count = 0; //считает четные числа
        //пройтись по входному массиву
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                count++;
        }
        int[] array2 = new int[count];
        // копируем посчитанные четные числа с входного массива array и перемещаем в array2
        int n = 0; // номер ячейки, куда перемесчаем подсчитанные четные числа
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array2[n] = array[i];
                n++;
            }
        }
        return array2;
    }


    public final static int multiplication(int array[]) {//умножение каждого элемента на число
        int product = 0;
        for (int i = 0; i < array.length; i++) {

            for (int number : array)
                product *= number;
            product++;
        }
        return product;
    }

}

