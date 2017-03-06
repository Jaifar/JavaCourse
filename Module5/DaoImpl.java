package Module5;

/**
 * Created by Owner on 2/28/2017.
 */
public class DaoImpl implements DAO {
    Room rooms[] = new Room[10];

    // DAOImpl.save(new Room(id, price, city, country))
    @Override
    public Room save(Room room) {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] == null)
                rooms[i] = room;
            break;


        }

        System.out.println("save " + room);
        return room;
    }

    @Override
    public boolean delete(Room room) {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].equals(room)) {
                rooms[i] = null;
                break;
            }

        }

        System.out.println("delete " + room);
        return true;
    }

    @Override
    public Room update(Room room) {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].getId() == room.getId()) {
                rooms[i] = room;
                break;
            }

        }
        System.out.println("update " + room);
        return room;
    }

    @Override
    public Room findById(long id) {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].getId() == id) {
                return rooms[i];

            }

        }

        System.out.println("find " + id);
        return null;
    }
//    save - adds room to arra
//    delete - deletes rooms from array
//    update - updates room in array (find room to update by id)
//    find by id - find room in array

//    по условию все методы в DaoImpl должны выводить название операции и объекта, над которым она произведена и возвращать сам объект, например save надо написать так
//
//    @Override
//    public Room save(Room room) {
//        System.out.println("save " + room);
//        return room;
//    }
}
