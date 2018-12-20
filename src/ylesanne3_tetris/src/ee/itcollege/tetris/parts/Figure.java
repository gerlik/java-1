package ylesanne3_tetris.src.ee.itcollege.tetris.parts;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class Figure extends ArrayList<Block> {


    public void move(int deltaX, int deltaY) {

        for (Block block : this) {
            block.setX(block.getX() + deltaX * Block.SIZE);
        }

    }

//        new Block(2,2);
//        new Block(1,2);
//        new Block(2,1);
//        new Block(2,3);

    public void rotate() {
        for (Block block : this) {
            block.setX(block.getY() + 45 - 40);
            block.setY(45 + 40 - block.getX() - Block.SIZE);
            System.out.println(block.getX() + "; " + block.getY());
        }
    }

}





