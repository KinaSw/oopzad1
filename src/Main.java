public class Main {


        public static void main(String[] args){
            Segment[] arr = new Segment[2];

                float x1;
                float y1;
                float max = 5;
                float min = 1;
                x1 = (float)(Math.random() * (max - min)+ 1) + min;
                y1 = (float)(Math.random() * (max - min)+ 1) + min;
                SvgScene scene = SvgScene.getScene();

                Shape ellipse = new Ellipse(new Style("yellow", "green", 3), new Vec2(300, 500), 100, 200);
                ellipse = new SolidFillShapeDecorator(ellipse, "purple");
                ellipse = new DropShadowDecorator(ellipse);


                Polygon poly = new Polygon(new Vec2[]{new Vec2(200, 10), new Vec2(550, 50), new Vec2(100, 100)});

                TransformationDecorator.Builder builder = new TransformationDecorator.Builder(new SolidFillShapeDecorator(poly, "red"));
                TransformationDecorator s =
                        builder
                                .rotate(new Vec2(0, 0), 30)
                                .scale(new Vec2(1, 1.5))
                                .build();


                scene.add(s);
                scene.add(ellipse);

                scene.save("result.html");


        }
}
