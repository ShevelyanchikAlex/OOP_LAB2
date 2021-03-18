package sample.shapes;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Line extends Shape {

    private Point endCoordinates;

    @Override
    public void draw(Canvas canvas, GraphicsContext graphicsContext) {
        graphicsContext.setStroke(Color.ORANGE);
        graphicsContext.strokeLine(startCoordinates.getX(), startCoordinates.getY(), endCoordinates.getX(), endCoordinates.getY());
    }

    @Override
    public void setValues(double startX, double startY, double endX, double endY) {
        startCoordinates = new Point(startX, startY);
        endCoordinates = new Point(endX, endY);
    }
}
