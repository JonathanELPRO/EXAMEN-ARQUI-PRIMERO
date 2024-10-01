package com.ucb.franky;

import java.util.ArrayList;

public class ClientService {
    UserRepository userRepository;
    public ClientService(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    public String createUser(User user){

        return this.userRepository.createUser(user);
    }

}
