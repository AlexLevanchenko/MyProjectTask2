package com.company;

public class IdentityCardTest {
    public static void main(String[] args) {
        IdentityCard identity = new IdentityCard();
        identity.name = "Alex";
        identity.bDay = 1994;
        identity.identification–°ode = 12345678;
        identity.printInfo();

        IdentityCard identity2 = new IdentityCard();
        identity2.name = "Vanya";
        identity2.bDay = 1993;
        identity2.identification–°ode = 11111111;
        identity2.printInfo();

        IdentityCard identity3 = new IdentityCard();
        identity3.name = "Vova";
        identity3.bDay = 1992;
        identity3.identification–°ode = 22222222;
        identity3.printInfo();
    }
}
