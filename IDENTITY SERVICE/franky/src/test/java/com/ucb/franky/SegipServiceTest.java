package com.ucb.franky;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SegipServiceTest {

    @Test
    @DisplayName("user doesnt exits")
    public void testCiDoesntExit(){
        //Arrange
        UserRepository userRepository = new UserRepository();
        SegipService segipService = new SegipService(userRepository);
        User user = new User(
                "Roberto Carlos",
                "Callisaya Mamani",
                "52987444",
                "07/07/1986",
                "11/03/2024",
                "11/03/2029"
        );

        //Act
        ArrayList<User> list =segipService.findByCi(user.getCi());

        //Assert
        assertEquals(0, list.size());
    }

}