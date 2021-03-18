package sample.shapes;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;


public class Square extends Shape {

    protected double width;

    @Override
    public void draw(Canvas canvas, GraphicsContext graphicsContext) {
        graphicsContext.setFill(Color.LIGHTPINK);
        graphicsContext.fillRect(startCoordinates.getX(), startCoordinates.getY(), width, width);
    }

    @Override
    public void setValues(double startX, double startY, double endX, double endY) {
        startCoordinates = new Point(startX, startY);
        width = endX - startX;
    }
}

