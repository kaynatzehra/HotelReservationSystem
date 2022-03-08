package com.bridgelabz.HotelReservation;

import java.util.ArrayList;

public interface HotelReservationIF
{
    public void addHotel(String hotelName,int rate, double regularCustomerRate);
    public int getHotelListSize();
    public void printHotelList();
    public ArrayList<Hotel> getHotelList();
}

