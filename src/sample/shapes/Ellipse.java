package sample.shapes;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

public class Ellipse extends Circle {

    protected double radius2;

    @Override
    public void draw(Canvas canvas, GraphicsContext graphicsContext) {
        graphicsContext.setFill(Color.DARKCYAN);
        graphicsContext.fillArc(startCoordinates.getX(), startCoordinates.getY(), radius1, radius2, 0, 360, ArcType.ROUND);
    }

    @Override
    public void setValues(double startX, double startY, double endX, double endY) {
        super.setValues(startX, startY, endX, endY);
        radius2 = endY - startY;
    }
}
