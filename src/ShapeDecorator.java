public class ShapeDecorator implements Shape{
    protected Shape decoratedShape;

    public ShapeDecorator(Shape shape) {
        this.decoratedShape = shape;
    }

    @Override
    public String toSvg(String parameters) {
        return decoratedShape.toSvg(parameters);
    }
}
