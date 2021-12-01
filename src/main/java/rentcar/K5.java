package rentcar;

public class K5 extends Car {

    private static double tripDistanceValue;

    public K5(int tripDistance) {
        tripDistanceValue = tripDistance;
    }

    double getDistancePerLiter() {
        return 13;
    }

    double getTripDistance() {
        return tripDistanceValue;
    }

    String getName() {
        return "K5";
    }
}