package Animals;
import work_with_interfaces.Walk;


public class Popugai implements Walk {


    String color;
    Float weight;
    String species;


    public Popugai(String color, Float weight, String species){
        this.color = color;
        this.weight = weight;
        this.species = species;
    }

    public void walk(){
        System.out.println("Walking popugai");
    }

}

