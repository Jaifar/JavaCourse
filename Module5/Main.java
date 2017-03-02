package Module5;

/**
 * Created by Owner on 2/28/2017.
 */
public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        controller.requestRooms(34, 12, "London", "Star");
        controller.requestRooms(34, 45, "Paris", "U");
        controller.requestRooms(3, 4, "Dublin", "U");
        controller.check(Controller.apis[0],Controller.apis[1]);
        controller.check(Controller.apis[2],Controller.apis[3]);
        controller.check(Controller.apis[4],Controller.apis[6]);
     
//    В методе класса Main создайте Controller и сделайте 3 запроса с разными параметрами, чтобы найти номера.
//    Также проверьте все методы 3 раза с разными API, чтобы продемонстрировать, как работает программа.


}}
