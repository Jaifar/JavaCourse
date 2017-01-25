package Module3.Arithmetic;

/**
 * Created by Owner on 1/12/2017.
 */
public class Adder extends Arithmetic {
  // Напишите класс Adder, который наследуется от класса Arithmetic.
  // У класса Adder должен быть метод check, который сравнивает 2 номера и возвращает true, если а>=b и false в других случаях.
  boolean check(Integer a, Integer b){
    if (a<=b)
      return true;
      else
        return false;
  }

}
