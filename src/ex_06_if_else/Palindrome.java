package ex_06_if_else;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three digit number");
        int num = sc.nextInt();
        int first = num/100;
        int last = num%10;
        if(first==last){
            System.out.println(num + " is a palindrome"); // 131 is a palindrome
        }
        else {
            System.out.println(num + " is not a palindrome");

        }
    }
}
