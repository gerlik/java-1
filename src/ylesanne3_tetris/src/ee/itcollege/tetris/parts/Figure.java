package ylesanne3_tetris.src.ee.itcollege.tetris.parts;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class Figure extends ArrayList<Block> {


    public void move(int deltaX, int deltaY) {

        for (Block block : this) {
            block.setX(block.getX() + deltaX * Block.SIZE);
        }

    }

}





