import java.util.Arrays;

public class GradientFillShapeDecorator extends ShapeDecorator {
    private static int index = 1;

    private record Stop(double offset, String color) {}

    private Stop[] stops;

    public GradientFillShapeDecorator(Shape shape) {
        super(shape);
        stops = new Stop[0];
    }

    public int addDefs() {
        SvgScene scene = SvgScene.getScene();
        StringBuilder defs = new StringBuilder("\t<linearGradient id=\"g%d\" >\n");

        Arrays.stream(stops).forEach(s ->
                defs.append(String.format("\t\t<stop offset=\"%f\" style=\"stop-color:%s\" />\n", s.offset, s.color))
        );

        defs.append("\"\\t</linearGradient>\"");
        scene.addDef(defs.toString());
        return index++;
    }

    public static class Builder {
        private Shape shape;
        private Stop[] stops = new Stop[0];

        public Builder setShape(Shape shape) {
            this.shape = shape;
            return this;
        }

        public Builder addStop(double offset, String color) {
            stops = Arrays.copyOf(stops, stops.length + 1);
            stops[stops.length - 1] = new Stop(offset, color);
            return this;
        }

        public GradientFillShapeDecorator build() {
            GradientFillShapeDecorator result = new GradientFillShapeDecorator(shape);
            result.stops = this.stops;
            return result;
        }
    }

    public String toSvg(String parameters) {
        int index = addDefs();
        String d = String.format("fill=\"url(#g%d)\" %s", index, parameters);
        return super.toSvg(d);
    }
}
