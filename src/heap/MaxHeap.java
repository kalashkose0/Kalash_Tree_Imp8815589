package heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxHeap {
    static List<Integer> heap;

    private static void insert(int data) {
        heap.add(data);
        int i = heap.size() - 1;
        while (i > 1) {
            int parentI = i / 2;
            if (heap.get(parentI) < heap.get(i)) {
                swap(heap, parentI, i);
            }
            i = parentI;
        }
    }

    private static Integer delete() {
        if (heap.size() == 1)
            return null;
        int data = heap.get(1);
        heap.set(1, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);
        int i = 1;

        while (i < heap.size() - 1) {
            int left = 2 * i;
            int right = 2 * i + 1;
            if (right < heap.size()) {
                if (heap.get(left) > heap.get(right) && heap.get(left) > heap.get(i)) {
                    swap(heap, i, left);
                    i = left;
                } else if (heap.get(right) > heap.get(left) && heap.get(right) > heap.get(i)) {
                    swap(heap, i, right);
                    i = right;
                }
            } else if (left < heap.size() && heap.get(left) > heap.get(i)) {
                swap(heap, i, left);
                i = left;
            } else {
                return data;
            }
        }
        return data;
    }

    private static void swap(List<Integer> heap, int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    //convert array to heap
    private static void heapify(int arr[], int i, int size) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < size && arr[left] > arr[largest])
            largest = left;
        if (right < size && arr[right] > arr[largest])
            largest = right;

        if (largest != i) {
            swapArr(arr, i, largest);
            heapify(arr, largest, size);
        }
    }

    private static void swapArr(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    private static void sort(int arr[]) {
        int size = arr.length;
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            heapify(arr, i, arr.length);
        }
        System.out.println(Arrays.toString(arr));
        while (size > 0) {
            swapArr(arr, 0, size - 1);
            size--;
            heapify(arr, 0, size);
        }
    }

    public static void main(String[] args) {
        heap = new ArrayList<>();
        heap.add(0);
        int arr[] = {870, 730, 879, 43, 243, 391, 437, 833, 376, 975, 226, 304, 670, 261, 690, 116, 483};
        for (int a : arr)
            insert(a);
        while (heap.size() > 1)
            System.out.println(delete());









        //        sort(arr);
//        System.out.println(Arrays.toString(arr));

//        System.out.println(heap);
//        while (heap.size() != 1)
//            System.out.println(delete());
    }

}
