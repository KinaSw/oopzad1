import java.util.Locale;

public class StrokeShapeDecorator extends ShapeDecorator{
    private String strokeColor;
    private double width;


    public StrokeShapeDecorator(Shape shape, String strokeColor, double width) {
        super(shape);
        this.strokeColor = strokeColor;
        this.width = width;
    }


    public String toSvg(String parameters) {
        String f = String.format(Locale.ENGLISH, "stroke=\"%s\" stroke-width=\"%f\" %s", strokeColor, width, parameters);
        return decoratedShape.toSvg(f);
    }
}