package entities;

import entities.enums.WorkerLevel;

import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

public class Worker {

    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    private List<HourContract> contracts = new ArrayList<>();


    public Worker(String name, WorkerLevel level, Double baseSalary) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void setContracts(List<HourContract> contracts) {
        this.contracts = contracts;
    }


    public void addContract(HourContract contract) {
      contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);

    }

    public double income(YearMonth monthWorked) {
        double sum = baseSalary;
        for (HourContract c : contracts) {
            if (monthWorked.equals(c.getMoment())){
                sum += c.totalValue();
            }
        }
        return sum;
    }
}
