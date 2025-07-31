package repository;

import model.User;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private final Map<Long, User> database = new HashMap<>();

    public void save(User user) {

    }

    //encontrar usuarios por id
    public User findById(Long id){
        return database.get(id);
    }

}