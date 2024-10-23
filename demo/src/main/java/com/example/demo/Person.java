package com.example.demo;

public class Person {
     private Men men;

    public Men getMen() {
        return men;
    }

    public void setMen(Men men) {
        this.men = men;
    }

    void info(){
        System.out.println("Name of the Men: "+men.getName()+" and age: "+men.getAge());
    }

}
