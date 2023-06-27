package com.examples.design.solid.o.good;

// Open-Close Principle - Good example
public class GraphicEditor {
    public void drawShape(Shape s) {
        s.draw();
    }
}
