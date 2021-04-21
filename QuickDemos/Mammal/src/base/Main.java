package base;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
//        Mammal bob = new Mammal("Bob", LocalDate.of(1993, 12, 25), true);
//        bob.getInfo();
//        bob.speak();

        Human kipp = new Human("Kipp", LocalDate.of(1994, 8, 10), true, "123-45-6789", "Kippins");
        kipp.getInfo();
        kipp.speak();

        Dog miso = new Dog("Miso", LocalDate.of(2019, 8, 10), true);
        miso.getInfo();
        miso.speak();

        Dog.pee();
    }
}
