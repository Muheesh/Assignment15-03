package com.harman.assignment;

import java.util.Scanner;

public class Overload {
    public static void main(String[] args) {
        Subclass Obj = new Subclass();
        Scanner input = new Scanner(System.in);
        Integer x,y,z,result1,result2;
        System.out.println("Enter num1");
        x = input.nextInt();
        System.out.println("Enter num2");
        y = input.nextInt();
        System.out.println("Enter num3");
        z = input.nextInt();
        result1 = Obj.task(x,y);
        result2 = Obj.task(x,y,z);
        System.out.println(result1);
        System.out.println(result2);
    }
}
