package Module5;

/**
 * Created by Owner on 2/28/2017.
 */
public interface DAO {
    Room save(Room room);

    boolean delete(Room room);

    Room update(Room room);

    Room findById(long id);
}
