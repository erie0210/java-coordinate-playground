import java.util.List;

public class Rectangle extends AbstractFigure {
    public Rectangle(List<Point> points) {
        super(points);
    }

    @Override
    public List<Point> points() {
        return null;
    }

    @Override
    public int size() {
        return SystemMessage.RECTANGLE_POINT_SIZE;
    }

    @Override
    public String getName() {
        return SystemMessage.RECTANGLE_NAME;
    }

    @Override
    public double area() {
        return 0;
    }
}
