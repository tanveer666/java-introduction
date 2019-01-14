package ee.taltech.itcolledge.maps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class PersonGrouper {

    public static Map<String, Person> groupPeopleByIdCode(List<Person> people){
        return new HashMap<>();
    }

    public static Map<String, Person> groupPeopleByFirstAndLastName(List<Person> people){
        return new HashMap<>();
    }

    public static NavigableMap<String, Person> groupPeopleByFirstAndLastNameAsc(List<Person> people){
        return new TreeMap<>();
    }
}
