

public class QuickSort {
    public static void main(String[] args) {
        int [] arr = {3,5,10,85,49,44,3};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        
        QuickSorting(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }


    public static void QuickSorting ( int [] arr, int low, int high) {
        if (low>high) return;
        int mid = low + (high-low) / 2;
        int pivot = arr[mid];
        int i = low;
        int j = high;

        while (i <= j) {
            while(arr[i] < pivot) {
                i++;
                while(arr[j] > pivot) {
                    j--;
                    if(i <= j) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        i++;
                        j--;
                    }
                }
                if(low < j) {
                    QuickSorting(arr, low, j);
                }
                if (high > i) {
                    QuickSorting(arr, i, high);
                }
            }
        }
    }
}