package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

//Question 1
        int bobSalary = 54898;
        int garySalary = 73945;
        int highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is $" + highestSalary + ".");
//Question 2
        int carPrice = 25479;
        int truckPrice = 45960;
        int lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The lowest price is $" + lowestPrice + ".");
//Question 3
        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle is " + area + " units squared.");
//Question 4
        double x = 5;
        double square = Math.sqrt(x);
        System.out.println("The square root of 5 is " + square +".");
//Question 5
        double x1 = 5;
        double x2 = 85;
        double y1 = 10;
        double y2 = 50;
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The distance between the points is " + distance + " units.");
//Question 6
        double z = -3.8;
        double absValue = Math.abs(z);
        System.out.println("The absolute value of -3.8 is " + absValue + ".");
//Question 7
        System.out.println(Math.random());
//Question 8
        int minutesInHour = 60;
        int hoursInDay = 24;
        int secondsInMinute = 60;
        int millisecondsInSecond = 1000;
        int minutesInDay = hoursInDay * minutesInHour;
    //The question asks for 24 days.
        System.out.println("There are " + (minutesInDay * 24) + " minutes in 24 days.");
        long millisecondsInDay = minutesInDay * secondsInMinute * millisecondsInSecond;
        System.out.println("There are " + (millisecondsInDay * 24) + " milliseconds in 24 days.");




    }
}
