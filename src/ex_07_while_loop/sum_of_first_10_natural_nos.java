package ex_07_while_loop;

public class sum_of_first_10_natural_nos {
    public static void main(String[] args){
    int i=1;
int sum=0;
while(i<=10){
sum+=i;
i++;
}
System.out.println(sum);
}
}