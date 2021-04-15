package base;

import java.time.LocalDate;

public class Human extends Mammal implements Biped {
    String SSN;
    String lastName;

    public Human (String name, LocalDate DOB, boolean hasLegs,  String SSN, String lastName) {
        // I'm calling the constructor in Mammal
        super(name, DOB, hasLegs);
        System.out.println("Human Constructor Ran.");
        this.SSN = SSN;
        this.lastName = lastName;

    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println(this.SSN);
        System.out.println(this.lastName);
        System.out.println(this.isBiped);
        System.out.println(this.numOfLegs);
    }

    @Override
    public void speak() {
        System.out.println("Hey there I'm a human!");
    }
}
