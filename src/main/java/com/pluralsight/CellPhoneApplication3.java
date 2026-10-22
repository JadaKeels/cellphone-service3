package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CellPhone3 myPhone = new CellPhone3();

        int serialNumber;
        String model;
        String carrier;
        String phoneNumber;
        String owner;

        System.out.print("What is the serial number? ");
        serialNumber = scan.nextInt();
        scan.nextLine();
        myPhone.setSerialNumber(serialNumber);

        System.out.print("What model is the phone? ");
        model = scan.nextLine();
        myPhone.setModel(model);

        System.out.print("Who is the carrier? ");
        carrier = scan.nextLine();
        myPhone.setCarrier(carrier);

        System.out.print("What is the phone number? ");
        phoneNumber = scan.nextLine();
        myPhone.setPhoneNumber(phoneNumber);

        System.out.print("Who is the owner of the phone? ");
        owner = scan.nextLine();
        myPhone.setOwner(owner);
        System.out.println();

        CellPhone3 herPhone = new CellPhone3();

        System.out.print("What is the second serial number? ");
        serialNumber = scan.nextInt();
        scan.nextLine();
        herPhone.setSerialNumber(serialNumber);

        System.out.print("What model is the phone? ");
        model = scan.nextLine();
        herPhone.setModel(model);

        System.out.print("Who is the carrier? ");
        carrier = scan.nextLine();
        herPhone.setCarrier(carrier);

        System.out.print("What is the phone number? ");
        phoneNumber = scan.nextLine();
        herPhone.setPhoneNumber(phoneNumber);

        System.out.print("Who is the owner of the phone? ");
        owner = scan.nextLine();
        herPhone.setOwner(owner);
        System.out.println();


        System.out.print("What is the third serial number? ");
        serialNumber = scan.nextInt();
        scan.nextLine();

        System.out.print("What model is the phone? ");
        model = scan.nextLine();

        System.out.print("Who is the carrier? ");
        carrier = scan.nextLine();

        System.out.print("What is the phone number? ");
        phoneNumber = scan.nextLine();

        System.out.print("Who is the owner of the phone? ");
        owner = scan.nextLine();

        CellPhone3 theirPhone = new CellPhone3(serialNumber, model, carrier, phoneNumber, owner);

        display(myPhone);
        display(herPhone);
        display(theirPhone);
        System.out.println();

        myPhone.dial(herPhone.getPhoneNumber());
        herPhone.dial(myPhone.getPhoneNumber());
        myPhone.dial(theirPhone.getPhoneNumber());

        herPhone.dial(theirPhone);

        scan.close();
    }

    public static void display(CellPhone3 phone) {
        System.out.println("\nSerial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());
    }
}