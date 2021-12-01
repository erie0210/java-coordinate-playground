package rentcar;

public class Sonata extends Car {

    private static double tripDistanceValue;

    public Sonata(double tripDistance) {
        tripDistanceValue = tripDistance;
    }

    double getDistancePerLiter() {
        return 10;
    }

    double getTripDistance() {
        return tripDistanceValue;
    }

    String getName() {
        return "Sonata";
    }
}
