package com.bridgelabz.HotelReservation;

public class Hotel {
    private String hotelName;
    private int rating;
    private double weekDayRate;
    private double weekendRate;
    private double weekdayRewardCustomerRate;
    private double weekendRewardCustomerRate;
    public Hotel() {
    }

    public Hotel(String hotelName, int rating, double weekDayRate, double weekendRate,double weekdayRewardCustomerRate,double weekendRewardCustomerRate) {
        this.hotelName = hotelName;
        this.rating = rating;
        this.weekDayRate = weekDayRate;
        this.weekendRate=weekendRate;
        this.weekdayRewardCustomerRate=weekdayRewardCustomerRate;
        this.weekendRewardCustomerRate=weekendRewardCustomerRate;
public class Hotel
{

    private String hotelName;
    private int rating;
    private double regularCustomerCost;

    public Hotel(String hotelName, int rating, double regularCustomerCost)
    {
        this.hotelName = hotelName;
        this.rating = rating;
        this.regularCustomerCost = regularCustomerCost;

    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }


    public double getWeekDayRate() {
        return weekDayRate;
    }

    public void setWeekDayRate(double weekDayRate) {
        this.weekDayRate = weekDayRate;
    }

    public double getWeekendRate() {
        return weekendRate;
    }

    public void setWeekendRate(double weekendRate) {
        this.weekendRate = weekendRate;
    }

    public double getWeekdayRewardCustomerRate() {
        return weekdayRewardCustomerRate;
    }

    public void setWeekdayRewardCustomerRate(double weekdayRewardCustomerRate) {
        this.weekdayRewardCustomerRate = weekdayRewardCustomerRate;
    }

    public double getWeekendRewardCustomerRate() {
        return weekendRewardCustomerRate;
    }

    public void setWeekendRewardCustomerRate(double weekendRewardCustomerRate) {
        this.weekendRewardCustomerRate = weekendRewardCustomerRate;

    public double getRegularCustomerCost() {
        return regularCustomerCost;
    }

    public void setRegularCustomerCost(double regularCustomerCost) {
        this.regularCustomerCost = regularCustomerCost;

    }

    @Override
    public String toString() {

        return "Hotel [hotelName=" + hotelName + ", rating=" + rating + ", weekDayRate=" + weekDayRate
                + ", weekendRate=" + weekendRate + ", weekdayRewardCustomerRate=" + weekdayRewardCustomerRate
                + ", weekendRewardCustomerRate=" + weekendRewardCustomerRate + "]";
    }
        return "Hotel [hotelName=" + hotelName + ", rating=" + rating + ", regularCustomerCost=" + regularCustomerCost
                + "]";
    }


}