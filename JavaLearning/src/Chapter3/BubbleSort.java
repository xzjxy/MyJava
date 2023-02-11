package Chapter3;

public class BubbleSort {
    //冒泡排序 0-n-1 / 0-n-2..../0-1
    public static void main(String[] args) {
        int[] arr = {0, 23, 45, 76, 12, 5, 90, 0};
//        arr = null;
//        int arr[] = {99};
        if (arr == null) {
            System.out.println(arr);
            return;
        } else if (arr.length == 1) {
            System.out.println(arr[0]);
        } else {
            int temp;
            for (int i = arr.length; i >= 1; i--)
                for (int j = 0; j <= (i - 2); j++)
                    if (arr[j] > arr[j + 1]) {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

}