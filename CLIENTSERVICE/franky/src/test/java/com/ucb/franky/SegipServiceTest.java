package com.ucb.franky;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SegipServiceTest {

    @Mock
    UserRepository userRepository;

    @InjectMocks
    ClientService clientService;

    @Test
    @DisplayName("Testeando la creación de un usuario")
    public void testCreateUser() {
        // Arrange
        User user = new User(
                "Roberto Carlos",
                "Callisaya Mamani",
                "52987444",
                "1"
        );

        when(userRepository.createUser(user)).thenReturn("Usuario agregado exitosamente");

        // Act
        String result = clientService.createUser(user);

        // Assert
        assertEquals("Usuario agregado exitosamente", result);

    }
}