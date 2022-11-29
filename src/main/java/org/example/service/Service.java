package org.example.service;

public class Service {
    private ServiceStrategy service;

    public void setService(ServiceStrategy service){
        this.service = service;
    }
    public double getCost(){
        return service.getCost();
    }
}
