package com.service;

import com.jdbi.dao.UserDAO;
import com.model.User;
import org.jvnet.hk2.annotations.Service;

import javax.inject.Inject;
import javax.inject.Singleton;

@Service
@Singleton
public class LoginService {

    @Inject
    private UserDAO userDAO;

    public User getUserByUserNameAndPassword(User user) throws Exception{
        if(user.email() != null && user.password() != null) {
            return userDAO.getUserByPhoneOREmailAndPassword(user.email(), user.password());
        } else if(user.phone().get() != null && user.password() != null) {
            return userDAO.getUserByPhoneOREmailAndPassword(user.phone().get(), user.password());
        } else {
            throw new Exception("Invalid input");
        }
    }
}
