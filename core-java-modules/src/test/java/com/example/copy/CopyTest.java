package com.example.copy;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CopyTest {

    @Test
    public void testShallowCopy() throws CloneNotSupportedException {
        Address address = new Address("Mumbai");
        Person person1 = new Person("Patel", address);
        Person person2 = (Person) person1.clone();

        assertEquals("Mumbai", person1.address.city);
        assertEquals("Mumbai", person2.address.city);

        person2.address.city = "Bengaluru";
        assertEquals("Bengaluru", person1.address.city);
        assertEquals("Bengaluru", person2.address.city);
    }

    @Test
    public void testDeepCopy() throws CloneNotSupportedException {
        Address address = new Address("Mumbai");
        Person person1 = new Person("Patel", address);
        Person person2 = (Person) person1.clone();

        assertEquals("Mumbai", person1.address.city);
        assertEquals("Mumbai", person2.address.city);

        person2.address.city = "Bengaluru";
        assertEquals("Mumbai", person1.address.city);
        assertEquals("Bengaluru", person2.address.city);
    }
}
