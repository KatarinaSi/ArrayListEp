package Part_2;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList<Integer> {
//    private Integer value;
//    private Integer nextValue;
    private Object[] values;
    private int size;
    private int CAPACITY;

    public MyArrayList() {
        this.size = 0;
        this.CAPACITY = 10;
        this.values = new Object[CAPACITY];
    }

    public void add(Integer value) {
        if (size == 0) {
            values[0] = value;
            ++size;
        } else {

            if (CAPACITY < (size * 1.75))
                growCapacity();

            values[this.getSize()] = value;
            ++size;
        }
    }

    public void print(){
        Arrays.stream(values)
                .forEach(i ->{
                    System.out.print(i + " ");
                });
    }

    private void growCapacity() {
        CAPACITY = (CAPACITY * 3) / 2;
        Object[] temporarilyValues = new Object[CAPACITY];
        System.arraycopy(values, 0, temporarilyValues, 0, size);
        values = temporarilyValues;
    }

    public int getSize() {
        return this.size;
    }
}
