package ex_07_while_loop;

public class multiplication_table_7 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.printf("7 x %d = %d\n", i, (7 * i));
            i++;
        }
    }
}