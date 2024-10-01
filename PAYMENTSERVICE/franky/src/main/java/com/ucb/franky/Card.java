package com.ucb.franky;

public class Card {

    private String numberCard;
    private String cvv;
    private String expirationDate;
    private double accumulatedDebit
            ;

    public Card(String numberCard, String cvv, String expirationDate, double accumulatedDebit) {
        this.numberCard = numberCard;
        this.cvv = cvv;
        this.expirationDate = expirationDate;
        this.accumulatedDebit = accumulatedDebit;
    }

    public String getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(String numberCard) {
        this.numberCard = numberCard;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public double getAccumulatedDebit() {
        return accumulatedDebit;
    }

    public void setAccumulatedDebit(double debitMount) {
        this.accumulatedDebit = debitMount;
    }

}