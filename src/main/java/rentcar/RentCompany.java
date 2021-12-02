package rentcar;

import java.util.List;

public class RentCompany {

    private static final String NEWLINE = System.getProperty("line.separator");

    public static double sonata;
    public static double avante;
    public static double k5;
    public static String report;

    RentCompany() {
        sonata= 0;
        avante=0;
        k5=0;
        report = "";
    }

    public static RentCompany create(){
        return null;
    }

    public static void addCar(Car car){
        report += makeReport(car);
        return;
    }

    public static String generateReport(){
        return report;
    }

    public static String makeReport(Car car){
        return car.getName() + " : " + ((int) car.getChargeQuantity()) + "리터" + NEWLINE;
    }
}