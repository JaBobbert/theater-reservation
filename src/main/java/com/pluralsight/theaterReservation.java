package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class theaterReservation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String fullName = scan.nextLine();
        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        String date = scan.nextLine();
        System.out.print("How many tickets would you like? ");
        String tickets = scan.nextLine();
        int ticket = Integer.parseInt(tickets);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate userdate = LocalDate.parse(date, format);

        int spaceIndex = fullName.indexOf(' ');
        String firstName = fullName.substring(0, spaceIndex);
        String lastName = fullName.substring(spaceIndex + 1);

        if ( ticket > 1){
            System.out.println(tickets + " tickets reserved for " + userdate + " under " + lastName + ", " + firstName);
        }
        else{
            System.out.println(tickets + " ticket reserved for " + userdate + " under " + lastName + ", " + firstName);
        }


        scan.close();
    }
}
