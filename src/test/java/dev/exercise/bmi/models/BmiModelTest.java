package dev.exercise.bmi.models;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.BeforeEach;

public class BmiModelTest {

    double weight;
    double height;
    BmiModel bmi;

    @BeforeEach
    public void setUp() {
        bmi = new BmiModel();
        weight = 75;
        height = 1.87;
    }

    @Test
    void testCalculateBMI() {
        double bmiExpected = weight / (Math.pow(height, 2));
        Person person = new Person(weight, height);
        assertThat(bmiExpected, is(bmi.calculateBMI(person)));
    }
    @Test
    void testGiveResultsBMI_severe_thinness() {
        double bmiNumber = 15;
        String bmiCategoryExpeceted = "Severe thinness";
        assertThat(bmiCategoryExpeceted, is(bmi.giveResultsBMI(bmiNumber)));
    }
    @Test
    void testGiveResultsBMI_moderate_thinness() {
        double bmiNumber = 16;
        String bmiCategoryExpeceted = "Moderate thinness";
        assertThat(bmiCategoryExpeceted, is(bmi.giveResultsBMI(bmiNumber)));
    }
    @Test
    void testGiveResultsBMI_mild_thinness() {
        double bmiNumber = 17.5;
        String bmiCategoryExpeceted = "Mild thinness";
        assertThat(bmiCategoryExpeceted, is(bmi.giveResultsBMI(bmiNumber)));
    }
    @Test
    void testGiveResultsBMI_normal_weight() {
        double bmiNumber = 23;
        String bmiCategoryExpeceted = "Normal weight";
        assertThat(bmiCategoryExpeceted, is(bmi.giveResultsBMI(bmiNumber)));
    }
    @Test
    void testGiveResultsBMI_overweight() {
        double bmiNumber = 28;
        String bmiCategoryExpeceted = "Overweight";
        assertThat(bmiCategoryExpeceted, is(bmi.giveResultsBMI(bmiNumber)));
    }
    @Test
    void testGiveResultsBMI_mild_obesity() {
        double bmiNumber = 32;
        String bmiCategoryExpeceted = "Mild obesity";
        assertThat(bmiCategoryExpeceted, is(bmi.giveResultsBMI(bmiNumber)));
    }
    @Test
    void testGiveResultsBMI_moderate_obesity() {
        double bmiNumber = 38;
        String bmiCategoryExpeceted = "Moderate obesity";
        assertThat(bmiCategoryExpeceted, is(bmi.giveResultsBMI(bmiNumber)));
    }
    @Test
    void testGiveResultsBMI_morbid_obesity() {
        double bmiNumber = 50;
        String bmiCategoryExpeceted = "Morbid Obesity";
        assertThat(bmiCategoryExpeceted, is(bmi.giveResultsBMI(bmiNumber)));
    }
}
