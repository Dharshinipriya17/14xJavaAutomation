package ex_05_ifelsecondition_task;

import java.util.Scanner;

public class check_eligible_to_vote {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = sc.nextInt();

        if(age>=18)
        {
            System.out.println("Eligible to vote");
        }
        else {
            System.out.println("Not eligible to vote");
        }
    }
}

