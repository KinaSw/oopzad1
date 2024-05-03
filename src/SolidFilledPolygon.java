public class SolidFilledPolygon extends Polygon{
    private String fillColor;

    public SolidFilledPolygon(Vec2[] points, String fillColor) {
        super(points);
        this.fillColor = fillColor;
    }



    public String toSvg(String parameters) {
        String f=String.format("fill=\"%s\" %s ", fillColor, parameters);
        return super.toSvg(f);
    }
}