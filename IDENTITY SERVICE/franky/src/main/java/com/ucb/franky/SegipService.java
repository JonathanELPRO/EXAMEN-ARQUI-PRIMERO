package com.ucb.franky;
import java.util.ArrayList;

public class SegipService {
    UserRepository userRepository;
    public SegipService(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    public ArrayList<User> findByCi(String ci){

        return this.userRepository.findByCi(ci);
    }

}
