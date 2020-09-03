package com.byGaurav.propertyAndContructorArgs;

import static java.lang.System.out;

public class Student
{
    private int id;
    private String studentName;
    private String address;

    public Student() { }

    public Student(String studentName, int id, String address) {
        this.studentName = studentName;
        this.id = id;
        this.address = address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void displayStudentInfo() {
        out.println("Student name is : " + studentName + "\nand ID is : " + id + "\nand Address is : " + address);
    }
}
