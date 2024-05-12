DROP TABLE IF EXISTS countries_names;

CREATE TABLE countries_names (
 id int unsigned AUTO_INCREMENT,
 country_name VARCHAR(20) NOT NULL,
 country_code VARCHAR(20) NOT NULL,
 city_name VARCHAR(20) NOT NULL,
 PRIMARY KEY(id)
);

INSERT INTO countries_names (country_name, country_code, city_name) VALUES ("United Kingdom", "44", "London");
INSERT INTO countries_names (country_name, country_code, city_name) VALUES ("France", "33", "Paris");
INSERT INTO countries_names (country_name, country_code, city_name) VALUES ("Germany", "49", "Berlin");
