package com.services;

import com.model.immutables.ImmutableUser;
import com.model.User;

public class UserService {

    public static User getUser() {

        return ImmutableUser.builder()
                .name("Ayush")
                .email("eric@gmail.com")
                .phone("8884873621")
                .aadharId("111111111")
                .build();
    }

}
