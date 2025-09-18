package ex_03_Operators;

public class Lab0033_Relational_Operators {
    public static void main(String[] args){
        // < Less Than
        // < =  -> Less than or equal to
        // > Greater
        // > = Greater or equal
        // == ->  Equal to (but checking)
        // != -> Not equal

        int a = 10;
        int b = 30;
        boolean c = a > b; // // 10> 30
        System.out.println(c);

        int age_Priya = 25;
        int age_MK = 26;

        boolean result = age_MK >= age_Priya;
        System.out.println(result);
    }
}
