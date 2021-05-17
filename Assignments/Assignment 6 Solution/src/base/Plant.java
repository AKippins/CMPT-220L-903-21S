package base;

public class Plant {
    private boolean needsWatering;
    private String plantFamily;
    private String name;
    private String wateringInstructions = "This field hasn't been set yet. If you'd like to set it please use the setWateringInstructions method.";
    private String sunlightInstructions = "This field hasn't been set yet. If you'd like to set it please use the setSunlightInstructions method.";

    public Plant(String plantFamily, String name) {
        this.plantFamily = plantFamily;
        this.name = name;
        // setting this to false to start because i'm assuming if you buy a new plant it won't need to be watered.
        this.needsWatering = false;
    }

    public void toggleNeedsWatering() {
        this.needsWatering = !this.needsWatering;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlantFamily(String plantFamily) {
        this.plantFamily = plantFamily;
    }

    public void setWateringInstructions(String wateringInstructions) {
        this.wateringInstructions = wateringInstructions;
    }

    public void setSunlightInstructions(String sunlightInstructions) {
        this.sunlightInstructions = sunlightInstructions;
    }

    public String getName() {
        return name;
    }

    public String getPlantFamily() {
        return plantFamily;
    }

    public String getWateringInstructions() {
        System.out.println(wateringInstructions);
        System.out.println("The current state of needsWatering is: " + needsWatering);
        return wateringInstructions;
    }

    public String getSunlightInstructions() {
        System.out.println(sunlightInstructions);
        return sunlightInstructions;
    }

    public boolean needsWatering() {
        System.out.println("The current state of needsWatering is: " + needsWatering);
        return needsWatering;
    }
}
