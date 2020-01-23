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
    }


    public String getDate()
    {
        return this.dateRecorded;
    }

    public String getYear() { return this.year; }


}
