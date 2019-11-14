package salarycalculator;

import java.util.*;

public class SalaryCalculator {

    private double basicSalary, hra, allowance, pf, total;
    private String counter;
//SalaryCalculator salaryCalculator1 = new SalaryCalculator();
    Scanner sc = new Scanner(System.in);

    public void input() {
        System.out.println("Enter basic salary");
        basicSalary = sc.nextDouble();

    }

    public void calculate() {
        hra = basicSalary * 0.5;
        allowance = basicSalary * 0.75;
        pf = basicSalary * 0.12;
        total = (basicSalary + hra + allowance) - pf;
    }

    public void display() {
        System.out.println("The net payable salary is " + total);
    }

    public void menu() {

        System.out.println("----------------SalaryCalculator---------------");
        System.out.println("Enter 1. to calculate");
        System.out.println("Enter 2. to exit");
        counter = sc.next();
        //System.out.println(counter);
        counter = counter.trim();
        if (counter.equals("1")) {
         
            input();
            calculate();
            display();
            menu();
        } else {
            if (counter.equals("2")) {

                System.out.println("exiting..");
                System.exit(0);
            }
            else
            {
                System.out.println("Enter valid choice");
                menu();
            }
        }
    }

    public static void main(String[] args) {
        SalaryCalculator salaryCalculator = new SalaryCalculator();
        salaryCalculator.menu();
    }

}
