package dev.exercise.bmi.views;

import java.util.Scanner;

import dev.exercise.bmi.controllers.BmiController;
import dev.exercise.bmi.models.Person;

public class BmiView {
    
    private static Scanner scanner = new Scanner(System.in);
    private BmiController controller;

    public BmiView(){
        controller = new BmiController();
    }

    public void start(){
        
        double weight = askWeight();
        double height = askHeight();
        Person person = controller.createPerson(weight, height);
        
        showResults(controller.getBmiNumber(person), controller.getBmiClassification(height));
    }

    

    private  double askWeight(){
        System.out.print("\nEnter your weight in kilograms: ");
        return scanner.nextDouble();
    }

    private  double askHeight(){
        System.out.print("\nEnter your height in meters: ");
        return scanner.nextDouble();
    }

    private  void showResults(double bmi, String clasification){
        System.out.printf("\n\nYour BMI is: %.2f", bmi);
        System.out.println("\nYour BMI is: " + clasification);
    }

    
}
