package Part_1;

import java.util.*;

public class CounterK {
    private List arrList;
    private Map<Integer, Integer> map = new HashMap<>();

    public CounterK(List arr) {
        this.arrList = arr;
    }

    public void count() {
        arrList.stream()
                .forEach( i -> {
                    int val = 0;
                    if (map.containsKey(i)) {
                        val = map.get(i);
                        map.put((Integer) i, ++val);
                    } else {
                        map.put((Integer) i, ++val);
                    }
                });
        map.forEach((k, v) ->
                System.out.println(k + " -> " + v));
    }

}
