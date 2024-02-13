import java.util.ArrayList;

public class DyArray {
    private int[] data;
    private int size;
    private int capacity;

    DyArray() {
        size = 0;
        capacity = 16;
        data = new int[capacity];
    }

    DyArray(int initialCapacity) {
        size = 0;
        capacity = initialCapacity;
        data = new int[capacity];
    }

    public void add(int val) {
        if (size == capacity) {
            capacity = capacity * 2;
            int tempData[] = new int[capacity];
            for (int i = 0; i < data.length; i++) {
                tempData[i] = data[i];
            }
            tempData[size++] = val;
            data = tempData;
        } else
            data[size++] = val;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("[");
        for (int i = 0; i < size - 1; i++) {
            res.append(data[i] + ", ");
        }
        res.append(data[size - 1] + "]");
        return res.toString();
    }

    public static void main(String[] args) {
        DyArray arr = new DyArray();
        arr.add(5);
        arr.add(6);
        arr.add(9);
        System.out.println(arr);

    }
}











