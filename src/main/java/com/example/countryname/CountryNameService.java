package com.example.countryname;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryNameService {
    private CountryNameMapper countryNameMapper;

    public CountryNameService(CountryNameMapper countryNameMapper) {
        this.countryNameMapper = countryNameMapper;
    }

    public List<CountryName> findCountryNameStartingWith(String prefix) {
        return countryNameMapper.findByCountryNameStartingWith(prefix);
    }

    public List<CountryName> findCountryByCityNameStartingWith(String prefix) {
        return countryNameMapper.findCountryByCityNameStartingWith(prefix);
    }

    public CountryName findByCountryCode(int countryCode) {
        return countryNameMapper.findByCountryCode(countryCode)
                .orElseThrow(() -> new CountryNameNotFoundException("Country with code " + countryCode + " not found"));
    }

    public CountryName findById(int id) {
        return countryNameMapper.findById(id)
                .orElseThrow(() -> new CountryNameNotFoundException("Country with ID " + id + " not found"));
    }

}
