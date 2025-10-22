package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("MM/yyyy");

        System.out.print("Enter department's name: ");
        String department = sc.nextLine();

        Department department1 = new Department(department);

        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Level: ");
        WorkerLevel level = WorkerLevel.valueOf(sc.nextLine());
        System.out.print("Base Salary: ");
        Double baseSalary = sc.nextDouble();

        Worker worker = new Worker(name, level, baseSalary);

        System.out.print("How many contracts to this worker? ");
        int cont = sc.nextInt();
        for (int i = 0; i < cont; i++ ){
            System.out.println("Enter contract #" + (i + 1) + " data:");
            System.out.print("DATE (MM/YYYY): ");
            sc.nextLine();
            String date = sc.nextLine();
            YearMonth moment = YearMonth.parse(date, fmt2);

            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();

            System.out.print("Duration (hours): ");
            Integer hour = sc.nextInt();

            HourContract contract = new HourContract(moment, valuePerHour, hour);
            worker.addContract(contract);

        }

            System.out.print("Enter month and year to calculate income (MM/YYYY): ");
            sc.nextLine();
            String monthWork = sc.nextLine();
            YearMonth monthWorked = YearMonth.parse(monthWork, fmt2);


            System.out.println("Name: " + worker.getName());

            System.out.println("Department: " + department1.getDepartment());

            System.out.println("Income for " + monthWorked + ": " + worker.income(monthWorked));


        sc.close();
    }
}
