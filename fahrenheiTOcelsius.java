package com.company;

import java.util.Scanner;

public class fahrenheiTOcelsius {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of fahrenheit:");
        float far= sc.nextFloat();
        float cel;
        cel=(far-32)*5/9;
        System.out.println(cel);

    }
}
