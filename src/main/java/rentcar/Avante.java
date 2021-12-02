package rentcar;

public class Avante extends Car{

    private static double tripDistanceValue;

    public Avante(int tripDistance) {
        tripDistanceValue = tripDistance;
    }

    double getDistancePerLiter() {
        return 15;
    }

    double getTripDistance() {
        return tripDistanceValue;
    }

    String getName() {
        return "Avante";
    }
}
