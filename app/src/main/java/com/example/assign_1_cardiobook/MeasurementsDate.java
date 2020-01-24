package com.example.assign_1_cardiobook;


public class MeasurementDate
{
    private String dateRecorded;
    private String year;
    private String month;
    private String day;

    MeasurementDate(String dateRecorded)
    {
        this.dateRecorded = dateRecorded;
        String[] ymd = dateRecorded.split("-");
        this.year = ymd[0];
        this.month = ymd[1];
        this.day = ymd[2];
    }


    public String getDate()
    {
        return this.dateRecorded;
    }

    public String getYear() { return this.year; }

    public String getMonth() { return this.month; }

    public String getDay() { return this.day; }


}
