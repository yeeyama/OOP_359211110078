package ooplab7;
//takking about Student?
//1.Student ID
//2.Name
//3.Address
//4.Gender

public class Student {
    //properties of Student
    private Student id;
    private Student name;
    private Student address;
    private Student gender;
    //Constructor
    //Drfault Canstructor
    public Student (){}
    //Constructor by own
    public Student (String id,String n, String a, String g){
        //assing data to properties
        this.id = id;
        this.name = n;
        this.address = a;
        this.gender = g;
    }//Student
    //getter and setter methods


    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name=" + name +
                ", address=" + address +
                ", gender=" + gender +
                '}';
    }

    public Student getId() {
        return id;
    }

    public void setId(Student id) {
        this.id = id;
    }

    public Student getName() {
        return name;
    }

    public void setName(Student name) {
        this.name = name;
    }

    public Student getAddress() {
        return address;
    }

    public void setAddress(Student address) {
        this.address = address;
    }

    public Student getGender() {
        return gender;
    }

    public void setGender(Student gender) {
        this.gender = gender;
    }
}//class
