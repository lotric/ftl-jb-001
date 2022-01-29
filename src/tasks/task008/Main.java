package tasks.task008;

public class Main {

    public static void main(String[] args){

        int a = 1;
        int b = 1;
        int c = 0;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for(int i = 1; i <= 9; i++){
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println();
    }
}