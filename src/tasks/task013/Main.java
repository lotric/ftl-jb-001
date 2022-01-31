package tasks.task013;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args){

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        int n = 3;

        List<Integer> newList = new ArrayList<>();

        for(int i = 0; i < list.size(); i++){
            if(n != list.get(i)){
                newList.add(list.get(i));
            }
        }
        System.out.println(newList);
    }
}
