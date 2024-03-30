public class Polygon {
    private Point[] points;
    public Polygon(Point[] points){
        this.points = points;
    }
    public Polygon(Polygon polygon){

    }
    public String toSvg(){
        StringBuilder poly = new StringBuilder();
        poly.append("polygon point = \"");
        for(Point point: points){
            poly.append(point.x).append(", ").append(point.y).append(" ");
        }
        poly.append("\" style=\"fill:none;stroke:black;stroke-width:1\"/>\n");
        return poly.toString();
    }
}
