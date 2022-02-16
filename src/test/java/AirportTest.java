
import org.testng.Assert;
import org.testng.annotations.Test;
import planes.MilitaryPlane;
import planes.PassengerPlane;
import java.util.List;

public class AirportTest extends AirportTestMethods{

    @Test
    public void testIfTransportMilitaryPlanesExist() {
        List<MilitaryPlane> transportMilitaryPlanes =airport.getTransportMilitaryPlanes();
        Assert.assertTrue(!transportMilitaryPlanes.isEmpty());
    }

    @Test
    public void testIfTheExpectedPlaneWithMaxPassengersCapacityEqualsPlaneWithMaxPassengerCapacity() {
        PassengerPlane expectedPlaneWithMaxPassengersCapacity =airport.getPassengerPlaneWithMaxPassengersCapacity();
        Assert.assertTrue(expectedPlaneWithMaxPassengersCapacity.equals(planeWithMaxPassengerCapacity));
    }


    @Test
    public void testIfTheNextPlaneMaxLoadCapacityIsHigherThanCurrent() {
        lookThroughTheCollectionOfPlanesAndCheckPlanesCapacity();
        Assert.assertTrue(nextPlaneMaxLoadCapacityIsHigherThanCurrent);
    }

    @Test
    public void testIfThereIsAtLeastOneBomberInMilitaryPlanes() {
        lookThroughTheCollectionAndFindBomber();
        Assert.assertTrue(bomberIsPresent);
    }

    @Test
    public void testIfExperimentalPlanesHasClassificationCalledUnclassified(){
        lookThroughTheCollectionAndCheckIfExperimentalPlanesHaveUnclassifiedType();
        Assert.assertFalse(hasUnclassifiedPlanes);
    }
}
