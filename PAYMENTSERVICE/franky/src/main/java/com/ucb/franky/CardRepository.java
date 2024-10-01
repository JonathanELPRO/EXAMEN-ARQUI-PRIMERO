package com.ucb.franky;

import java.util.ArrayList;
import java.util.Objects;

public class CardRepository {
    static ArrayList<Card> list = new ArrayList<>();

    static {
        // Cambié los montos acumulados a valores positivos para reflejar saldo disponible
        list.add(new Card("Roberto Carlos", "123", "02/10/2024", 100.0)); // Saldo inicial
        list.add(new Card("Jonathan Moruno", "1234", "02/10/2024", 150.0)); // Saldo inicial
    }

    public String makeDebit(String cardNumber, String cvv, double debit) {
        // Buscar la tarjeta por el número de tarjeta
        Card card = list.stream()
                .filter(c -> Objects.equals(c.getNumberCard(), cardNumber))
                .findFirst()
                .orElse(null);

        // Verificar si la tarjeta existe
        if (card == null) {
            return "Número de tarjeta no válido.";
        }

        // Verificar la CVV
        if (!Objects.equals(card.getCvv(), cvv)) {
            return "CVV incorrecto.";
        }

        // Verificar si hay suficiente saldo para debitar
        if (debit > card.getAccumulatedDebit()) {
            return "Saldo insuficiente para realizar el débito.";
        }

        // Realizar el débito
        card.setAccumulatedDebit(card.getAccumulatedDebit() - debit); // Restar el monto debitado
        return "Débito realizado exitosamente. Saldo restante: " + card.getAccumulatedDebit();
    }
}
