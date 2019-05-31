import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {

        bubbleSort b = new bubbleSort();
        int[] array = new int[]{10, 3, 4, 5, 6, 6, 7, 8, 98, 76, 54, 1, 32, 6};
        b.bubblesort(array);
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
//            }
//        }
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
}
