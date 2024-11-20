package dev.exercise.bmi.views;

import java.util.Scanner;

import dev.exercise.bmi.controllers.BmiController;
import dev.exercise.bmi.models.Person;

public class BmiView {
    
    private static Scanner scanner;
    private BmiController controller;

    public BmiView(){
        controller = new BmiController();
        scanner = new Scanner(System.in);
    }

    public void start(){
        showWelcome();
        double weight = askWeight(scanner);
        double height = askHeight(scanner);
        Person person = controller.createPerson(weight, height);
        showTable();
        double bmiNumb = controller.getBmiNumber(person);
        showResults(bmiNumb, controller.getBmiClassification(bmiNumb));
    }

    public  void showWelcome(){
        System.out.println("-------------------------");
        System.out.println("Welcome to BMI calculator");
        System.out.println("-------------------------");
    }

    public  double askWeight(Scanner scanner){
        System.out.print("\nEnter your weight in kilograms: ");
        return scanner.nextDouble();
    }

    public  double askHeight(Scanner scanner){
        System.out.print("\nEnter your height in meters: ");
        return scanner.nextDouble();
    }

    public  void showResults(double bmi, String clasification){
        System.out.printf("\n\nYour BMI is: %.2f", bmi);
        System.out.println("\nYour BMI is: " + clasification);
    }

    public  void showTable(){
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
