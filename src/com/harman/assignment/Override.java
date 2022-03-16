package com.harman.assignment;

public class Override {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.fitness();
    }
}
class Teacher{
    public void knowledge(){
        System.out.println("Graduate");
    }
    public void fitness(){
        System.out.println("Not Applicable");
    }
}
class Student extends Teacher{
    public void fitness(){
        System.out.println("Athletics, Sports, gym");
    }
}
