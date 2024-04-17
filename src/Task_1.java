import java.util.Arrays;

public class Task_1 {
    public static void main(String[] args) {
        int arraySize = 10;
        double[] array = new double[arraySize];

        for (int i = 0; i < arraySize; i++) {
            array[i] = Math.random();
        }
        // all массива
        System.out.println("Array of number: " + Arrays.toString(array));

        double max = array[0];
        double min = array[0];
        double sum = 0;

        for (double value : array) {
            if (value > max) {
                max = value;
            }
            if (value < min) {
                min = value;
            }
            sum += value;
        }
        double average = sum / arraySize;

        System.out.println("Max значение: " + max);
        System.out.println("Min значение: " + min);
        System.out.println("average значение: " + average);
    }
}