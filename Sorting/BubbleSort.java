class BubbleSort {
  public static void main(String[] args) {
    int[] arr = { 5, 4, 7, 2, 8, 3, 10 };
    // printArray(arr);

    bubbleSort(arr);
    printArray(arr);

  }

  static void bubbleSort(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (arr[j + 1] < arr[j]) {
          swap(arr, j + 1, j);
        }
      }

    }
  }

  static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.printf("%d\t", arr[i]);
    }
  }

  static void swap(int arr[], int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

}