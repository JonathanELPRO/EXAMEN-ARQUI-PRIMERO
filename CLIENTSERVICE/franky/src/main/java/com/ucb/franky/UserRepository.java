package com.ucb.franky;

import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;

public class UserRepository {
    static ArrayList<User> list = new ArrayList<User>();

    static {
        list.add(new User(
                "Roberto Carlos",
                "Callisaya",
                "Mamani",
                "1"
        ));
        list.add(new User(
                "Roberto Carlos",
                "Callisaya",
                "Mamani",
                "2"
        ));
        list.add(new User(
                "Roberto Carlos",
                "Callisaya",
                "Mamani",
                "3"
        ));
        list.add(new User(
                "Roberto Carlos",
                "Callisaya",
                "Mamani",
                "4"
        ));
    }
    public String createUser(User user) {
        boolean exists = list.stream()
                .anyMatch(existingUser -> Objects.equals(existingUser.getCi(), user.getCi()));

        if (exists) {
            return "El usuario con el ID " + user.getCi() + " ya existe";
        } else {
            list.add(user);
            return "Usuario agregado exitosamente";
        }
    }



}

