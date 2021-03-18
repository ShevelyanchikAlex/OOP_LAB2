package sample.shapes;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public abstract class Shape {

    protected Point startCoordinates;

    public abstract void draw(Canvas canvas, GraphicsContext graphicsContext);

    public abstract void setValues(double startX, double startY, double endX, double endY);
}
