package ex_05_ifelsecondition_task;

import java.util.Scanner;

public class check_even_odd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        if(n%2==0)
        {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}

