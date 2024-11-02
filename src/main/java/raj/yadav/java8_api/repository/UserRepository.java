package raj.yadav.java8_api.repository;
import org.springframework.stereotype.Repository;
import raj.yadav.java8_api.model.User;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private List<User> users = new ArrayList<>();

    public List<User> findAll() {
        return users;
    }

    public void save(User user) {
        users.add(user);
    }
}
