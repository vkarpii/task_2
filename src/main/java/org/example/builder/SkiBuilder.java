package org.example.builder;


import org.example.entity.Ski;

public class SkiBuilder {

    private Ski ski;

    public void createNewSki(){
        ski = new Ski();
    }

    public Ski getSki(){
        return ski;
    }
    public void setWoodMaterial(){
        ski.setMaterial("Wood");
        ski.setCost(200);
    }
    public void setPlasticMaterial(){
        ski.setMaterial("Plastic");
        ski.setCost(350);
    }
    public void setJuniorLength(double height){
        ski.setLength(height - 25);
        ski.setName(ski.getMaterial() + "JuniorSki");
        ski.setCost(ski.getCost() - 45 );
    }
    public void setSportLength(double height){
        ski.setLength(height - 15);
        ski.setName(ski.getMaterial() + "SportSki");
        ski.setCost(ski.getCost() + 40 );
    }
    public void setUniversalLength(double height){
        ski.setLength(height + 15);
        ski.setName(ski.getMaterial() + "UniversalSki");
        ski.setCost(ski.getCost() + 25 );
    }

}
