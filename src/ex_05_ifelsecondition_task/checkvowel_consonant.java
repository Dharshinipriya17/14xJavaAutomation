package ex_05_ifelsecondition_task;

import java.util.Scanner;

public class checkvowel_consonant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character: ");
        String str = sc.next();

        if(str.equalsIgnoreCase("A") || str.equalsIgnoreCase("E")
                || str.equalsIgnoreCase("I")|| str.equalsIgnoreCase("O")
                || str.equalsIgnoreCase("U"))
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonant");
        }
    }
}

