import java.util.*;

public static void main (String args[]){
    Scanner sc = new Scanner ();
    int arr[] = new int [];
    int n = sc.nextInt();
    for (int i  =0 ;i <n;i++) arr[i] =sc.nextInt();

    selectionSort( arr , n);
    bubbleSort( arr, n);
    insertionSort( arr, n);
}

public void selectionSort( int[] arr , int n ){
    for (int i = 0; i < n - 1; i++) {
        int mini = i;
        for (int j = i + 1; j < n; j++) {
            if (arr[j] < arr[mini]) {
                mini = j;
            }
        }
        //swap
        int temp = arr[mini];
        arr[mini] = arr[i];
        arr[i] = temp;
    }

    System.out.println("After selection sort:");
    for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println();
}

public void bubbleSort( int[] arr , int n ){
    for (int i = n - 1; i >= 0; i--) {
        for (int j = 0; j <= i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }

    System.out.println("After bubble sort: ");
    for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println();
}

public void insertionSort( int[] arr , int n ){
    for (int i = 0; i <= n - 1; i++) {
        int j = i;
        while (j > 0 && arr[j - 1] > arr[j]) {
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }
    }

    System.out.println("After insertion sort: ");
    for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println();
}