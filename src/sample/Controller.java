package sample;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import sample.shapes.Shape;
import sample.shapes.TypeOfShapes;

public class Controller {

    @FXML
    public ChoiceBox<String> choiceBox;
    @FXML
    public Canvas canvas;
    public Button btnCleanCanvas;

    private ShapeFactory shapeFactory = new ShapeFactory();
    private GraphicsContext graphicsContext;

    private double startXCoordinate = 0;
    private double startYCoordinate = 0;


    @FXML
    void initialize() {
        choiceBox.getItems().add(TypeOfShapes.LINE.getName());
        choiceBox.getItems().add(TypeOfShapes.SQUARE.getName());
        choiceBox.getItems().add(TypeOfShapes.RECTANGLE.getName());
        choiceBox.getItems().add(TypeOfShapes.CIRCLE.getName());
        choiceBox.getItems().add(TypeOfShapes.ELLIPSE.getName());
        choiceBox.getItems().add(TypeOfShapes.TRIANGLE.getName());
        choiceBox.setValue(TypeOfShapes.LINE.getName());

        graphicsContext = canvas.getGraphicsContext2D();
        cleanCanvas();

        btnCleanCanvas.setOnAction(actionEvent -> {
            cleanCanvas();
        });

        mouseEvents();
    }

    private void cleanCanvas() {
        graphicsContext.setFill(Color.WHITE);
        graphicsContext.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
    }

    private void mouseEvents() {
        canvas.addEventHandler(MouseEvent.MOUSE_PRESSED, event -> {
            startXCoordinate = event.getX();
            startYCoordinate = event.getY();
        });

        canvas.addEventHandler(MouseEvent.MOUSE_RELEASED, event -> {
            Shape shape = shapeFactory.createShapeByName(choiceBox.getValue(), startXCoordinate, startYCoordinate, event.getX(), event.getY());
            shape.draw(canvas, graphicsContext);
        });
    }


}