public abstract class Car {

    /**
     * 리터 이동거리. 연비
     */
    abstract double getDistancePerLiter();

    /**
     * 여행하려는 거리
     */
    abstract double getTripDistance();

    /**
     * 차종의 이름
     */
    abstract String getName();

    /**
     * 주입해야할 연료량을 구한다.
     */
    double getChargeQuantity(){
        return getTripDistance()/getDistancePerLiter();
    };
}
