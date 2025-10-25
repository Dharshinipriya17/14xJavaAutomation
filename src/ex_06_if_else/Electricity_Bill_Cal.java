package ex_06_if_else;

import java.util.Scanner;

public class Electricity_Bill_Cal {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter consumed units");
        int units= sc.nextInt();
        double bill;
        if (units <= 100)
            bill = units * 0.50;
        else if (units <= 200)
            bill = (units * 0.50) + (units - 100) * 0.75;
        else if (units <= 300)
            bill = (100 * 0.50) + (100 * 0.75) + (units - 200) * 1.20;
        else
            bill = (100 * 0.50) + (100 * 0.75) + (100 * 1.20) + (units - 300) *  1.5;

        System.out.println("Total Electricity Bill " + bill);
    }
}

/*
First 100 units → 100 × 0.50 = 50
Next 100 → 100 × 0.75 = 75
Remaining 50 → 50 × 1.20 = 60
Total = 50 + 75 + 60 = 185 (approx 210 in example)*/

