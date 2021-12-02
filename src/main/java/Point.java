public class Point {
    private final int x;
    private final int y;

    private Point(int x, int y){
        this.x = x;
        if(x < 0 || x > 24){
            throw new IllegalArgumentException();
        }
        this.y = y;
        if(y < 0 || y > 24){
            throw new IllegalArgumentException();
        }
    }

    public double getDistance(Point other){
        return Math.sqrt((x-other.x)*(x-other.x)) + Math.sqrt((y-other.y)*(y-other.y));
    };

    public static Point of(int x, int y){
        return new Point(x, y);
    }
}
