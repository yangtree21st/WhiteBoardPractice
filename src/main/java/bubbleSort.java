import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {

        bubbleSort b = new bubbleSort();
        int[] array = new int[]{10, 3, 4, 5, 6, 6, 7, 8, 98, 76, 54, 1, 32, 6};
        b.BubbleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }


    }




    //    public void bubblesort(int[] unsorted) {
//       boolean swap = true;
//       while(swap)
//           swap = false;
//        for (int i = 0; i < unsorted.length-1; i++) {
//            if(unsorted[i]> unsorted[i+1]){
//            int temp = unsorted[i];
//            unsorted[i] = unsorted[i+1];
//            unsorted[i+1] =temp;
//            swap = true;
//
//        }
//
    //Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order
    public void BubbleSort(int[] anyarray){
        int n = anyarray.length;
//        The outer loop, it decides how many times it will run
        for (int i = 0; i <n-1 ; i++) {
//          The inner loop, stating comparing one by one
            for (int j = 0; j <n-i-1 ; j++) {
               if (anyarray[j] > anyarray[j+1]){
                   int temp = anyarray[j];
                   anyarray[j] = anyarray[j+1];
                   anyarray[j+1] = temp;

               }
            }

        }
    }
//    It can be optimized by stopping the algorithm if inner loop didn’t cause any swap.
    public void bubblesort(int[] unsorted) {
        boolean swapped = true;
        while (swapped) {
            swapped = false;

            for (int i = 0; i < unsorted.length - 1; i++) {

                if (unsorted[i] > unsorted[i + 1]) {
                    int temp = unsorted[i];
                    unsorted[i] = unsorted[i + 1];
                    unsorted[i + 1] = temp;
                    swapped = true;
                }

            }

        }
    }

    public int[] bubbleSort(int[] arr) {
        if (arr == null) {
            return arr;
        }
        //set variable
        boolean flag = true;
        int k = arr.length - 1;
        while (flag) {
            flag = false;
            for (int j = 0; j < k; j++) {
                if (arr[j] > arr[j + 1]) {
                    //交换位置，把大的数放到后边，同时把哨兵置为true
                    flag = true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            k--;
        }
        return arr;
    }
}
