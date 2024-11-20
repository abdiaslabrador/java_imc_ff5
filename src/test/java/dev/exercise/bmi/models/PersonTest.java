package dev.exercise.bmi.models;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class PersonTest {

    Person person;
    double weight;
    double height;

    @BeforeEach
    public void setUp() {
        weight = 75;
        height = 1.87;
        person = new Person(weight, height);
    }

    @Test
    void testGetHeight() {
        assertThat(height, is(person.getHeight()));
    }

    @Test
    void testGetWeight() {
        assertThat(weight, is(person.getWeight()));
    }

    @Test
    void testSetHeight() 
    {
        double newHeight = 1.70;
        person.setHeight(newHeight);
        assertThat(newHeight, is(person.getHeight()));
    }

    @Test
    void testSetWeight() {
        double newWeight = 75;
        person.setWeight(newWeight);
        assertThat(newWeight, is(person.getWeight()));
    }
}
