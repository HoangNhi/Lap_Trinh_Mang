package java37;

import java.util.Objects;

public class Date {
    private int Day, Month, Year;

    public Date() {}

    public Date(int day, int month, int year) {
        Day = day;
        Month = month;
        Year = year;
    }

    public int getDay() {
        return Day;
    }

    public void setDay(int day) {
        Day = day;
    }

    public int getMonth() {
        return Month;
    }

    public void setMonth(int month) {
        Month = month;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Date date)) return false;
        return getDay() == date.getDay() && getMonth() == date.getMonth() && getYear() == date.getYear();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDay(), getMonth(), getYear());
    }
}
