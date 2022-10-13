package structured.bridge.september19;

import structured.bridge.DrawAPI;

public abstract class Shape {

    DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }
}
