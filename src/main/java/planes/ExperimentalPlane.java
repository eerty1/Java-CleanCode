package planes;

import models.ClassificationLevelOfPlanes;
import models.ExperimentalTypesOfPlanes;

public class ExperimentalPlane extends Plane{

    private ExperimentalTypesOfPlanes experimentalTypesOfPlanes;
    private ClassificationLevelOfPlanes classificationLevelOfPlanes;


    public ExperimentalPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, ExperimentalTypesOfPlanes experimentalTypesOfPlanes, ClassificationLevelOfPlanes classificationLevelOfPlanes) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.experimentalTypesOfPlanes = experimentalTypesOfPlanes;
        this.classificationLevelOfPlanes = classificationLevelOfPlanes;
    }

    public ClassificationLevelOfPlanes getClassificationLevel(){
        return classificationLevelOfPlanes;
    }

    public void setClassificationLevel(ClassificationLevelOfPlanes classificationLevelOfPlanes){
        this.classificationLevelOfPlanes = classificationLevelOfPlanes;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "ExperimentalPlane{" +
                "model='" + model + '\'' +
                '}';
    }
}
