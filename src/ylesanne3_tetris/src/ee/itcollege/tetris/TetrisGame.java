package ylesanne3_tetris.src.ee.itcollege.tetris;

import javafx.scene.input.KeyCode;
import ylesanne3_tetris.src.ee.itcollege.tetris.lib.FigureGenerator;
import ylesanne3_tetris.src.ee.itcollege.tetris.parts.Block;
import ylesanne3_tetris.src.ee.itcollege.tetris.parts.Figure;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javax.swing.plaf.basic.BasicSplitPaneUI;

/* Base code from https://github.com/murjam/tetris-fx */

public class TetrisGame extends Application {

    public static final int FIELD_HEIGHT = 30;
    public static final int FIELD_WIDHT = 15;

    public static void main(String[] args) {

        TetrisGame.launch(args);
    }

    FigureGenerator figureGenerator = new FigureGenerator();

    @Override
    public void start(Stage window) throws Exception {
        Figure figure = figureGenerator.createFigure();
        Pane layout = new Pane();
        layout.getChildren().addAll(figure);
        Scene scene = new Scene(layout,
                Block.SIZE * FIELD_WIDHT,
                Block.SIZE * FIELD_HEIGHT);

        scene.addEventHandler(KeyEvent.KEY_PRESSED, event -> {
            if (event.getCode() == KeyCode.RIGHT) {
                figure.move(1, 1);
            } else if (event.getCode() == KeyCode.LEFT) {
                figure.move(-1, 1);
            } else {
                figure.move(0, 0);
            }
            System.out.println(event.getCode());
        });

        window.setOnCloseRequest(e -> System.exit(0));
        window.setScene(scene);
        window.show();
    }


}
