package com.service;

import com.jdbi.dao.UserDAO;
import com.model.User;
import org.jvnet.hk2.annotations.Service;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.List;

@Service
@Singleton
public class UserService {

    @Inject
    private UserDAO userDAO;

    public List<User> getUserList() {

        List<User> userList = userDAO.getUserList();
        return userList;
    }

}
