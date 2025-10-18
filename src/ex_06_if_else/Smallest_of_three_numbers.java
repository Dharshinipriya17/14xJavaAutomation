package ex_06_if_else;

import java.util.Scanner;

public class Smallest_of_three_numbers {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 nos");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        if (a < b && a < c) {
            System.out.println(a + " is Smallest");
        } else if (b < a && b < c) {
            System.out.println(b + " is Smallest");
        } else {
            System.out.println(c + " is Smallest");
        }
    }
}

