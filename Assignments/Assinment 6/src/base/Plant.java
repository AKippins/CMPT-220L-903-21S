package base;

public class Plant {
    boolean needsWatering;
    String plantFamily;
    String Name;

    public Plant(String plantFamily,String Name){
        System.out.println("Plant Constructor Ran");
        this.needsWatering = true;
        this.plantFamily =plantFamily;
        this.Name = Name;
    }

    public void wateringInstructions() {
        System.out.println(this.needsWatering);
        System.out.println("Water 3/4ths cup");
    }

    public void sunlightRequirements(){
        System.out.println("put it in partially sunny area");
    }

}
