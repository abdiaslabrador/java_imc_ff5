package dev.exercise.bmi.controllers;

import dev.exercise.bmi.models.BmiModel;
import dev.exercise.bmi.models.Person;

public class BmiController {

    private BmiModel bmi;

    public BmiController(){
        bmi = new BmiModel();
    }

    public Person createPerson(double weight, double height){
        Person person = new Person(weight, height);
        return person;
    }

    public double getBmiNumber(Person person){
        double bmiResult = bmi.calculateBMI(person);
        return bmiResult;
    }

    public String getBmiClassification(double bmiNumber){
        String category = bmi.giveResultsBMI(bmiNumber);
        return category;
    }
}
