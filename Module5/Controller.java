package Module5;

/**
 * Created by Owner on 2/28/2017.
 */
public class Controller {

//    Также у Controller есть 2 метода:
//    Room[] requstRooms(int price, int persons, String city, String hotel)
//    ищет все номера с запрашиваемыми параметрами.
//
//    Все методы используют доступные методы API для поиска.
//    Найденные номера формируют новую DB.
//
//            Room[] check(API api1, API api2)
//
//    Проверить, сколько одинаковых номеров возвращают две разные API.

    //    Создайте класс Controller, в котором есть глобальная переменная API apis[] = new API[3],
// которая содержит все реализации интерфейса API.
    public static API apis[] = {new BookingComAPI(), new GoogleAPI(), new TripAdvisorAPI()};

    Room[] requestRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }

    public Room[] check(API api1, API api2) {
        return new Room[0];

    }
}
