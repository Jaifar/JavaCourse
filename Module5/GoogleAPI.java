package Module5;

/**
 * Created by Owner on 2/28/2017.
 */
public class GoogleAPI implements API {
    //ссылка на массив
    public static Room[] rooms;

    public GoogleAPI() {
        // create massive and fill up with values
        rooms = new Room[]{
                new Room(12, 234, 100, null, "Star", "London"),
                new Room(16, 1222, 2, null, "Star", "London"),
                new Room(18, 1282, 2, null, "Star", "London"),
                new Room(19, 8, 2, null, "Star", "London"),
                new Room(11, 122, 2, null, "Star", "London")
        };
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }
}
