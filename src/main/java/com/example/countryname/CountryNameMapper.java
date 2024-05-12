package com.example.countryname;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Mapper
public interface CountryNameMapper {

    @Select("SELECT * FROM countries_names WHERE country_name LIKE CONCAT(#{prefix}, '%')")
    List<CountryName> findByCountryNameStartingWith(String prefix);

    @Select("SELECT * FROM countries_names WHERE city_name LIKE CONCAT(#{prefix}, '%')")
    List<CountryName> findCountryByCityNameStartingWith(String prefix);

    @Select("SELECT * FROM countries_names WHERE country_code = #{country_code}")
    Optional<CountryName> findByCountryCode(int countryCode);

    @Select("SELECT * FROM countries_names WHERE id = #{id}")
    Optional<CountryName> findById(int id);

}
