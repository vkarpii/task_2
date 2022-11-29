package org.example.builder;

import org.example.entity.ResortHouse;

public class ResortHouseBuilder {
    private ResortHouse house;
    public void createResortHouse(){
        house = new ResortHouse();
    }

    public ResortHouse getResortHouse(){
        house.setCost(150 * house.getNumberOfRooms());
        return house;
    }
    public void setCommonLevel(){
        house.setNumberOfRooms(1);
        house.setName("CommonHouse");
    }
    public void setPremiumLevel(){
        house.setNumberOfRooms(3);
        house.setName("PremiumHouse");
    }
    public void setEliteLevel(){
        house.setNumberOfRooms(5);
        house.setName("EliteHouse");
    }
}
