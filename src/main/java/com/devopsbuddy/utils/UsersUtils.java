package com.devopsbuddy.utils;

import com.devopsbuddy.backend.persistence.domain.backend.User;

public class UsersUtils {

    /**
     * Non Instantiable
     */
    private UsersUtils() {
        throw new AssertionError("Non Instantiable");
    }

    public static User createBasicUser() {
        User user = new User();
        user.setUsername("BasicUser");
        user.setPassword("secret");
        user.setEmail("me@Example.com");
        user.setFirstName("FirstName");
        user.setLastName("LastName");
        user.setPhoneNumber("123456789123");
        user.setCountry("SL");
        user.setEnable(true);
        user.setDescription("A basic user");
        user.setProfileImageUrl("https://blabla.images.com/basicuser");

        return user;
    }
}
