package sample.shapes;

public enum TypeOfShapes {
    CIRCLE("Circle", new Circle()),
    ELLIPSE("Ellipse", new Ellipse()),
    LINE("Line", new Line()),
    SQUARE("Square", new Square()),
    RECTANGLE("Rectangle", new Rectangle()),
    TRIANGLE("Triangle", new Triangle());

    private final String name;
    private final Shape shape;

    TypeOfShapes(String name, Shape shape) {
        this.name = name;
        this.shape = shape;
    }

    public String getName() {
        return name;
    }

    public Shape getShape() {
        return shape;
    }

    public Shape createShape(double startX, double startY, double endX, double endY) {
        shape.setValues(startX, startY, endX, endY);
        return shape;
    }
}
