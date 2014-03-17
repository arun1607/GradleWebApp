package com.fidelis.learning;

import org.junit.Test;

import com.fidelis.learning.Person;

import static org.junit.Assert.*;

public class PersonTest {
    @Test
    public void canConstructAPersonWithAName() {
        Person person = new Person("Larry");
        assertEquals("Larry", person.getName());
    }
}
