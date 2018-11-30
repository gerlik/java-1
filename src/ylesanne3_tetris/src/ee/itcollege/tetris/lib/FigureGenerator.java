package ylesanne3_tetris.src.ee.itcollege.tetris.lib;

import ylesanne3_tetris.src.ee.itcollege.tetris.parts.Block;
import ylesanne3_tetris.src.ee.itcollege.tetris.parts.Figure;
import ylesanne3_tetris.src.ee.itcollege.tetris.parts.Figure;

public class FigureGenerator {

    public Figure createFigure() {

        Figure figure = new Figure();

        figure.add(new Block(2, 2));
        figure.add(new Block(1, 2));
        figure.add(new Block(3, 2));
        figure.add(new Block(2, 3));

        return figure;
    }

}
