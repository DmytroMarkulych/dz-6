package org.example;

import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Завдання 1
        String[] cities = {"London", "Lviv", "New York"};
        String searchCity = "Lviv";
        boolean exists = searchCityInArray(cities, searchCity);
        System.out.println("Місто " + searchCity + " знайдено: " + exists);

        // Завдання 2
        List<String> citiesWithDuplicates = List.of("London", "Lviv", "Lviv");
        printUniqueCities(citiesWithDuplicates);
    }

    // Завдання 1: Пошук міста в масиві рядків
    public static boolean searchCityInArray(String[] cities, String searchCity) {
        // Використання циклу for
        for (String city : cities) {
            if (city.equals(searchCity)) {
                return true;
            }
        }

        // Використання циклу while
        int i = 0;
        while (i < cities.length) {
            if (cities[i].equals(searchCity)) {
                return true;
            }
            i++;
        }

        return false;
    }

    // Завдання 2: Друк унікальних міст без повторень
    public static void printUniqueCities(List<String> cities) {
        Set<String> uniqueCities = new HashSet<>(cities);
        System.out.println("Унікальні міста без повторень:");

        // Використання циклу for
        for (String city : uniqueCities) {
            System.out.println(city);
        }

        // Використання циклу while
        Set<String> uniqueCitiesCopy = new HashSet<>(cities);
        while (!uniqueCitiesCopy.isEmpty()) {
            String city = uniqueCitiesCopy.iterator().next();
            System.out.println(city);
            uniqueCitiesCopy.remove(city);
        }
    }
}
