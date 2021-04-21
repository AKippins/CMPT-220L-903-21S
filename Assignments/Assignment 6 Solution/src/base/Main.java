package base;

public class Main {

    public static void main(String[] args) {
        Plant philip = new Plant("Pothos", "Philip");
        Plant purple = new Plant("Snake Plant", "Purple");

        philip.setWateringInstructions("Philip is low maintenance and can go a couple weeks without water.");
        philip.getWateringInstructions();

        philip.setSunlightInstructions("Philip does well in medium to bright levels of sunlight.");
        philip.getSunlightInstructions();

        purple.setWateringInstructions("Purple is low maintenance and can go a couple weeks without water.");
        purple.getWateringInstructions();

        purple.setSunlightInstructions("Purple does well in medium to bright levels of sunlight.");
        purple.getSunlightInstructions();

    }
}
