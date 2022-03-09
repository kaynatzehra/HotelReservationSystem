package com.bridgelabz.HotelReservation;

public class HotelReservationMain
{
    public static void main(String[] args) {
        System.out.println("Hotel Reservation System");
        HotelReservationIF hotelReservation = new HotelReservation();
        hotelReservation.addHotel();
        hotelReservation.printHotelList();
    }
}