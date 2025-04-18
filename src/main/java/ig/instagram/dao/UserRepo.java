package ig.instagram.dao;

import ig.instagram.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepo extends CrudRepository<User,Integer> {

    public List<User> findAll();

    public User save(User user);



}
