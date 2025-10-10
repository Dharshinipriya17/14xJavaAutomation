package ex_05_ifelsecondition_task;

import java.util.Scanner;

public class positive_negativecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();

        if(a>0)
        {
            System.out.println("Given number is positive");
        }
        else if (a<0)
        {
            System.out.println("Given number is negative");

        }else
        {
            System.out.println("Given number is zero");
        }
    }
}
