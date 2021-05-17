package base;

import java.time.LocalDate;

public class Dog extends Mammal {
    public Dog(String name, LocalDate DOB, boolean hasLegs) {
        super(name, DOB, hasLegs);
        System.out.println("Dog Constructor Ran.");
    }

    @Override
    public void speak() {
        System.out.println("Hello, I am Doge!");
    }

    public static void pee(){
        System.out.println("I may have peed on the carpet... Sorry...");
    }
}
