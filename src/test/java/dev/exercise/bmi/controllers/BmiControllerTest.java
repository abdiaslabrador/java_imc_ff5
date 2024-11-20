package dev.exercise.bmi.controllers;
import dev.exercise.bmi.models.Person;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;


public class BmiControllerTest {

    BmiController controller;
    double weight;
    double height;

    @BeforeEach
    public void setUp() {
        controller = new BmiController();
        weight = 75;
        height = 1.87;
    }

    @Test
    void testCreatePerson() {
        assertThat(controller.createPerson(weight, height), instanceOf(Person.class));
        assertThat(controller.createPerson(weight, height).getWeight(), is(weight));
        assertThat(controller.createPerson(weight, height).getHeight(), is(height));
    }

    @Test
    void testGetBmiNumber() {
        double bmiExpected = weight / (Math.pow(height, 2));
        assertThat(bmiExpected, is(controller.getBmiNumber(controller.createPerson(weight, height))));
    }

    @Test
    void testGetBmiClassification() {
        double bmiNumber = 15;
        String bmiCategoryExpeceted = "Severe thinness";
        assertThat(bmiCategoryExpeceted, is(controller.getBmiClassification(bmiNumber)));
    }
}
