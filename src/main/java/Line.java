import java.util.List;

public class Line extends AbstractFigure {
    public Line(List<Point> points) {
        super(points);
    }

    @Override
    public List<Point> points() {
        return null;
    }

    @Override
    public int size() {
        return SystemMessage.LINE_POINT_SIZE;
    }

    @Override
    public String getName() {
        return SystemMessage.LINE_NAME;
    }

    @Override
    public double area() {
        return 0;
    }
}
