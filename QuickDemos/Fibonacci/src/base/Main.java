package base;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	    Main example = new Main();
	    System.out.println(example.fibonacci(5));
    }

    private HashMap<Integer, Integer> memoizeTable = new HashMap<>();

    public Integer fibonacci(Integer index) {
        if (index == 0 || index == 1) {
            return 1;
        } else if (this.memoizeTable.containsKey(index)){
            return this.memoizeTable.get(index);
        }
        else {
            Integer result = fibonacci(index - 1) + fibonacci(index - 2);
            this.memoizeTable.put(index, result);
            return result;
        }
    }
}
