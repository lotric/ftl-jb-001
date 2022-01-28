package tasks.task001;

public class Main {


    //Первый способ
    public static void main(String[] args){
        System.out.println("1 " + "2 " + "3 " + "4 " + "5");

        test();
    }

    //Второй способ
    public static void test(){
        for(int i = 1; i < 6 ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
