package bridge.september19;

import bridge.DrawAPI;

public abstract class Shape {

    DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }
}
