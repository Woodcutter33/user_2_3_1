package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDAO;
import web.model.User;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }


    @Override
    public List<User> getAllUser() {
        return null;
    }

    @Override
    public void createUser(User user) {

    }

    @Override
    public User getUser(int id) {
        return null;
    }

    @Override
    public void editUser(int id, User user) {

    }

    @Override
    public void deleteUser(int id) {

    }
}
