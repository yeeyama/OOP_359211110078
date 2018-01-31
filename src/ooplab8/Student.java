package ooplab8;

import java.util.Date;
// student is Person
// Student is sub-class of person class
// Person is super-class

public class Student extends Person {
    private String id;
    private String program;
    public Student(String name, String gender,
                   String dateOfBirth, int age,
                   String id, String program) {
        super(name, gender, dateOfBirth, age);
        this.id = id;
        this.program = program;
    }
    //toString()


    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", program='" + program + '\'' +
                "} " + super.toString();
    }

    //getter and setter method
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }
}