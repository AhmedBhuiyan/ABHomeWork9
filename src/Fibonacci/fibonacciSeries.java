package Fibonacci;

public class fibonacciSeries {
    public static void main(String[] args) {
        int prev=0;
        int next=1;
        for(int i=0;i<20;i++){
            System.out.println(prev);

            prev=prev+next;
            next=prev-next;
        }
    }
}

