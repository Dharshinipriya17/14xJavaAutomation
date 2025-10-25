package ex_06_if_else;

import java.util.Scanner;

public class Cal_Bonus_Sal {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Salary: ");
        double sal=scanner.nextDouble();
        System.out.print("Enter years of experience: ");
        int exp=scanner.nextInt();
        double bonus;
        if(exp<1)
            bonus=0;
        else if (exp<=3)
            bonus=0.05*sal;
        else if (exp<=6)
            bonus=0.10*sal;
        else
        bonus = 0.15 * sal;
        System.out.println("Bonus = Rs " +bonus);

    }
}

/*
Enter Sal: 40000
Enter Years of Experience: 5
Bonus = Rs 4000*/