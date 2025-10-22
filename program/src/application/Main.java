package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

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
            System.out.print("DATE (DD/MM/YYYY): ");
            String date = sc.nextLine();
            LocalDate dateTime = LocalDate.parse(date);

            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();

            System.out.print("Duration (hours): ");
            Integer hour = sc.nextInt();

            HourContract contract = new HourContract(dateTime, valuePerHour, hour);
            worker.addContract(contract);

        }





        sc.close();
    }
}
