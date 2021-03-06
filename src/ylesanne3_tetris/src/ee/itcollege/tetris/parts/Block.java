package ylesanne3_tetris.src.ee.itcollege.tetris.parts;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Block extends Rectangle {

    public static final int SIZE = 20;

    public Block(double x, double y) {
        super(x * SIZE, y * SIZE, SIZE, SIZE); // x, y, width, height

        setFill(Color.TEAL);
    }
}
