package tasks.task004;

public class Main {

    public static void main(String[] args){
        int result = showAmount(0);

        System.out.println(showAmount(3));
        System.out.println(showAmount(5));
    }

    public static int showAmount(int value) {

        int result = 0;
        for(int i = 1; i <= value; i++){
            result += i;
        }
        return result;
    }
}
