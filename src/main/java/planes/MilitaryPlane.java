package planes;

import models.MilitaryTypesOfPlanes;


public class MilitaryPlane extends Plane{

    private MilitaryTypesOfPlanes militaryTypesOfPlanes;

    public MilitaryPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, MilitaryTypesOfPlanes militaryTypesOfPlanes) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.militaryTypesOfPlanes = militaryTypesOfPlanes;
    }

    public MilitaryTypesOfPlanes getMilitaryTypesOfPlanes() {
        return militaryTypesOfPlanes;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", type=" + militaryTypesOfPlanes +
                '}');
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
