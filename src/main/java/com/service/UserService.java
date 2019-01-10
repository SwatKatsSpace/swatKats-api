package com.service;

import com.jdbi.dao.UserDAO;
import com.model.User;

import org.jvnet.hk2.annotations.Service;

import java.util.List;
import java.util.UUID;

import javax.inject.Inject;
import javax.inject.Singleton;

@Service
@Singleton
public class UserService {

    @Inject
    private UserDAO userDAO;

    public List<User> getUserList() {

        List<User> userList = userDAO.getUserList();
        return userList;
    }

    public User getUserByUuid(UUID userUuid) {

        User user = userDAO.getUserByUuid(userUuid);
        return user;
    }

    public User getUserByEmail(String email) {

        User user = userDAO.getUserByEmail(email);
        return user;
    }

    public User getUserByAadharId(String aadharId) {

        User user = userDAO.getUserByAadharId(aadharId);
        return user;
    }

    public void createUser(User user) {

        userDAO.createUser(user.name(),
                           user.email(),
                           user.phone().get(),
                           user.password(),
                           user.aadharId(),
                           user.panId());
    }
}
