package com.company;

public class CountryTest {
    public static void main(String[] args) {
        Country country = new Country();
        country.countryName = "Ukraine";
        country.capital = "Kyiv";
        country.square = 111;
        country.printInfo();

        Country country2 = new Country();
        country2.countryName = "Great Britain";
        country2.capital = "London";
        country2.square = 222;
        country2.printInfo();

        Country country3 = new Country();
        country3.countryName = "Germany";
        country3.capital = "Berlin";
        country3.square = 333;
        country3.printInfo();
    }
}