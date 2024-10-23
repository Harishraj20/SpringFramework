package com.jdbc.example.BeanClass;

public class customers {

    private String name;
    private int age;
    private long mobileNumber;
    private String Location;

    public customers(){

    }

    public customers(String Location, int age, long mobileNumber, String name) {
        this.Location = Location;
        this.age = age;
        this.mobileNumber = mobileNumber;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    @Override
    public String toString() {
        return "customers ---> [name=" + name + ", age=" + age + ", mobileNumber=" + mobileNumber + ", Location=" + Location
                + "]";
    }

    
    
}
