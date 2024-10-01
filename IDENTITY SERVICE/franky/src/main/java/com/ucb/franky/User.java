package com.ucb.franky;

public class User {
    private String name;
    private String lastname;
    private String ci;
    private String birthdate;
    private String emissionDate;
    private String expirationDate;
    public User(String name, String lastName, String ci, String birthdate, String emissionDate, String expirationDate) {
        this.name=name;
        this.lastname=lastName;
        this.ci=ci;
        this.birthdate=birthdate;
        this.emissionDate=emissionDate;
        this.expirationDate=expirationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getEmissionDate() {
        return emissionDate;
    }

    public void setEmissionDate(String emissionDate) {
        this.emissionDate = emissionDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

}
