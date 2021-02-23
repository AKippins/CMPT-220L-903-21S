import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] numbers2 = new int[10];

        numbers2[3] = 10;
        
        System.out.println(numbers);
        System.out.println(numbers2[3]);
        
        // Reference Type Integer
        Integer[] numbers3 = {1, 2, 3};
        System.out.println(Arrays.toString(numbers3));
        
        ArrayList<Integer> numbers4 = new ArrayList<Integer>();
        LinkedList<Integer> numbers5 = new LinkedList<Integer>();
        
        String name = "Fernando";
        
        Person me = new Person("Aaron", "Kippins", 26, 70);
        
        System.out.println(me.toString());
        System.out.println(me.firstName);
        System.out.println(me.lastName);
        System.out.println(me.age);
        System.out.println(me.height);
        

        
    }
}
