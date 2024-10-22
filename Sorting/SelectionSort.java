import java.util.Arrays;

public class SelectionSort {

  public static void main(String[] args) {
    int[] arr = { 5, 4, 7, 2, 8, 3, 10 };

    selectionSort(arr);
    System.out.println(Arrays.toString(arr)); // [2, 3, 4, 5, 7, 8, 10]
  }

  static void selectionSort(int arr[]) {

    int n = arr.length;

    for (int i = 0; i < n - 1; i++) {
      int min_idx = i;
      for (int j = i + 1; j < n; j++) {

        if (arr[j] < arr[min_idx])
          min_idx = j;

      }
      if (min_idx != i)
        swap(arr, i, min_idx);

    }
  }

  static void swap(int arr[], int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

}