package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUser();

    void createUser(User user);

    User getUser(int id);

    void editUser(int id, User user);

    void deleteUser(int id);
}
