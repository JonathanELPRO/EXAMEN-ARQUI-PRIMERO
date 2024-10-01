package com.ucb.franky;

public class PaymentService {
    public PaymentService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    CardRepository cardRepository;


    public String makeDebit(String cardNumber,String cvv, double debit){

        return this.cardRepository.makeDebit(cardNumber,cvv, debit);
    }

}
