import java.util.List;

public class Triangle extends AbstractFigure {
    public Triangle(List<Point> points) {
        super(points);
    }

    @Override
    public List<Point> points() {
        return null;
    }

    @Override
    public int size() {
        return SystemMessage.TRIANGLE_POINT_SIZE;
    }

    @Override
    public String getName() {
        return SystemMessage.TRIANGLE_NAME;
    }

    @Override
    public double area() {
        return 0;
    }
}
