package ex_06_if_else;

import java.util.Scanner;

public class Loan_Eligible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age");
        int age= scanner.nextInt();

        System.out.println("Enter salary");
        double sal = scanner.nextDouble();

        System.out.println("Enter credit score");
        int credit_score = scanner.nextInt();

        if(age>=18 && age<=80){
            if(sal>=30000){
                if(credit_score>=650 && credit_score<=850){
                    System.out.println("Eligible for Loan");
                } else {
                    System.out.println("Low Credit Score");
                }
            } else {
                System.out.println("Less Salary");
            }
        } else {
            System.out.println("Age Not Eligible");
        }
    }
}