package ex_05_ifelsecondition_task;

import java.util.Scanner;

public class findmaxnum {
   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();

       if(a > b){
           System.out.println("First is greater");
       }else{
           System.out.println("Second is greater");
       }
   }
}


