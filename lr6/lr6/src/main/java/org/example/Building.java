package org.example;

public class Building {
    private String address;
    private int floors;
    private double totalArea;
    private int colichestvo;
    public void setColichestvo(int colichestvo){
        this.colichestvo=colichestvo;
    }

    public int getColichestvo() {
        return colichestvo;
    }

    public Building(String address, int floors, double totalArea) {
        this.address = address;
        this.floors = floors;
        this.totalArea = totalArea;
    }
    public Building(String address, int floors, double totalArea, int colichestvo) {
       this(address, floors, totalArea);
        this.colichestvo=colichestvo;
    }

    public String getAddress() {
        return address;
    }

    public int getFloors() {
        return floors;
    }

    public double getTotalArea() {
        return totalArea;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public void setTotalArea(double totalArea) {
        this.totalArea = totalArea;
    }

    public double averageAreaPerFloor() {
        if (floors == 0) {
            return 0;
        }
        return totalArea / floors;
    }
    @Override
    public String toString() {
        return "Здание: адрес = " + address + ", этажей = " + floors + ", общая площадь = " + totalArea + " кв.м";
    }
}
