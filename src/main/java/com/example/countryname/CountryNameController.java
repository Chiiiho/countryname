package com.example.countryname;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryNameController {
    private CountryNameService countryNameService;
    public CountryNameController(CountryNameService countryNameService) {
        this.countryNameService = countryNameService;
    }

    @GetMapping("/countries_names")
    public List<CountryName> findByCountryNames(@RequestParam String startsWith) {
        List<CountryName> countryName = countryNameService.findCountryNameStartingWith(startsWith);
        return countryName;
    }

    @GetMapping("/countries_names_by_city")
    public List<CountryName> findByCityNames(@RequestParam String startsWith) {
        List<CountryName> countryName = countryNameService.findCountryByCityNameStartingWith(startsWith);
        return countryName;
    }

    @GetMapping("/countries_names_by_country_code")
    public CountryName findByCountryCode(@RequestParam int countryCode) {
        return countryNameService.findByCountryCode(countryCode);
    }

    @GetMapping("/countries_names/{id}")
    public CountryName findById(@PathVariable("id") int id) {
        return countryNameService.findById(id);
    }

}
