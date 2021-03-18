package sample;

import sample.shapes.Shape;
import sample.shapes.TypeOfShapes;

import java.util.Arrays;
import java.util.Optional;

public class ShapeFactory {

    public Shape createShapeByName(String name, double startX, double startY, double endX, double endY) {
        Optional<TypeOfShapes> optional = Arrays.stream(TypeOfShapes.values())
                .filter(typeOfShapes -> typeOfShapes.getName().equals(name)).findFirst();
        return optional.map(typeOfShapes -> typeOfShapes.createShape(startX, startY, endX, endY)).orElse(null);
    }
}