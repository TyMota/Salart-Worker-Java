package entities;

import java.time.LocalDate;
import java.time.YearMonth;

public class HourContract {
    private YearMonth moment;
    private Double valuePerHour;
    private Integer hour;

    public HourContract(){
    }

    public HourContract(YearMonth moment, Double valuePerHour, Integer hour){
        this.moment = moment;
        this.valuePerHour = valuePerHour;
        this.hour = hour;
    }

    public YearMonth getMoment(){
        return moment;
    }
    public Double getValuePerHour(){
        return valuePerHour;
    }
    public Integer getHour(){
        return hour;
    }
    public void setMoment(YearMonth moment){
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
