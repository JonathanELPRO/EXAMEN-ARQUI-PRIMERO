package com.ucb.franky;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class PaymentServiceTest {

    @Mock
    CardRepository cardRepository;

    @InjectMocks
    PaymentService paymentService;

    @Test
    @DisplayName("Prueba de débito exitoso")
    void makeDebitSuccessful() {
        // Arrange
        String cardNumber = "123"; // Número de tarjeta válido
        String cvv = "123"; // CVV válido
        double debitAmount = 50.0; // Monto a debitar

        // Mockear el comportamiento del repositorio
        when(cardRepository.makeDebit(cardNumber, cvv, debitAmount))
                .thenReturn("Débito realizado exitosamente. Saldo restante: 50.0");

        // Act
        String result = paymentService.makeDebit(cardNumber, cvv, debitAmount);

        // Assert
        assertEquals("Débito realizado exitosamente. Saldo restante: 50.0", result);
    }
}