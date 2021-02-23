public class Person {
    String firstName;
    String lastName;
    Integer age;
    Integer height; // In inches

    Person(String firstName, String lastName, Integer age, Integer height){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;

    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
