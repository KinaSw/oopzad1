import java.util.Locale;

public class SolidFillShapeDecorator extends ShapeDecorator{
    private String color;

    public SolidFillShapeDecorator(Shape shape, String color) {
        super(shape);
        this.color = color;
    }


    public String toSvg(String parameters) {
        String f = String.format(Locale.ENGLISH, " fill=\"%s\" %s", color, parameters);
        return decoratedShape.toSvg(f);
    }
}