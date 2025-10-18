package ex_06_if_else;

import java.util.Scanner;

public class Smallest_of_two_numbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=sc.nextInt();
        int b= sc.nextInt();
        if(a<b){
            System.out.println(a+ " is Smallest");
        } else if (b<a) {
            System.out.println(b+ " is Smallest");
        }
        else {
            System.out.println("Both nos are equal");

        }
    }
}
