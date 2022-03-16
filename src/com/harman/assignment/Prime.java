package com.harman.assignment;

import java.util.Scanner;

public class Prime
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Integer a,b,c,i,j;
        System.out.println("enter lower range");
        a= input.nextInt();
        System.out.println("enter Higher range");
        b = input.nextInt();


        System.out.println("---Prime Numbers from 1 to 100---");
        for(i=a; i<=b; i++)
        {
            c = 0;
            for(j=a; j<i; j++)
            {
                if(i%j==0)
                {
                    c++;
                    break;
                }
            }
            if(c==0)
                System.out.println(i);
        }
    }
}

