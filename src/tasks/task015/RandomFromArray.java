package tasks.task015;

class RandomFromArray {
    private static int[] extended_values;

    public RandomFromArray(int[] values, int[] weights) {

        int sum = 0;
        for (int weight : weights) {
            sum += weight;
        }

        extended_values = new int[sum];
        int cursor = 0;

        for(int i = 0; i < weights.length; i++){
            for(int j = 0; j < weights[i]; j++){
                extended_values[cursor++] = values[i];
            }
        }
    }

    public static int getRandom() {
        int random = (int) (Math.random() * ( extended_values.length - 1));
        return extended_values[random];
    }

    public static void main(String[] args){

        int[] value = {1, 2, 3};
        int[] weight = {1, 2, 10};

        RandomFromArray array = new RandomFromArray(value, weight);

        System.out.println(array.getRandom());
    }
}
