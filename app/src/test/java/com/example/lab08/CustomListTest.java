package com.example.lab08;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail initially because hasCity() doesn'texist
        assertTrue(list.hasCity(calgary));
    }
    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();

        City city = new City("Edmonton", "Alberta");
        list.addCity(city);

        list.deleteCity(city);

        assertFalse(list.hasCity(city));
    }
    @Test
    public void testCountCities() {
        CustomList list = new CustomList();

        City c1 = new City("Edmonton", "Alberta");
        City c2 = new City("Calgary", "Alberta");

        list.addCity(c1);
        list.addCity(c2);

        assertEquals(2, list.countCities());
    }
}