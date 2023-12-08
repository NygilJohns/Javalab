package Purejava;
import java.util.Scanner;
public class qiucksort {
	public static void swap(String[] arr, int x, int y) {
    String temp = arr[x];
    arr[x] = arr[y];
    arr[y] = temp;
}

public static int partition(String[] arr, int low, int high) {
    String pivot = arr[low]; 
    int x = low;
    for (int y = low + 1; y <= high; y++) {
        if (arr[y].compareTo(pivot) < 0) {
            x++;
            swap(arr, x, y);
        }
    }
    swap(arr, low, x); 
    return x;
}

public static void quickSort(String[] arr, int low, int high) {
    if (low < high) {
        int pivot = partition(arr, low, high);
        quickSort(arr, low, pivot - 1);
        quickSort(arr, pivot + 1, high);
    }
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the limit: ");
    int limit = sc.nextInt();
    sc.nextLine(); 

    String[] strings = new String[limit];
    System.out.println("Enter the strings:");
    for (int x = 0; x < limit; x++) {
        strings[x] = sc.nextLine();
    }

    quickSort(strings, 0, limit - 1);

    System.out.print("Sorted Strings : ");
    for (int x = 0; x < limit; x++) {
        System.out.print(strings[x]+"  ");
    }
}

}
