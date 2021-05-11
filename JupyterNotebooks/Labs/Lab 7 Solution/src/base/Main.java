package base;

public class Main {

    public static void main(String[] args) {
	// write your code here
        DumbList hey = new DumbList();

        hey.add(4);
        hey.add(3);
        hey.add(2);
        hey.add(1);
        System.out.println(hey.length());
        hey.printList();
        hey.delete(3);
        hey.printList();
        System.out.println(hey.length());
        hey.sort();
        hey.printList();
    }
}
