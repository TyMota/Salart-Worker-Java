package entities;

import java.time.LocalDate;
import java.util.Date;

public class Worker {

    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    public Worker(String name, WorkerLevel level, Double baseSalary){
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
    }

    public String getName(){
        return name;
    }
    public WorkerLevel getLevel(){
        return level;
    }
    public Double getBaseSalary(){
        return baseSalary;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setLevel(WorkerLevel level){
        this.level = level;
    }
    public void setBaseSalary(Double baseSalary){
        this.baseSalary = baseSalary;
    }

    public void addContract(HourContract contract){
        LocalDate moment = contract.getMoment();
        Double valuePerHour = contract.getValuePerHour();
        Integer hour = contract.getHour();
    }

    public void removeContract(HourContract contract){
        LocalDate moment = contract.getMoment();
        Double valuePerHour = contract.getValuePerHour();
        Integer hour = contract.getHour();
    }

    public Double income(Integer year, Integer month){
        return (double) (year + month);
    }






}
