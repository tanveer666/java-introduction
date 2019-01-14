package ee.taltech.itcolledge.maps;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

import static org.junit.Assert.*;

public class PersonGrouperTest {

    public static List<Person> testPeople = Lists.newArrayList(
            new Person("11111", "Donald", "Duck"),
            new Person("22222", "Great", "President"),
            new Person("33333", "Michael", "Jackson"));

    @Test
    public void groupPeopleByIdCode() {
        Map<String, Person> map = PersonGrouper.groupPeopleByIdCode(testPeople);
        assertEquals(3, map.size());
        assertNull(map.get("-1"));
        Person person1 = map.get("11111");
        assertEquals("Donald", person1.getFirstName());
        Person person2 = map.get("22222");
        assertEquals("Great", person2.getFirstName());
        Person person3 = map.get("33333");
        assertEquals("Michael", person3.getFirstName());
    }

    @Test
    public void groupPeopleByFirstAndLastName() {
        Map<String, Person> map = PersonGrouper.groupPeopleByFirstAndLastName(testPeople);
        assertEquals(3, map.size());
        //todo add more tests
    }

    @Test
    public void groupPeopleByFirstAndLastNameAsc() {
        NavigableMap<String, Person> map = PersonGrouper.groupPeopleByFirstAndLastNameAsc(testPeople);
        assertEquals(3, map.size());
        Map.Entry<String, Person> entry = map.firstEntry();
        //todo add more tests
    }
}