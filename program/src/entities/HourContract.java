package entities;

import java.time.LocalDate;
import java.util.Date;

public class HourContract {
    private LocalDate moment;
    private Double valuePerHour;
    private Integer hour;

    public HourContract(LocalDate moment, Double valuePerHour, Integer hour){
        this.moment = moment;
        this.valuePerHour = valuePerHour;
        this.hour = hour;
    }

    public LocalDate getMoment(){
        return moment;
    }
    public Double getValuePerHour(){
        return valuePerHour;
    }
    public Integer getHour(){
        return hour;
    }
    public void setMoment(LocalDate moment){
        this.moment = moment;
    }
    public void setValuePerHour(Double valuePerHour){
        this.valuePerHour = valuePerHour;
    }
    public void setHour(Integer hour){
        this.hour = hour;
    }


    public Double totalValue(){
        return valuePerHour * hour;
    }

}
