import java.io.StringReader;

public class Useless {
    public static void main(String[] args){
        int[] array = {5,6,3,2,4,7,8,9,1,10};
        selectionSort(array);
        printArray(array);
    }
    private static void selectionSort(int[] array){
        for (int i = 0; i < array.length -1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]){
                    array[i] = array[j];
                    array[j] = array[i];
                }
            }
        }
    }
    private static void printArray(int[] array){
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}