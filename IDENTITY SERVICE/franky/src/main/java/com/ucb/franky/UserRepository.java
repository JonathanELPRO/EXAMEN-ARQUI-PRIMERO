package com.ucb.franky;

import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;

public class UserRepository {
    static ArrayList<User> list = new ArrayList<User>();
    static {
        list.add(new User(
                "Roberto Carlos",
                "Callisaya Mamani",
                "0",
                "07/07/1986",
                "11/03/2024",
                "11/03/2029"
        ));
        list.add(new User(
                "Roberto Carlos",
                "Callisaya Mamani",
                "1",
                "07/07/1986",
                "11/03/2024",
                "11/03/2029"
        ));
        list.add(new User(
                "Roberto Carlos",
                "Callisaya Mamani",
                "2",
                "07/07/1986",
                "11/03/2024",
                "11/03/2029"
        ));
        list.add(new User(
                "Roberto Carlos",
                "Callisaya Mamani",
                "3",
                "07/07/1986",
                "11/03/2024",
                "11/03/2029"
        ));
    }
    public ArrayList<User> findByCi(String ci){
        // Cambia a la creación de un ArrayList explícitamente
        return list.stream()
                .filter(user -> Objects.equals(user.getCi(), ci))
                .collect(Collectors.toCollection(ArrayList::new));
    }
}

