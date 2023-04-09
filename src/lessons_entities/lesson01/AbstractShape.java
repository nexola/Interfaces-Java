package lessons_entities.lesson01;

import lessons_enums.lesson01.Color;

public abstract class AbstractShape implements Shape {
    private Color color;

    public AbstractShape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

}
