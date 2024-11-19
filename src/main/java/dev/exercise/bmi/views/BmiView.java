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
        showWelcome();
        double weight = askWeight();
        double height = askHeight();
        Person person = controller.createPerson(weight, height);
        showTable();
        showResults(controller.getBmiNumber(person), controller.getBmiClassification(height));
    }

    private  void showWelcome(){
        System.out.println("-------------------------");
        System.out.println("Welcome to BMI calculator");
        System.out.println("-------------------------");
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

    private  void showTable(){
        System.out.println("\n=========================");
        System.out.printf("\t BMI Result");
        System.out.printf("\n16\t\tSevere thinness");
        System.out.printf("\n16 - 17\t\tModerate thinness");
        System.out.printf("\n17 - 18,5\tMild thinness");
        System.out.printf("\n18,5 - 25\tNormal weight");
        System.out.printf("\n25 - 30\t\tOverweight");
        System.out.printf("\n30 - 35\t\tMild obesity");
        System.out.printf("\n35 - 40\t\tModerate obesity");
        System.out.printf("\n>= 40\t\tMorbid obesity");
    }
}
