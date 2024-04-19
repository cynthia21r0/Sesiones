//Cynthia Janeth Granados Estrada
//GDS0624

package mx.utng.s25.model.dao;

import java.util.List;
import mx.utng.s25.model.entity.User;

public interface IUserDao {
    List<User>list();

    void save(User user);

    User getById(Long id);

    void delete(Long id);
}
