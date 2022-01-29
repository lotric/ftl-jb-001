package tasks.task007;

public class Main {

    public static void main(String[] args) {

        String[] myList1 = {"* ", "* ", "* ", "* ", "*"};
        String[] myList2 = {"* ", "* ", "* ", "* ", "*"};
        String[] myList3 = {"* ", "* ", "* ", "* ", "*"};

        for(String element : myList1) {
            System.out.print(element);
        }
        System.out.println();
        for(String element : myList2) {
            System.out.print(element);
        }
        System.out.println();
        for(String element : myList3) {
            System.out.print(element);
        }
        System.out.println();
    }
}
