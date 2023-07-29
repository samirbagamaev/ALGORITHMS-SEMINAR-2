import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[6];
        for (int i = 0; i < array.length; i++)
            array[i] = new Random().nextInt(10);

        print(array);
        quickSort(array);
        print(array);


    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j])
                    min = j;
            }
            if (min != i) {
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int value = array[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (value < array[j])
                    array[j + 1] = array[j];
                else
                    break;
            }
            array[j + 1] = value;
        }
    }

    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    public static void quickSort(int[] array, int rightBorder) {
        if (rightBorder > array.length - 1)
            quickSort(array, 0, array.length - 1);
        else
            quickSort(array, 0, rightBorder);
    }

    private static void quickSort(int[] array, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = array[(leftBorder + rightBorder) / 2];
        while (leftMarker <= rightMarker) {
            while (array[leftMarker] < pivot)
                leftMarker++;
            while (array[rightMarker] > pivot)
                rightMarker--;
            if (leftMarker <= rightMarker) {
                if (leftMarker != rightMarker) {
                    int temp = array[leftMarker];
                    array[leftMarker] = array[rightMarker];
                    array[rightMarker] = temp;
                }
                leftMarker++;
                rightMarker--;
            }
        }
        if (leftBorder < rightMarker)
            quickSort(array, leftBorder, rightMarker);
        if (leftMarker < rightBorder)
            quickSort(array, leftMarker, rightBorder);
    }

    public static void print(int[] array) {
        for (int i : array)
            System.out.print(i + " ");
        System.out.println();
    }

}