package com.harman.assignment;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Add Obj = new Add();
        Mul Obj1 = new Mul();
        Integer x,y,result1,result2;
        System.out.println("Enter num1");
        x = input.nextInt();
        System.out.println("Enter num2");
        y = input.nextInt();
        result1 = Obj.Add2num(x,y);
        result2 = Obj1.multi(x,y);
        System.out.println(result1);
        System.out.println(result2);

    }

}
