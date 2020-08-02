package atari.Model;

import atari.Controller.AreaController;

public class Player {

    public final int WIDTH, HEIGHT;
    public boolean GoUp, GoDown;
    public int locX, locY, score;

    public Player (int width, int height, int locX, int locY) {
        //
        WIDTH = width;
        HEIGHT = height;
        this.locX = locX;
        this.locY = locY;
        //
        score = 0;
        //
        GoDown = false;
        GoUp = false;
    }

    public void update() {
        if (GoUp)
            if (AreaController.areaCheck(locY - 5, HEIGHT))
                locY -= 5;
        if (GoDown)
            if (AreaController.areaCheck(locY + 5, HEIGHT))
                locY += 5;
    }

}