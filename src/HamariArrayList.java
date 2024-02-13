import java.util.Arrays;

public class HamariArrayList {
    int data[];
    int pos = -1;

    public HamariArrayList() {
        data = new int[10];
    }

    public HamariArrayList(int size) {
        data = new int[size];
    }

    public void add(int e) {
        if (pos + 1 >= data.length) {
            int temp[] = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        data[++pos] = e;
    }
    public int remove(int index) {

        if(pos < 0 || index < 0 && index > pos)
            throw new IndexOutOfBoundsException("index does not exist");
        int temp = data[index];
        for(int i = index; i<pos; i++) {
            data[i] = data[i+1];
        }
        pos--;
        return temp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i<=pos; i++) {
            sb.append(data[i]);
            if(i != pos)
                sb.append(",");
        }
        sb.append("]");
        return sb.toString();
    }
}










