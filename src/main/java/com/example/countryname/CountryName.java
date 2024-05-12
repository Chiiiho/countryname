package com.example.countryname;

public class CountryName {

    private int id;
    private String countryName;
    private int countryCode;
    private String cityName;

    public CountryName(int id, String countryName, int countryCode, String cityName) {
        this.id = id;
        this.countryName = countryName;
        this.countryCode = countryCode;
        this.cityName = cityName;
    }

    public int getId() {
        return id;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public String getCityName() {
        return cityName;
    }
}
