package base;

import java.time.LocalDate;
import java.time.Period;

public abstract class Mammal {
    boolean isMammal;
    String name;
    Integer age;
    LocalDate DOB; // Date of Birth
    boolean hasLegs;

    // Everytime we make a mammal this is going to run.
    public Mammal(String name, LocalDate DOB, boolean hasLegs) {
        System.out.println("Mammal Constructor Ran.");
        this.isMammal = true;
        this.name = name;
        this.DOB = DOB;
        Period age = Period.between(this.DOB, LocalDate.now());
        this.age = age.getYears();
    }

    public void getInfo() {
        System.out.println(this.isMammal);
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.DOB);
    }

    public abstract void speak();
//    {
//        System.out.println("Hello, I am a mammal");
//    }
}
