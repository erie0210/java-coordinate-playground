import java.util.List;

public abstract class FigureFactory {
    public static AbstractFigure getInstance(List<Point> points){

        if(points.size()==2){
            AbstractFigure abstractFigure = new Line(points);
            return abstractFigure;
        }

        if(points.size()==3){
            AbstractFigure abstractFigure = new Triangle(points);
            return abstractFigure;
        }

        if(points.size()==4){
            AbstractFigure abstractFigure = new Rectangle(points);
            return abstractFigure;
        }
        return null;
    }
}
