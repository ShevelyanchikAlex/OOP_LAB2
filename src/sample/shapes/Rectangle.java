package sample.shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;

public class Rectangle extends Square {

    protected double height;

    @Override
    public void draw(Canvas canvas, GraphicsContext graphicsContext) {
        graphicsContext.setFill(Color.LIGHTGREY);
        graphicsContext.fillRect(startCoordinates.getX(), startCoordinates.getY(), width, height);
    }

    @Override
    public void setValues(double startX, double startY, double endX, double endY) {
        super.setValues(startX, startY, endX, endY);
        height = endY - startY;
    }
}
