package ex_06_if_else;

import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        int a1 = num / 100;  // hundreds
        int a2 = (num / 10) % 10; // tens
        int a3 = num % 10; // units
        int sum = (a1*a1*a1) + (a2*a2*a2) + (a3*a3*a3); // 1³ + 5³ + 3³ = 1 + 125 + 27 = 153
        if (num == sum) {
            System.out.println(num + " is Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }
}