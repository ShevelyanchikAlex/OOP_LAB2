package sample.shapes;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class Triangle extends Shape {

    protected Line line1 = new Line();
    protected Line line2 = new Line();
    protected Line line3 = new Line();

    @Override
    public void draw(Canvas canvas, GraphicsContext graphicsContext) {
        line1.draw(canvas, graphicsContext);
        line2.draw(canvas, graphicsContext);
        line3.draw(canvas, graphicsContext);
    }

    @Override
    public void setValues(double startX, double startY, double endX, double endY) {
        line1.setValues(startX, startY, endX, endY);
        line2.setValues(startX, startY, startX - (endX - startX), endY);
        line3.setValues(startX - (endX - startX), endY, endX, endY);
    }
}
