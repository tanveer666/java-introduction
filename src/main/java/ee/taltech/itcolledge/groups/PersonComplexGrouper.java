package ee.taltech.itcolledge.groups;

import ee.taltech.itcolledge.maps.Person;
import ee.taltech.itcolledge.maps.Sex;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class PersonComplexGrouper {

    public static Map<Sex, List<Person>> groupPeopleBySex(List<Person> people) {
        return new HashMap<>();
    }

    public static NavigableMap<Sex, List<Person>> groupPeopleBySexOrderByFirstName(List<Person> people) {
        return new TreeMap<>();
    }
}
