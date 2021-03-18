package sample.shapes;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

public class Circle extends Shape {

    protected double radius1;

    @Override
    public void draw(Canvas canvas, GraphicsContext graphicsContext) {
        graphicsContext.setFill(Color.BLUE);
        graphicsContext.fillArc(startCoordinates.getX(), startCoordinates.getY(), radius1, radius1, 0, 360, ArcType.ROUND);
    }

    @Override
    public void setValues(double startX, double startY, double endX, double endY) {
        startCoordinates = new Point(startX, startY);
        radius1 = endX - startX;
    }
}
