package tasks.task011;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        int n = 5;
        int[] array = new int[n];
        int[] myArray = {4, 2, 6, 1, 5};

        for(int i = 0; i < n; i++){

            for(int j = 0; j < n - 1 - i; j++){
                if(myArray[j] > myArray[j + 1]){
                    int tempValue = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = tempValue;
                }
                System.out.println(Arrays.toString(myArray));
            }

        }
        for(int i = 0; i < n ; i++){
            System.out.print(myArray[i]);
        }
    }
}
