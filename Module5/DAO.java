package Module5;

/**
 * Created by Owner on 2/28/2017.
 */
public interface DAO {
    Room save(Room room);

    boolean delete(Room room);

    Room update(Room room);

    Room findById(long id);

    Room[] getAll(); // public abstract Room[] getAll();


//    Add method to DAO interface it and implement
//            Room[] getAll() - return array of all rooms that are in our DB array
//    save - adds room to arra
//    delete - deletes rooms from array
//    update - updates room in array (find room to update by id)
//    find by id - find room in array

}
