/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author Ivy
 */
public class MyDate {
    private int day;
    private int month;
    private int year;
    
    public MyDate(int d, int m, int y) {
        day = d;
        month = m;
        year = y;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getMonthShortForm() {
        String sMonth = "";
        switch(month) {
            case 1:
                sMonth = "Jan";
                break;
            case 2:
                sMonth = "Feb";
                break;
            case 3:
                sMonth = "Mar";
                break;
            case 4:
                sMonth = "Apr";
                break;
            case 5:
                sMonth = "May";
                break;
            case 6:
                sMonth = "Jun";
                break;
            case 7:
                sMonth = "Jul";
                break;
            case 8:
                sMonth = "Aug";
                break;
            case 9:
                sMonth = "Sep";
                break;
            case 10:
                sMonth = "Oct";
                break;
            case 11:
                sMonth = "Nov";
                break;
            case 12:
                sMonth = "Dec";
                break;
        }
        return sMonth;
    }
    
    public String getMonthLongForm() {
        String lMonth = "";
        switch(month) {
            case 1:
                lMonth = "January";
                break;
            case 2:
                lMonth = "February";
                break;
            case 3:
                lMonth = "March";
                break;
            case 4:
                lMonth = "April";
                break;
            case 5:
                lMonth = "May";
                break;
            case 6:
                lMonth = "June";
                break;
            case 7:
                lMonth = "July";
                break;
            case 8:
                lMonth = "August";
                break;
            case 9:
                lMonth = "September";
                break;
            case 10:
                lMonth = "October";
                break;
            case 11:
                lMonth = "November";
                break;
            case 12:
                lMonth = "December";
                break;
        }
        return lMonth;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return getMonthShortForm() + " " + day + ", " + year;
    }
    
}
