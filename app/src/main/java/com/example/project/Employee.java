package com.example.project;

public class Employee {

    private long empId;
    private String firstName;
    private String lastName;
    private int age;
    private double salary;
    private int occRate;
    private String employeeType;
    private int cpb;
    private String vehicle;
    private String model;
    private String plate;
    private String sidecar;
    private String Color;
    private String carType;

    public Employee(long empId, String firstName, String lastName, int age, double salary, int occRate, String employeeType, int cpb, String vehicle, String model, String plate, String sidecar, String color, String carType) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.occRate = occRate;
        this.employeeType = employeeType;
        this.cpb = cpb;
        this.vehicle = vehicle;
        this.model = model;
        this.plate = plate;
        this.sidecar = sidecar;
        Color = color;
        this.carType = carType;
    }

}
